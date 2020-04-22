import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Password {

    public Password(String userName,String passWord) throws FileNotFoundException {
    }

    private String userName;
    private String passWord;

    public void newUser(String userName, String passWord) throws FileNotFoundException {
        setPassword(passWord);
        setUserName(userName);
        insertUser(userName, passWord);

    }

    private String getPassword() {
        return passWord;
    }

    private void setPassword(String passWord) {
        this.passWord = passWord;
    }

    private String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private void insertUser(String userName, String passWord) throws FileNotFoundException {
        File insertion = new File("/Insertion.txt");
        String line = (userName+";"+passWord);

        PrintWriter printWriter = new PrintWriter(insertion) ;
        printWriter.write(line +"\n");   
        
        printWriter.close();
    }
}