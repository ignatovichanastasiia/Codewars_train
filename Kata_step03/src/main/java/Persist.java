public class Persist {
    private static int count;

    public static int persistence(long n) {
        count = 0;
        return persAction(n);
    }

    public static int persAction(long n){
        if(n > 9){
            count++;
            String str = Long.toString(n);
            String[] strArr = str.split("");
            long mul = 1;
            for(int x = 0; x< strArr.length;x++){
                mul = mul * Long.valueOf(strArr[x]);
            }
            persAction(mul);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(1234));
        long l = 562344567;
        System.out.println(persistence(l));
    }
}

//Последовательное перемножение чисел, пока не останется одно однозначне число.
//Программа считает количество действий.