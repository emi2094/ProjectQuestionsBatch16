package ProjectQuestions;

public class Question3 {
    /*
    Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int[][]array={{1,2,3,4,5},
                  {19,17,5,29,20} };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num=array[i][j];
                if (num%2==0){
                    System.out.println(num+" ");
                }

            }

        }
    }
}
