import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Enum.*;
public class TestRomanFromNumbersOneToTen {

ConvertRomanNumber convertRomanNumber = new ConvertRomanNumber();
    @Test
    public void TestIfNumberIsLessThanThree(){

        Assertions.assertEquals(ArabicRomanNumber.ONE.roman,convertRomanNumber.Convert(ArabicRomanNumber.ONE.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsToFour(){

        Assertions.assertEquals(ArabicRomanNumber.FOUR.roman,convertRomanNumber.Convert(ArabicRomanNumber.FOUR.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsFive(){

        Assertions.assertEquals(ArabicRomanNumber.FIVE.roman,convertRomanNumber.Convert(ArabicRomanNumber.FIVE.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsNine(){

        Assertions.assertEquals(ArabicRomanNumber.NINE.roman,convertRomanNumber.Convert(ArabicRomanNumber.NINE.arabic));
    }

    @Test
    public void TestIfNumberIsEqualsTeen(){
        Assertions.assertEquals(ArabicRomanNumber.TEN.roman,convertRomanNumber.Convert(ArabicRomanNumber.TEN.arabic));
    }
}
