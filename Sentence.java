import java.util.ArrayList;

public class Sentence {
    ArrayList<String> satz = new ArrayList<>();
public Sentence(String a,String b, String c){
    String d = (a+" "+b+" "+c);
    getString(d);
    
}
public String getString(String d)
{
    
    System.out.println(d);
    satz.add(d);
    return d;
}

}