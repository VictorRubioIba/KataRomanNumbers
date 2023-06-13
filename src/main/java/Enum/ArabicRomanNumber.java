package Enum;

public enum ArabicRomanNumber {

    ONETHOUSAND(1000, "M"),
    NINEHUNDRED(900, "CM"),
    FIVEHUNDRED(500, "D"),
    FOURHUNDRED(400, "CD"),
    ONEHUNDRED(100, "C"),
    NINETEEN(90, "XC"),
    FIVETEEN(50, "L"),
    FOURTEEN(40, "XL"),
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"),
    ONE(1, "I");

    public int arabic;
    public String roman;

    ArabicRomanNumber(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }
}
