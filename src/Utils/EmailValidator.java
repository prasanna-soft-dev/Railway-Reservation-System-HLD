package Utils;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX =  "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final Pattern patterm = Pattern.compile(EMAIL_REGEX);

    public static boolean isValid(String email){
        return patterm.matcher(email).matches();
    }
}
