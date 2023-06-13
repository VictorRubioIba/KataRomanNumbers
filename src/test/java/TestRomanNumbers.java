import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumbers {

    ConvertRomanNumber convertRomanNumber= new ConvertRomanNumber();
    @Test
    void TestRomanNumbers(){

        Integer number = 4;
        Assertions.assertNotEquals(number.getClass(), convertRomanNumber.Convert(number));
    }



}
