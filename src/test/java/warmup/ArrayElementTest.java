package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayElementTest {

    @Test
    void shouldCreateArrayWithMultiplesOf2AndReplaceMultiplesOf3and5with0(){
        ArrayElement array = new ArrayElement();
        array.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

        assertEquals(array.arrayMethod(), "[2, 4, 0, 8, 0, 0, 14, 16, 0, 0]");
    }

}