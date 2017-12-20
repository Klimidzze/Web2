import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        vvod(result, 10, 0);
        vuvod(result, 15);
        vvod(result, 5, 5);
        result.forEach(System.out::println);
    }
    private static void vvod(List<String> target, int string, int half) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (string > 0) {
            try {
                if(target.size() > half) target.set(half, reader.readLine());
                else target.add(half, reader.readLine());
                half ++;
                string --;
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
    private static void vuvod(List<String> target, int string) {
        while(string -- < 0) {
            target.add(0, target.remove(target.size() - 1));
        }
    }
}