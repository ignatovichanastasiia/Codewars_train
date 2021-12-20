
import java.util.ArrayList;
import java.util.List;

//counter for winner
//where 'n' is a number of members, 'k' is a count's step.

public class Survivor {

    public static int getSurvivor(int n, int k) {
        if (n < 1) throw new IllegalArgumentException("n can't be negative or less then 1");
        if (n == 1) return 1;
        List<Integer> list = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            list.add(x);
        }
        int count = 0;
        int ls = n;
        while ((list.size() > 1)) {
            for (int i = 0; i < ls; i++) {
                count++;
                if (count == k) {
                    if (list.size() > 1) {
                        list.remove(i);
                        i--;
                        count = 0;
                        ls--;
                    } else {
                        break;
                    }
                }
            }
        }
        return list.get(0);
    }
}
