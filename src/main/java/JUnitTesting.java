import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JUnitTesting {
    public static void main (String args[]) {
        Scanner sc = new Scanner( System.in );
        String password;
        System.out.println( " enter password which contains minimum 8 characters & should have at least 1 upper case: " );
        password = sc.nextLine();
        confirmpassword( password );
    }

    public static boolean confirmpassword (String password) {
        Pattern pattern = Pattern.compile( "^(?=.*[A-Z])(?=.*[A-Za-z]).{8,}$" );
        Matcher matcher = pattern.matcher( password );
        if (matcher.matches()) {
            System.out.println( " format of password is correct " + password );
        } else {
            System.out.println( " format of password is incorrect." );
        }
        return true;
    }
}

