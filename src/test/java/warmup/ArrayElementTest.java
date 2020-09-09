package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementTest {

    @Test
    void shouldCreateArrayWithMultiplesOf2AndReplaceMultiplesOf3and5with0() {
        ArrayElement array = new ArrayElement();
        array.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        assertEquals(array.oneDimensionArrayMethod(), "[2, 4, 0, 8, 0, 0, 14, 16, 0, 0]");
    }

    @Test
    void shouldCreate2DimensionalArray() {
        ArrayElement array = new ArrayElement();
        array.set2DArray(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});

        /* it prints each row in each line */
        assertEquals(array.twoDimensionArrayMethod(), "");
    }

    @Test
    void shouldGetMultipleOf3Total(){
        ArrayMultipleOf3Total arr = new ArrayMultipleOf3Total(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        assertEquals(arr.getMultipleOf3Total(), 4);
    }

    @Test
    void shouldGetMultipleOf5Total(){
        ArrayMultipleOf5Total arr = new ArrayMultipleOf5Total(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});

        assertEquals(arr.getMultipleOf5Total(), 4);
    }

    @Test
    void shouldReturnSetMultipleTotalFor2(){
        TwoDimension arr = new TwoDimension(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});
        arr.setMultiple(2);
        assertEquals(arr.getArrTotal(), 40);
    }

    @Test
    void shouldReturnSetMultipleTotalFor8(){
        TwoDimension arr = new TwoDimension(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});
        arr.setMultiple(8);
        assertEquals(arr.getArrTotal(), 16);
    }

    @Test
    void shouldReturnAnySetMultipleTotal(){
        TwoDimension arr = new TwoDimension(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});
        arr.setMultiple(1);
        assertEquals(arr.getArrTotal(), 90);
    }
}