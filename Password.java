
public class Password {

    public Password(){}
    private String userName;
    private String passWord;

    public void newUser(String userName,String passWord){
        setPassword(passWord);
        setUserName(userName);
    }

    

    private String getPassword(){
        return passWord;
    }
    private void setPassword(String passWord){
        this.passWord = passWord;
    }

    private String getUserName(){
        return userName;
    }

    private void setUserName(String userName){
        this.userName = userName;
    }
}