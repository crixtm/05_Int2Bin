import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    static String thisStringIsneedeToRecursionISuspect; //naezzelmiafasztcsinaljak,hogy tudjam hasznalni meg egyebkent is mi a faszom ez a lathatosag GRRR


    public static void main(String[] args) {
        App app = new App();
        String binaryConvertedValue;
        int originalInt = app.getValidateIntToConvert();
        if (0 == originalInt){
            System.out.println("converted value : 0");
            System.exit(0);
        }
        thisStringIsneedeToRecursionISuspect = "";
        if (0 > originalInt) {
            binaryConvertedValue = app.convertIntegerToBinaryByRemainder(Math.abs(originalInt), 31);
            app.convertTheBinaryStringToSignedBinaryString();
        } else {
            binaryConvertedValue = app.convertIntegerToBinaryByRemainder(originalInt, 31);
        }
        System.out.println("Brand new method:      " + binaryConvertedValue);
    }

    private int getValidateIntToConvert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("number?");
        int receivedInt=0;
        boolean isConversionSuccess;
        do {
            try {
                receivedInt = Integer.valueOf(sc.nextLine());
                isConversionSuccess = true;
            } catch (NumberFormatException e) {
                isConversionSuccess = false;
            }
        } while (!isConversionSuccess);
        return receivedInt;
    }

    void convertTheBinaryStringToSignedBinaryString() {
        char[] helperCharArray = thisStringIsneedeToRecursionISuspect.toCharArray();
        for (int i = 0; i<helperCharArray.length; i++) {
            if ('1' == helperCharArray[i]){
                helperCharArray[i] = '0';
            } else {
                helperCharArray[i] = '1';
            }
        }

        System.out.println(helperCharArray);
     }
    String convertIntegerToBinaryByRemainder(int originalInt, int exponentInMethod) {

        Double twoExponentedDouble = Math.pow(2, exponentInMethod);
        int twoExponent = twoExponentedDouble.intValue();
        if (0 <= exponentInMethod) {
            if (0 < (Math.abs(originalInt) / twoExponent)) {

                thisStringIsneedeToRecursionISuspect += "1";
                originalInt %= twoExponent;
            } else {
                if (thisStringIsneedeToRecursionISuspect.contains("1")) {
                    thisStringIsneedeToRecursionISuspect += "0";
                }
            }
            convertIntegerToBinaryByRemainder(originalInt, exponentInMethod - 1);
        }
        return thisStringIsneedeToRecursionISuspect;
    }




}

