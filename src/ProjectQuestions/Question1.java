package ProjectQuestions;

public class Question1 {
    /*
    1. Create a program that uses an array to store a list of temperatures for a week,
     and then uses a loop to find the highest and lowest temperature for the week.
     */

    public static void main(String[] args) {

        int[]temp={76,87,89,78,68,64,64};
        int highest=temp[0];
        int lowest=temp[0];
        for (int i = 0; i < 7; i++) {
            if (highest<temp[i]){
                highest=temp[i];
            }
            if (lowest>temp[i]){
                lowest=temp[i];
            }
        }
        System.out.println("The highest temperature of the week is"+" "+highest);
        System.out.println("The lowest temperature of the week is"+" "+lowest);

    }

}
