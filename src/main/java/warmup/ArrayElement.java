package warmup;

import java.util.Arrays;

public class ArrayElement extends ArrayInput {

    public String oneDimensionArrayMethod(){

        int[] array = new int[10];
        int replace = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1)*2;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 3 == 0) || (array[i] % 5 == 0)) {
                array[i] = replace;
            }
        }
        return Arrays.toString(array);
    }

    public int[][] twoDimensionArrayMethod(){

        int[][] array = new int[10][10];
        int replace = 0;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                num ++;
                array[i][j] = j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i][j]; j++) {
                num ++;
                array[i][j] = (num) *2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if ((array[i][j] % 3 == 0) || (array[i][j] % 5 == 0)) {
                    array[i][j] = replace;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        ArrayElement arr = new ArrayElement();
        arr.set2DArray(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});

        System.out.println(Arrays.deepToString(arr.twoDimensionArrayMethod()));
    }
}
