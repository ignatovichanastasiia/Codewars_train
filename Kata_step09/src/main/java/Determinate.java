

import static java.lang.Math.pow;

import java.lang.IllegalArgumentException;
import java.util.Arrays;

public class Determinate {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        Arrays.fill(arr1, 5);
        int[][] arr2 = new int[4][4];
        Arrays.fill(arr2, 7);

    }

    public static int determ(int[][] a) throws IllegalArgumentException {
        if (a.length != a[0].length) throw new IllegalArgumentException("Matrix is not square");
        if (a.length == 1) return a[0][0];
        int n = a.length;
        int det = 0;
        for (int i = 0; i < n; i++) {
            det += (int) pow(-1, i + 2) * a[0][i] * determ(minor(i, a));
        }
        return det;
    }

    public static int[][] minor(int i, int[][] a) {
        int newLen = a.length - 1;
        int[][] b = new int[newLen][newLen];
        for (int x = 1; x < a.length; x++) {
            int countY = 0;
            for (int y = 0; y < a.length; y++) {
                if (y == i) {
                    if (y++ > a.length) break;
                }
                b[x][countY] = a[x][y];
                countY++;
            }
        }
        return b;
    }
}

