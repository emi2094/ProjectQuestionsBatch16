package ProjectQuestions;

public class Question2 {
    /*
    Create an array of integer values. After the array is created,
    calculate the sum of all stored elements in that array.
     */
    public static void main(String[] args) {
        int[]array={19,17,5,29,20};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];

        }
        System.out.println("The total is"+" "+sum);
    }
}
