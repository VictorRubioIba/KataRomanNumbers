import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Enum.*;

public class TestRomanNumbersFromFourHundredToOneThousand {

    ConvertRomanNumber convertRomanNumber= new ConvertRomanNumber();

    @Test
    public void TestIfNumberIsEqualsFourHundred(){

        Assertions.assertEquals(ArabicRomanNumber.FOURHUNDRED.roman,convertRomanNumber.Convert(ArabicRomanNumber.FOURHUNDRED.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsFiveHundred(){
        Assertions.assertEquals(ArabicRomanNumber.FIVEHUNDRED.roman,convertRomanNumber.Convert(ArabicRomanNumber.FIVEHUNDRED.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsNineHundred(){
        Assertions.assertEquals(ArabicRomanNumber.NINEHUNDRED.roman,convertRomanNumber.Convert(ArabicRomanNumber.NINEHUNDRED.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsOneThousand(){

        Assertions.assertEquals(ArabicRomanNumber.ONETHOUSAND.roman,convertRomanNumber.Convert(ArabicRomanNumber.ONETHOUSAND.arabic));
    }
}
