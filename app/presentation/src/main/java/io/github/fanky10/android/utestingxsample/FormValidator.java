package io.github.fanky10.android.utestingxsample;

import java.util.regex.Pattern;

/**
 * Created by facundo.scoccia on 8/10/17.
 */

public class FormValidator {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isEmail(String target) {
        if (target == null || target.length() == 0) {
            return false;
        }
        return pattern.matcher(target).matches();
    }
}
