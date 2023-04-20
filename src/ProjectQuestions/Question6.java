package ProjectQuestions;

public class Question6 {
    /*
    Write a java program to check whether a given number is prime or not?   `
     */

    public static void main(String[] args) {
        int num=20;
        int counter=0;
        for (int i = 1; i <=num; i++) {
            if (num%i==0){
                counter++;
            }

        }
        if (counter==2) {
            System.out.println("Prime number");
        }else{

        }
        System.out.println("Not a Prime number");


    }
}

