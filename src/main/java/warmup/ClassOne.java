package warmup;

public class ClassOne implements SetValues, Concatenation {

    private String sentenceOne;
    private String sentenceTwo;

    public void methodOne(String text){
        sentenceOne = text;
    }

    public void methodTwo(String moreText){
        sentenceTwo = moreText;
    }

//    public String Concatenation(){
//        return  sentenceOne.concat(sentenceTwo);
//    }

    public static void main(String[] args) {
    }

    @Override
    public String getSentenceOne() {
        return sentenceOne;
    }

    @Override
    public String getSentenceTwo() {
        return sentenceTwo;
    }

    @Override
    public String concatenate() {
        return sentenceOne.concat(sentenceTwo);
    }
}
