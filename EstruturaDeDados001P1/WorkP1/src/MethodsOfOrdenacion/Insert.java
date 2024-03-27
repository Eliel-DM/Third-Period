package MethodsOfOrdenacion;

public class Insert {

    public void iSort(int[] arr) {
        int n = arr.length;
        for (int f = 0; f < n; f++) {
            System.out.print(" " + arr[f]);
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;

            for (int f = 0; f < n; f++) {
                System.out.print(" " + arr[f]);
            }
            System.out.println();
        }


    }

}


