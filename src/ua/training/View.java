package ua.training;

import static ua.training.MultiLang.Messages.*;

/**
 * Basic View class in MVC architectural pattern.
 * @author  Egor Volkov
 * @version 1.0
 * @since   2017-11-12
 */

class View {

    /**
     * Prints message passed.
     * @param message current message to print
     */

    private void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Calls {@link #printMessage(String)} passing current login requesting message.
     */

    void printInputLoginMessage() {
        printMessage(messagesBundle.getString(INPUT_LOGIN_MESSAGE));
    }

    /**
     * Calls {@link #printMessage(String)} passing current login already exists message.
     */

    void printLoginAlreadyExistsMessage() {
        printMessage(messagesBundle.getString(OUTPUT_LOGIN_ALREADY_EXISTS_MESSAGE));
    }

    /**
     * Prints "Login you entered" message.
     * @param login Current login, entered by user
     */

    void printLoginEntered(String login) {
        printMessage(messagesBundle.getString(OUTPUT_LOGIN_YOU_ENTERED) + login);
    }

    /**
     * Calls {@link #printMessage(String)} passing current name requesting message.
     */

    void printInputNameMessage() {
        printMessage(messagesBundle.getString(INPUT_NAME_MESSAGE));
    }

    /**
     * Calls {@link #printMessage(String)} passing current E-mail requesting message.
     */

    void printInputEmailMessage() {
        printMessage(messagesBundle.getString(INPUT_EMAIL_MESSAGE));
    }

    /**
     * Calls {@link #printMessage(String)} passing current email already exists message.
     */

    void printEmailAlreadyExistsMessage() {
        printMessage(messagesBundle.getString(OUTPUT_EMAIL_ALREADY_EXISTS_MESSAGE));
    }

    /**
     * Prints "E-mail you entered" message.
     * @param email Current E-mail, entered by user
     */

    void printEmailEntered(String email) {
        printMessage(messagesBundle.getString(OUTPUT_EMAIL_YOU_ENTERED) + email);
    }

    /**
     * Calls {@link #printMessage(String)} passing current login incorrect message.
     */

    void printOutputLoginIncorrect() {
        printMessage(messagesBundle.getString(OUTPUT_LOGIN_INCORRECT));
    }

    /**
     * Calls {@link #printMessage(String)} passing current name incorrect message.
     */

    void printOutputNameIncorrect() {
        printMessage(messagesBundle.getString(OUTPUT_NAME_INCORRECT));
    }

    /**
     * Calls {@link #printMessage(String)} passing current E-mail incorrect message.
     */

    void printOutputEmailIncorrect() {
        printMessage(messagesBundle.getString(OUTPUT_EMAIL_INCORRECT));
    }
}
