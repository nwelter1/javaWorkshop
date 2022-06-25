import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int evens = 0;
        while(i < 100 && evens < 40){
            System.out.println(i);
            if(i % 2 == 0){
                evens++;
                System.out.println("Evens: " + evens);
                i += 2;
            }else{
                i++;
            }
        }
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a number. If you enter a number over 1000, program will terminate:");
            int input = scan.nextInt();
            if(input > 1000){
                break;
            }
            System.out.println("Great choice! Your number is " + input);


        }
        scan.close();
    }
}
