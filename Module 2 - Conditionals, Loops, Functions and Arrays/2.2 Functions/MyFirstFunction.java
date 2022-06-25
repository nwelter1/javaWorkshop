public class MyFirstFunction {
    static String name = "Nate";
    public static void main(String[] args) {
        if(findArea(5,2) > 10){
            System.out.println("Too big for this house!");
        }else{
            System.out.println("Good to go boss!");
        }
        ;
        System.out.println(Math.random());
    }
    // access level, ,return type, ,function name, (parameters)
    /**
     * <p>Function name: findArea<p>
     * <p>
     * Details: function prints the area of a rectangle given a length and width
     * </p>
     * @param length (int)
     * @param width (int)
     * 
     *  
     */
    public static int findArea(int length, int width){
        return length*width;
    }
}
