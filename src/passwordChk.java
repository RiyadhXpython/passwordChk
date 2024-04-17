public class passwordChk {

    public static void main(String[] args) {
        passwordChecker("aa@5J90b"); // passwordInvalid
        passwordChecker("m2aa@5J90p"); // passwordInvalid
        passwordChecker("2aa@5&90B"); // passwordValid
    }

    public static void passwordChecker(String password) {
        // Check if the password contains 9 characters or not
        if (password.length() < 9) {
            System.out.println("Password Invalid!! Password must be at least 9 characters");
            return;

        }
        // Check if the password has at least one lowercase and one uppercase letter
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }
        if (!hasLowerCase || !hasUpperCase) {
            System.out.println("Password Invalid!! Password must be one Uppercase or one lowercase");
            return;
        }
        boolean hasNumberOnly = false; // Checking if the password has at least one number or not
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasNumberOnly = true;
                break;
            }
        }
        if (!hasNumberOnly) {
            System.out.println("Password invalid!! Password must be contain at least one number");
        }
        // Checking if the password has at least one alphanumeric character
        boolean hasAlphaNumericOnly = false;
        for (char ch : password.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                hasAlphaNumericOnly = true;
                break;
            }
        }
        if (!hasAlphaNumericOnly) {
            System.out.println("Password invalid!! Password must be contain alphanumeric characters");
            return;
        }
        System.out.println("Password Valid. "); // if password is valid and meets the requirements above
    }
}
