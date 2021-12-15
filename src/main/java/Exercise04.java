import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Exercise04 {
//    Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
    //n = abcd...

    public static void main(String[] args) {
        long k = allPerm(46288);
        System.out.println(k);

    }

    public static long allPerm(int n) {
        int[] intArr = intToArr(n);
        return getMagic(intArr, n);
    }

    public static int[] intToArr(int n) {
        String num = Integer.toString(n);
        char[] charArray = num.toCharArray();
        int[] intArr = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArr[i] = Character.getNumericValue(charArray[i]);
        }
        return intArr;
    }

    public static long getMagic(int[] numArr, int n) {
        long k = -1;
        int j = 0;
        for (int a = 1; a < 10; a++) {
            long sum = 0;
            for (int i = 0; i < numArr.length; i++) {
                j++;
                long m = numArr[i];
                for (int g = 1; g <= j; g++) {
                    if(g>1){
                        m = (multi(m,numArr[i]));
                    }

                }
                sum = sum+m;
            }
            if (sum % n == 0) {
                return sum /n;
            }else {
                j = a;
            }
        }
        return k;
    }

    public static long multi(long m,int n) {
        return m * n;
    }
}

//Программа, действующая по формуле для любого положительного числа.
//
//import static org.junit.Assert.*;
//        import org.junit.Test;


//public class DigPowTest {
//
//    @Test
//    public void Test1() {
//        assertEquals(1, DigPow.digPow(89, 1));
//    }
//    @Test
//    public void Test2() {
//        assertEquals(-1, DigPow.digPow(92, 1));
//    }
//    @Test
//    public void Test3() {
//        assertEquals(51, DigPow.digPow(46288, 3));
//    }
//}
