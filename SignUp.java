import java.io.FileNotFoundException;
import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) throws FileNotFoundException {
        //String userName;
        

        Scanner signup = new Scanner(System.in);


        System.out.println("Geben sie ihren Benutzernamen an. \n");
        String userName = signup.nextLine();
        //System.out.println(userName);

        System.out.println("Geben sie ihr Passwort ein. \n");
        String passWord = signup.nextLine();
        //System.out.println(passWord);

        /**
         * returns the password as a String of chars
         */
        int passWordLength = passWord.length();
        System.out.println(passWordLength);
        String passWordStar = "";        
        for(int i = 0;i<passWordLength;i++){
            passWordStar = (passWordStar + "*");
        }
        System.out.println(passWordStar);

        Password pass = new Password(userName,passWord);
        pass.newUser(userName, passWord);



        signup.close();


    }    
}