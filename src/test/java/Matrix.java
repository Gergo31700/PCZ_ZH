import java.util.ArrayList;

public class Matrix {
    public static int sumOfNumbersDivisibleByFive(int[][] matrix) {

        int sum =0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 5 ==0) {


                    sum+=matrix[i][j];


                }

            }

        }


        return sum;
    }




    public  static boolean rowColEquuals(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = 0;
            if (x != array[i]) {
                return false;
            }

        }
        return true;
    }
    public static ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix) {



        ArrayList<Integer> cuc = new ArrayList<>();



        for (  int i = 0; i < matrix.length; i++) {
            if (rowColEquuals(matrix[i])){
                cuc.add(i);
            }
        }


        System.out.println("Row index  is "+cuc.get(0));
        return cuc;
    }

}
