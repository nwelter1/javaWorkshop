public class Math {
    public static void main(String[] args) {
        // common math operations
        int age = 30;
        System.out.println("Happy Birthday");
        // overwriting exisint gdata in a variable
        age = 31;
        System.out.println("You are now " + age);
        // incrementing ++ += operators
        System.out.println("Happy Birth again!");
        age++;
        System.out.println("You are now " + age);
        System.out.println("Whoa, a decade has passed! You are now....");
        age += 10;
        System.out.println(age);

        // decreasing -- -= operators
        int daysUntilSummer = 10;
        daysUntilSummer--;
        System.out.println("Another day has passed! only " + daysUntilSummer + " days left!");
        daysUntilSummer -= 9;
        System.out.println("Summer is here! " + daysUntilSummer + " days left!");

        // Basic Math +, -, *, /, %
        System.out.println("2 + 2 = " + (2+2));
        System.out.println("2 - 2 = " + (2-2));
        System.out.println("2 * 2 = " + (2*2));
        System.out.println((20/6));
        System.out.println("10 % 3 = " + (10%3));

        int x = 13;
        double y = 12.2;
        System.out.println(x+y);

    }
}
