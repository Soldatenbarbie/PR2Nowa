package org.campus02.dim2arry;

public class Dim2ArrayDemoApp {

    public static void main(String[] args) {

        double[][] result = generateIdentityMatrix(10);
        printIdentityMatrix(result);
    }

    public static double[][] generateIdentityMatrix(int size){
        double[][] matrix = new double[size][size];

        for (int i=0;i < matrix.length; i++){
            matrix[i][i] = 1.0;
        }
        return matrix;
    }

    public static void printIdentityMatrix(double[][] arr){
        for (int x = 0; x < arr.length; x++){
            for (int y = 0; y < arr[x].length;y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
