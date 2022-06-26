import java.util.ArrayList;
import java.util.Arrays;

public class FirstArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println(numbers);
        // Adding items (appending)
        numbers.add(67);
        numbers.add(52);
        numbers.add(6);
        System.out.println(numbers);
        // reassign a value (get the value and change it)
        System.out.println(numbers.get(1));
        numbers.set(1, 67);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        // numbers.clear();
        // System.out.println(numbers);

        // looping
        for(int num: numbers){
            System.out.println(num);
        }
        for(int i = 0; i< numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        // Creating an ArrayList with items inside of it already
        ArrayList<String> names = new ArrayList<String>(
            Arrays.asList("Jesse", "Adam", "Samantha", "Juan")
        );
        System.out.println(names);
    }
}
