import java.util.*;
import java.nio.charset.Charset;
public class DemoShowDefaultCharset {
 
    public static void main(String[] args) {
         SortedMap<String,Charset> availableCharsets = Charset.availableCharsets();
            Set<String> keySet = availableCharsets.keySet();
            for (String key : keySet) {
                System.out.println(key);
            }

    }
}

