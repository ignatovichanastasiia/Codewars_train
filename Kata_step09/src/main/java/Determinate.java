

import static java.lang.Math.*;
import java.lang.IllegalArgumentException;
// Ищем определитель матрицы.
// Входные данные - квадратная матрица, представленные в виде двумерного массива.
// Матрицы больше 10 порядка использовать не рекомендуется.

public class Determinate {
    public static void main(String[] args) {
        int[][] arr = {{2,5},{1,-3}}; //-11
        System.out.println(determ(arr));
        int[][] arr3 = {{3,-5},{2,1}}; //13
        System.out.println(determ(arr3));
        int[][] arr4 = {{2,-3,1},{4,2,-1}, {-5,3,-2}}; //-19
        System.out.println(determ(arr4));
        int[][] arr5 = {{2,0,-1},{3,5,2}, {-4,1,4}}; //13
        System.out.println(determ(arr5));
        int[][] arr1 = new int[10][10];
        arr1 = arrFill(arr1);
        System.out.println(determ(arr1));

    }
    public static int[][] arrFill(int[][] arr) throws IllegalArgumentException{
        if (arr.length != arr[0].length) throw new IllegalArgumentException("Matrix is not square");
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                arr[i][j] = (int) ((random()+1) * 50);
            }
        }
        return arr;
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

    public static int[][] minor(int i, int[][] a) throws IllegalArgumentException {
        if(a.length==1) throw new IllegalArgumentException("Can't do minor matrix for int[1][1]");
        int newLen = a.length - 1;
        int[][] b = new int[newLen][newLen];
        for (int x = 1; x < a.length; x++) {
            int countY = 0;
            for (int y = 0; y < a.length; y++) {
                if (y == i) {
                    y++;
                    if (y == a.length) break;
                }
                b[x-1][countY] = a[x][y];
                countY++;
            }
        }
        return b;
    }
}

