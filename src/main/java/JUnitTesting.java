import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitTesting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String emailId;
        // Eg -> abc.xyz@bl.co.in
        System.out.println(" enter email address with precise @ and . positions: ");
        emailId = sc.nextLine();
        confirmEmailAddress(emailId);
    }

    public static boolean confirmEmailAddress(String emailId) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println(" format of email address is correct " + emailId);
        } else {
            System.out.println(" format of email address is incorrect.");
        }
        return false;
    }
    }

