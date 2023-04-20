package ProjectQuestions;

public class Question9 {
    /*
    Write a java program to find the second largest
    number in the array?
     */

    public static void main(String[] args) {

        int highest=0;
        int secondHighest=0;

        int[] array={17,19,5,29,20};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest) {
                secondHighest = array[i];

            }
        }
        System.out.println("Second highest number"+" "+secondHighest);
}}
