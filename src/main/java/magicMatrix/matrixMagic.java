package magicMatrix;

import java.util.Scanner;

public class matrixMagic {

    private static int test_range(int i1, int n)     {
        if (i1 > n) {
            i1 = 0; }
        if (i1 < 0) {
            i1 = n; }
        return i1;}

        private static void fill_matrix(int[][] matrix, int n) {
        int i, j, i1, j1;
        n--;
        i = 0;
        j = n / 2;
        matrix[i][j] = 1;
        for (int m = 1; m < (n + 1) * (n + 1); m++) {
            i1 = i - 1;
            j1 = j - 1;
            i1 = test_range(i1, n);
            j1 = test_range(j1, n);
            if (matrix[i1][j1] != 0) {
                i1 = i + 1;
                j1 = j;
                i1 = test_range(i1, n);
                j1 = test_range(j1, n);}
            matrix[i1][j1] = m + 1;
            i = i1;
            j = j1;}
    }

    private static void disp_matrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 10) {
                    System.out.printf(" %s", matrix[i][j]);
                } else if (matrix[i][j] < 100) {
                    System.out.printf(" %s", matrix[i][j]);
                } else {
                    System.out.printf(" %s", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.print("Enter n:");
        n = (new Scanner(System.in)).nextInt();
        int[][] matrix = new int[n][n];
        fill_matrix(matrix, n);
        disp_matrix(matrix, n);
    }
}

