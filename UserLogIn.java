import java.util.Scanner;

class UserLogin {

        public static void main(String[] args){
        //String userName;
        

        Scanner login = new Scanner(System.in);
        System.out.println("Geben sie ihren Benutzernamen an. \n");
        String userName = login.nextLine();
        System.out.println(userName);

        System.out.println("Geben sie ihr Passwort ein. \n");
        String passWord = login.nextLine();
        System.out.println(passWord);
        int passWordLength = passWord.length();
        System.out.println(passWordLength);
        String passWordStar = "";
        for(int i = 0;i<passWordLength;i++){
            passWordStar = (passWordStar + "*");
        }
        System.out.println(passWordStar);


        login.close();
    }   
}