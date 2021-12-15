import java.util.*;
//change numbers to roman;
//Roman Numerals Encoder

public class RomanNumerals {

    public static String goToRome(int num){
        String arabNum = String.valueOf(num);
        String[] arabNumArr = arabNum.split("");
        String[] romanNumArr = new String[arabNumArr.length];
        int count = 0;
        for(int x = arabNumArr.length-1; x>=0; x--){
            if(count==0) romanNumArr[x] = takeUnits(arabNumArr[x]);
            if(count==1) romanNumArr[x] = takeDozens(arabNumArr[x]);
            if(count==2) romanNumArr[x] = takeHundreds(arabNumArr[x]);
            if(count==3) romanNumArr[x] = takeThousand(arabNumArr[x]);
            count++;
        }
        StringBuilder sb = new StringBuilder();
        for (String str:romanNumArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static String takeUnits(String splitNum){
        switch (splitNum) {
            case ("1"):
                return "I";
            case ("2"):
                return "II";
            case ("3"):
                return "III";
            case ("4"):
                return "IV";
            case ("5"):
                return "V";
            case ("6"):
                return "VI";
            case ("7"):
                return "VII";
            case ("8"):
                return "VIII";
            case ("9"):
                return "IX";
            case ("0"):
                return "";
        }
        return "";
    }

    private static String takeDozens(String splitNum) {
        switch (splitNum) {
            case ("1"):
                return "X";
            case ("2"):
                return "XX";
            case ("3"):
                return "XXX";
            case ("4"):
                return "XL";
            case ("5"):
                return "L";
            case ("6"):
                return "LX";
            case ("7"):
                return "LXX";
            case ("8"):
                return "LXXX";
            case ("9"):
                return "XC";
            case ("0"):
                return "";
        }
        return "";
    }

    private static String takeHundreds(String splitNum){
        switch (splitNum) {
            case ("1"):
                return "C";
            case ("2"):
                return "CC";
            case ("3"):
                return "CCC";
            case ("4"):
                return "CD";
            case ("5"):
                return "D";
            case ("6"):
                return "DC";
            case ("7"):
                return "DCC";
            case ("8"):
                return "DCCC";
            case ("9"):
                return "CM";
            case ("0"):
                return "";
        }
        return "";
    }

    private static String takeThousand(String splitNum){
        switch (splitNum) {
            case ("1"):
                return "M";
            case ("2"):
                return "MM";
            case ("3"):
                return "MMM";
            case ("4"):
                return "MV";
            case ("5"):
                return "V";
            case ("6"):
                return "VM";
            case ("7"):
                return "VMM";
            case ("8"):
                return "VMMM";
            case ("9"):
                return "MX";
            case ("0"):
                return "";
        }
        return "";
    }

}

//    public enum Units{
//        I, II, III, IV, V, VI, VII, VIII, IX
//    }
//    public enum Dozens{
//        X, XX, XXX, XL, L, LX, LXX, LXXX, XC
//    }
//    public enum Hundreds{
//        C, CC, CCC, CD, D, DC, DCC, DCCC, CM
//
//    }
//    public enum Thousands{
//        M, MM, MMM, MV, V, VM, VMM, VMMM, VX
//    }

