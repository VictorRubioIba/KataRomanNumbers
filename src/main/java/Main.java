import Infrastructure.Console;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        ConvertRomanNumber convertRomanNumber= new ConvertRomanNumber();

        console.showData(convertRomanNumber.Convert(console.introduceData()));

    }
}
