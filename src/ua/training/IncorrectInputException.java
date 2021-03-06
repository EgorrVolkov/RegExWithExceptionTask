package ua.training;

/**
 * Special exception that is thrown when user input data already exists in corresponding database.
 * @author  Egor Volkov
 * @version 1.0
 * @since   2017-11-12
 */

class IncorrectInputException extends Exception {

    String userInput;

    IncorrectInputException(String userInput) {
        this.userInput = userInput;
    }

    String getUserInput() {
        return userInput;
    }
}
