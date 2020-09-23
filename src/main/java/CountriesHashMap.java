import java.util.HashMap;

public class CountriesHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> populations = new HashMap<String, Integer>();

        populations.put("UK", 64100000);
        populations.put("Germany", 80620000);
        populations.put("France", 66030000);
        populations.put("Japan", 127300000);

        Integer germanyPopulation = populations.get("Germany");

        String output = "Germany's population is " + germanyPopulation.toString();
        System.out.println(output);
        String output2 = "The populations are " + populations.values();
        System.out.println(output2);
        String output3 = "The countries are " + populations.keySet();
        System.out.println(output3);
    }
}