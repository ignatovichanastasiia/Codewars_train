

public class Exercise01 {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < numbers.length; i++) {
            if(i==3){
                sb.append(") ");
            }
            if(i==6){
                sb.append("-");
            }
            sb.append(numbers[i]);
        }
        return sb.toString();
    }
}



