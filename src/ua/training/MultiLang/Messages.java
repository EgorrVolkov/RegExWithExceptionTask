package ua.training.MultiLang;

import java.util.Locale;
import java.util.ResourceBundle;

public interface Messages {

    String MESSAGES_BUNDLE_NAME = "messages";

    /**
     * {@code messagesBundle} used for operating a messages bundle corresponding to current language.
     * new Locale("en") for English, new Locale("ru") for Russian.
     */

    ResourceBundle messagesBundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en"));

    String INPUT_LOGIN_MESSAGE = "input.login";
    String INPUT_NAME_MESSAGE = "input.name";
    String INPUT_EMAIL_MESSAGE = "input.email";
    String OUTPUT_LOGIN_INCORRECT = "output.login.incorrect";
    String OUTPUT_LOGIN_ALREADY_EXISTS_MESSAGE = "output.login.already.exists";
    String OUTPUT_LOGIN_YOU_ENTERED = "output.login.you.entered";
    String OUTPUT_NAME_INCORRECT = "output.name.incorrect";
    String OUTPUT_EMAIL_INCORRECT = "output.email.incorrect";
    String OUTPUT_EMAIL_ALREADY_EXISTS_MESSAGE = "output.email.already.exists";
    String OUTPUT_EMAIL_YOU_ENTERED = "output.email.you.entered";
}