package org.campus02.array01;

public class ArrayDemoApp {
    public static void main(String[] args) {

        int[] arr1 = {3, 4, 5, 8};
        int[] arr2 = new int[4];
        arr2[0] = 7;
        arr2[1] = 1;
        arr2[2] = 3;
        arr2[3] = 7;

        int add1 = arr1[0] + arr2[0];
        int add2 = arr1[1] + arr2[1];
        int add3 = arr1[2] + arr2[2];
        int add4 = arr1[3] + arr2[3];
        System.out.println("+ " + add1 + ", "
                + add2 + ", " + add3 + ", " + add4);

        System.out.print("* ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] * arr2[i] + ", ");
        }

        System.out.println();
        addieren(arr1, arr2);

        System.out.println("Addition mit Result");
        int[] erg = addieren2(arr1, arr2);
        for (int v: erg) {
            System.out.print(v + ", ");
        }

        /*
        System.out.println("foreach:");
        for(int wert : arr1){
            System.out.println("Wert von Array1: " + wert);
            for (int wert2 : arr2){
                System.out.println("Wert von Array2: " + wert2);
            }
        }*/
    }

    public static void addieren(int[] arr1, int[] arr2){
        System.out.print("+ ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + arr2[i] + ", ");
        }
    }

    public static int[] addieren2(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
