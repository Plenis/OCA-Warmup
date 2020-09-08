package warmup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementTest {

    @Test
    void shouldCreateArrayWithMultiplesOf2AndReplaceMultiplesOf3and5with0(){
        ArrayElement array = new ArrayElement();
        array.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        assertEquals(array.oneDimensionArrayMethod(), "[2, 4, 0, 8, 0, 0, 14, 16, 0, 0]");
    }

    @Test
    void shouldCreate2DimensionalArray(){
        ArrayElement array = new ArrayElement();
        array.set2DArray(new int[][]{{1, 2, 3, 4}, {1, 3, 2, 3}});

        array.oneDimensionArrayMethod();
        assertEquals(Arrays.deepToString(array.twoDimensionArrayMethod()), "[[0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0], [0, 1, 2, 0, 4, 0, 0, 7, 8, 0]]");
    }

}