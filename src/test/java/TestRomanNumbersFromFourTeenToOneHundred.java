import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Enum.*;

public class TestRomanNumbersFromFourTeenToOneHundred {

    ConvertRomanNumber convertRomanNumber = new ConvertRomanNumber();
    @Test
    public void TestIfNumberIsEqualsFourTeen() {
        Assertions.assertEquals(ArabicRomanNumber.FOURTEEN.roman, convertRomanNumber.Convert(ArabicRomanNumber.FOURTEEN.arabic));
    }
    @Test
    public void TestIfNumberIsEqualsFiveTeen(){
        Assertions.assertEquals(ArabicRomanNumber.FIVETEEN.roman, convertRomanNumber.Convert(ArabicRomanNumber.FIVETEEN.arabic));    }
    @Test
    public void TestIfNumberIsEqualsNineTeen(){
        Assertions.assertEquals(ArabicRomanNumber.NINETEEN.roman, convertRomanNumber.Convert(ArabicRomanNumber.NINETEEN.arabic));    }
    @Test
    public void TestIfNumberIsEqualsOneHundred(){
        Assertions.assertEquals(ArabicRomanNumber.ONEHUNDRED.roman, convertRomanNumber.Convert(ArabicRomanNumber.ONEHUNDRED.arabic));    }
}
