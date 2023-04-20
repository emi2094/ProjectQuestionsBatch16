package ProjectQuestions;

public class Question4 {
    /*
     Create a 2D array of integers. Develop a program which will calculate the sum of even
     and odd numbers for that array.
     */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5},
                {19, 17, 5, 29, 20}};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    even += array[i][j];
                } else {
                    odd += array[i][j];


                }

            }
        }
        System.out.println(even);
        System.out.println(odd);
    }}
