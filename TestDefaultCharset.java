import java.util.*;
import java.nio.charset.Charset;
public class TestDefaultCharset {
 
    public static void main(String[] args) {
         System.setProperty("file.encoding","ASCII");
         System.out.println("My project encoding is : "+ Charset.defaultCharset());

         System.setProperty("file.encoding","UTF-8");
         System.out.println("My project encoding is : "+ Charset.defaultCharset());
    }
}

