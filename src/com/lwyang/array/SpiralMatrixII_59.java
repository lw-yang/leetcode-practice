package com.lwyang.array;

import java.util.Arrays;

/**
 * @author yangliwei
 */

public class SpiralMatrixII_59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int i = 0;
        int j = 0;

        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int curPos = 0;
        for (int k = 0; k < n * n; k++) {
            result[i][j] = k + 1;

            int[] currentDir = dir[curPos];
            int nextI = i + currentDir[0];
            int nextJ = j + currentDir[1];
            if (nextI >= n || nextJ >= n || nextI < 0 || nextJ < 0 ||
            result[nextI][nextJ] != 0){
                curPos = (curPos + 1) % 4;
            }

            currentDir = dir[curPos];
            i += currentDir[0];
            j += currentDir[1];

        }
        return result;
    }
}
