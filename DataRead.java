import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataRead {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/temp/UserData.txt");
        File sendFile = new File("C:/temp/UserDataSend.txt");
        PrintWriter pWriter = null;
        pWriter = new PrintWriter(new FileWriter(sendFile));
        
        Scanner scanner = new Scanner(file);
        ArrayList<Sentence> sentences = new ArrayList<>();
        String name;
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[]tokens = line.split(";");
            name = tokens[0];
            String verb = tokens[1];
            String adjectiv = tokens[2];
            Sentence s =new Sentence(name,verb, adjectiv);
            sentences.add(s);
            System.out.println( sentences.get(0).getString(name));
            pWriter.write(name+";");

            System.out.println( sentences.get(0).getString(verb));
            pWriter.write(verb+";");

            System.out.println( sentences.get(0).getString(adjectiv));
            pWriter.write(adjectiv+";\n");
        }
        
        scanner.close();
        int j = sentences.size();
        System.out.println(j);
        String g = "Hallo";
        g.length();
        pWriter.close();
    }
}