public class TypeCasting {
    public static void main(String[] args) {
        double salary = 150000.9999993;
        System.out.println("My salary is $" + salary);
        int roundSalary = (int) salary;
        System.out.println("My salary is $" + roundSalary);
        double unroundSalary = (double) roundSalary;
        System.out.println("My salary is $" + unroundSalary);

        // string
        String strSalary = "22000.09";
        double convertedSalary = Double.parseDouble(strSalary);
        System.out.println("My salary is $" + (convertedSalary + 1000));

        String cash = "180";
        int intCash = Integer.parseInt(cash);
        System.out.println("My salary is $" + (intCash + 1000));
    }
}
