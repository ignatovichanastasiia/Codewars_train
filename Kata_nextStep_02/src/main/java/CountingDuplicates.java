public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toUpperCase();
        char[] textArr = text.toCharArray();
        int count = 0;
        for (int x = 0; x < textArr.length; x++) {
            for (int y = x + 1; y < textArr.length; y++) {
                int memo = '#';
                if (textArr[x] == '#') break;
                if (textArr[x] == textArr[y]) {
                    memo = textArr[x];
                    textArr[x] = '#';
                    textArr[y] = '#';
                    count++;
                    for(int z = y+1;z< textArr.length;z++){
                        if(textArr[z]==memo){
                            textArr[z]='#';
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1= "reeety";
        int p = duplicateCount(str1);
        System.out.println(p);
        String str2= "reeiiiIIIpfjklbhgftryujikndsertyety";
        p = duplicateCount(str2);
        System.out.println(p);
    }
}