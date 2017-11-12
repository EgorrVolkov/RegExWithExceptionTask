package ua.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic Model class in MVC architectural pattern.
 * @author  Egor Volkov
 * @version 1.0
 * @since   2017-11-12
 */

class Model {

    private List<String> loginDB = new ArrayList<>();
    private List<String> nameDB = new ArrayList<>();
    private List<String> emailDB = new ArrayList<>();

    /**
     * Constructs model instance, adding temporary values for database imitation.
     */

    Model() {
        loginDB.add("Egorator");
        nameDB.add("Egor");
        emailDB.add("Egorator1996@gmail.com");
    }

    /**
     * Adds user login to the login database.
     * @param loginInput login entered by user
     * @throws IncorrectInputException if such login already exists
     */

    void setLogin(String loginInput) throws IncorrectInputException {
        for (int i = 0; i < loginDB.size(); i++)
            if (loginInput.equals(loginDB.get(i)))
                throw new IncorrectInputException(loginInput);
        loginDB.add(loginInput);
    }

    /**
     * Adds user name to the name database.
     * @param nameInput name entered by user
     */

    void setName(String nameInput) {
        nameDB.add(nameInput);
    }

    /**
     * Adds user E-mail to the E-mail database.
     * @param emailInput E-mail entered by user
     * @throws IncorrectInputException if such E-mail already exists
     */

    void setEmail(String emailInput) throws IncorrectInputException {
        for (int i = 0; i < emailDB.size(); i++) // no foreach, we need emailDB.get(i), not String value!
            if (emailInput.equals(emailDB.get(i)))
                throw new IncorrectInputException(emailInput);
        emailDB.add(emailInput);
    }
}
