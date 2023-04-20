package ProjectQuestions;

public class Question5 {
    /*
    Write a program to swap 2 numbers without a temporary variable?
     */
    public static void main(String[] args) {
        int x = 20;
        int y = 22;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
