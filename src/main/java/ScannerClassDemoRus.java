import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ScannerClassDemoRus {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("C:\\Users\\fujitsu\\IdeaProjects\\alex-app2\\src\\main\\java\\Alex.txt",
                StandardCharsets.UTF_8))
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