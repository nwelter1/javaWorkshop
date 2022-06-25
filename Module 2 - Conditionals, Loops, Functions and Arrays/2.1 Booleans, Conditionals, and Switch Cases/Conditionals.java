public class Conditionals {
    public static void main(String[] args) {
        int grade = 70;
        if(grade > 90){
            System.out.println("Congrats, you got an A!");
        }else if(grade >= 80){
            System.out.println("You got a B!");
        }else if(grade >= 70){
            System.out.println("You got a C!");
        }else if(grade >= 60){
            System.out.println("You got a D!");
        }else{
            System.out.println("You got an F!");
        }
        String name = "Coding Temple";
        if(name.equals("Coding Temple")){
            System.out.println("Congrats, you chose correctly!");
        }else{
            System.out.println("Wrong School!");
        }
        // Logical Operators and / or
        // OR is ||
        // AND is &&
        int mathGrade = 80;
        int bioGrade = 79;
        if(mathGrade >= 80 && bioGrade >= 80){
            System.out.println("You got a B average or Above!");
        }
        if(mathGrade >= 80 || bioGrade >= 80){
            System.out.println("You got at least one B!");
        }
    }

    
}
