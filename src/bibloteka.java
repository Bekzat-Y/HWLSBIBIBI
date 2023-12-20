import java.util.HashMap;
import java.util.Map;

public class bibloteka {
    public static void main(String[] args) {


    Map<String, Integer> contactBook = new HashMap<>();

    contactBook.put("Иванов",123);

    contactBook.put("Сергей",987);

    contactBook.put("Сидоров",555);

        System.out.println(contactBook);
    }
}
