import Enum.*;
public class ConvertRomanNumber {

    public  String Convert(Integer number) {

        String valueReturned="";

            for(ArabicRomanNumber arabicRomanNumber : ArabicRomanNumber.values()){
                while (number>=arabicRomanNumber.arabic){
                    valueReturned+= arabicRomanNumber.roman;
                    number-= arabicRomanNumber.arabic;
                }
            }

        return valueReturned;
    }

}
