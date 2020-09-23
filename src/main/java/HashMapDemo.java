import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Alice", 52);
        ages.put("Bob", 24);

        Integer aliceAge = ages.get("Alice");

        String output = "Alice's age is " + aliceAge.toString();
        System.out.println(output);
    }
}
