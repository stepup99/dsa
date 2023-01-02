import java.util.HashMap;

public class HashMapClass {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        System.out.println(map.get("key1"));
        System.out.println(map.get("key2"));
        System.out.println(map.get("key3"));

    }
}
