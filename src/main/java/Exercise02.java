import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise02 {

    public static String[] dirReduc(String[] arr) {
        arr = cliner(arr);
        return dirCorrecter(arr);
    }

    public static String[] cliner(String[] arr) {
        for (String st : arr) {
            st.toUpperCase();
            if (st.contains("NORTH")) {
                st = new String("NORTH");
            } else if (st.contains("SOUTH")) {
                st = new String("SOUTH");
            } else if (st.contains("EAST")) {
                st = new String("EAST");
            } else if (st.contains("WEST")) {
                st = new String("WEST");
            } else {
                st = null;
            }
        }
        return arr;
    }

    public static String[] dirCorrecter(String[] arr) {
        List<String> ls = new ArrayList(Arrays.asList(arr));
        do {
            if (ls.contains("NORTH")&&ls.contains("SOUTH")) {
                ls.remove("NORTH");
                ls.remove("SOUTH");
            }
            if (ls.contains("EAST")&&ls.contains("WEST")) {
                ls.remove("EAST");
                ls.remove("WEST");
            }
        } while (ls.contains("NORTH")&&ls.contains("SOUTH")||ls.contains("EAST")&&ls.contains("WEST"));
        String[] arr2 = ls.stream().toArray(String[]::new);
        return arr2;
    }
}
//Сокращение маршрута.
