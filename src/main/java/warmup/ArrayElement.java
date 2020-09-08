package warmup;

import java.util.Arrays;

public class ArrayElement extends ArrayInput {

    public String arrayMethod(){

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


    public static void main(String[] args) {
    }

}
