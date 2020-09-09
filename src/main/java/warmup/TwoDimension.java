package warmup;

public class TwoDimension {

    private int [][] arr;
    private int multipleVal;

    public TwoDimension(int [][] arr){
        this.arr = arr;
    }

    public void setMultiple(int multipleVal){
        this.multipleVal = multipleVal;
    }

    public int getArrTotal() {

        int total = 0;

        for (int [] i : arr){
            for (int j : i){
                if (j % multipleVal == 0){
                    total += j;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        TwoDimension arr = new TwoDimension(new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}});
        arr.setMultiple(5);
        System.out.println(arr.getArrTotal());
    }
}
