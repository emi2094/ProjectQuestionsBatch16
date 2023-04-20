package ProjectQuestions;

public class Question7 {
    /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int third;

        for (int i = 0; i <=10; i++) {

            System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }

    }
}
