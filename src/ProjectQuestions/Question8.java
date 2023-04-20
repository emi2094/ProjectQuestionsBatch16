package ProjectQuestions;

public class Question8 {
    /*
    Maximum and minimum number in the array?
     */
    public static void main(String[] args) {
        int[]num={17,19,5,29,20};
            int max=num[0];
            int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Maximum   "+max+" "+"Minimum  "+min);
    }
}
