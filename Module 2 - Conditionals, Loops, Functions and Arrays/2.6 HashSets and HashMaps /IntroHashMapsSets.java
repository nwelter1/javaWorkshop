import java.util.HashMap;
import java.util.HashSet;

public class IntroHashMapsSets {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        // Entering data
        map.put("Name", "Coding Temple");
        System.out.println(map);
        map.put("Address", "555 W Ontario Street");
        System.out.println(map);
        map.put("Years", 3);
        System.out.println(map);
        // Accessing Data
        Object name = map.get("School");
        System.out.println(name);
        // Removing Data
        map.remove("Name");
        System.out.println(map);

        // Updating Data
        map.put("Address", "333 Fake Street");
        System.out.println(map);

        // Increment value given a key
        map.put("Years", (int) map.get("Years") + 1);
        System.out.println(map);

        // membership check
        System.out.println(map.containsKey("Years"));

        // Looping over keys
        for(String key: map.keySet()){
            System.out.println(key);
        }
        //looping over values
        for(Object val: map.values()){
            System.out.println(val);
        }
        // getting both
        for(String key: map.keySet()){
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        HashSet<String> set = new HashSet<String>();
        System.out.println(set);
        // adding items
        set.add("Coding");
        set.add("Temple");
        set.add("Rules");
        System.out.println(set);
        // removing items
        set.remove("Coding");
        System.out.println(set);
        // membership check
        System.out.println(set.contains("Temple"));
        // clearing the set
        // set.clear();
        System.out.println(set);

        // looping
        for(String val: set){
            System.out.println("Value: " + val);
        }

    }
}
