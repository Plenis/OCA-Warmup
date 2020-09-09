package warmup;

public class ArrayMultipleOf5Total {
    private int[][] arr;

    public ArrayMultipleOf5Total(int[][] arr){
        this.arr = arr;
    }

    public int getMultipleOf5Total(){
        int total = 0;

        for(int [] i: arr) {
            for(int j: i){
                if (j % 5 == 0){
                    total += 1;
                }
            }
        }
        return total;
    }
}
