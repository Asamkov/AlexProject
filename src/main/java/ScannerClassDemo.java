
import java.io.*;

public class ScannerClassDemo {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\fujitsu\\IdeaProjects\\alex-app2\\src\\main\\java\\Alex.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}