import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("car",1978);
        map.put("new_car",2023);

        Set<String> keys = map.keySet();
        System.out.println("Ключи: " + keys);

        System.out.println("Значения: " + map.values());

    }
}