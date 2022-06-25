import java.util.Arrays;

public class IntroToArrays{
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println(numbers);
        String printArray = Arrays.toString(numbers);
        System.out.println(printArray);

        String[] instructors = {"Derek", "Sam", "Brian", "Nate", "Terrell", "Shoha"};
        // Accessing Data
        System.out.println(instructors[1]);
        // Updating Data
        instructors[1] = "Kevin";
        System.out.println(instructors[1]);



        // looping over an array
        for(int i = 0; i<instructors.length; i++){
            System.out.println(instructors[i]);

        }
        // Adding elements to the array
        String[] updateInstructors = new String[7];
        System.out.println(Arrays.toString(updateInstructors));
        for(int i = 0; i<instructors.length; i++){
            updateInstructors[i] = instructors[i];

        }
        updateInstructors[6] = "Sam";
        System.out.println(Arrays.toString(updateInstructors));

        String[] copyOfInstructors = instructors;
        System.out.println(instructors);
        System.out.println(copyOfInstructors);
        copyOfInstructors[0] = "tatyana";
        System.out.println(Arrays.toString(instructors));
        System.out.println(Arrays.toString(copyOfInstructors));

        String[] copyTwo = instructors.clone();
        copyTwo[0] = "Joel";
        System.out.println(Arrays.toString(instructors));
        System.out.println(Arrays.toString(copyTwo));

        
    }
}