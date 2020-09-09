package warmup;

public class ArrayMultipleOf3Total {
    private int[] arr;

    public ArrayMultipleOf3Total(int[] arr) {
        this.arr = arr;
    }

    public int getMultipleOf3Total(){
        int total = 0;

        for(int i: arr) {
            if (i % 3 == 0) {
                total += 1;
            }
        }
        return total;
    }

}
