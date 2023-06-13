import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestRomanNumberWithParameter {
    ConvertRomanNumber convertRomanNumber = new ConvertRomanNumber();
    @ParameterizedTest
    @ValueSource(ints={4})
    public void checkParameterOne(int parameter){
        Assertions.assertEquals("IV",convertRomanNumber.Convert(parameter));
    }
    @ParameterizedTest
    @ValueSource(ints={9})
    public void checkParameterTwo(int parameter){
        Assertions.assertEquals("IX",convertRomanNumber.Convert(parameter));
    }
    @ParameterizedTest
    @ValueSource(ints={29})
    public void checkParameterThree(int parameter){
        Assertions.assertEquals("XXIX",convertRomanNumber.Convert(parameter));
    }
    @ParameterizedTest
    @ValueSource(ints={80})
    public void checkParameterFour(int parameter){
        Assertions.assertEquals("LXXX",convertRomanNumber.Convert(parameter));
    }
    @ParameterizedTest
    @ValueSource(ints={294})
    public void checkParameterFive(int parameter){
        Assertions.assertEquals("CCXCIV",convertRomanNumber.Convert(parameter));
    }
    @ParameterizedTest
    @ValueSource(ints={2019})
    public void checkParameterSix(int parameter){
        Assertions.assertEquals("MMXIX",convertRomanNumber.Convert(parameter));
    }
}
