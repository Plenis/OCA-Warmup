package warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassOneTest {

    @Test
    void shouldConcatenate(){
        ClassOne sentence = new ClassOne();
        sentence.methodOne("Sino: ");
        sentence.methodTwo("I am a Java Developer.");

        assertEquals(sentence.concatenate(), "Sino: I am a Java Developer.");
    }

    @Test
    void shouldGetSentence(){
        ClassOne anotherSentence = new ClassOne();
        anotherSentence.methodOne("Hey there, ");
        anotherSentence.methodTwo(" I am FraNkinStieN.");

        assertEquals(anotherSentence.getSentenceOne(), "Hey there, ");
        assertEquals(anotherSentence.getSentenceTwo(), " I am FraNkinStieN.");
    }
}