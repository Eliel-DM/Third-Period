package MethodsOfOrdenacion;

public class Buble {

    public void Bsort(int[] arr) {
        int n = arr.length;
        for (int f = 0; f < n; f++) {
            System.out.print(" " + arr[f]);
        }
        System.out.println();

        boolean valitator;
        for (int i = 0; i < n - 1; i++) {
            valitator = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    valitator = true;
                }
            }
            for (int f = 0; f < n; f++) {
                System.out.print(" " + arr[f]);
            }
            System.out.println();
            if (!valitator)
                break;
        }


    }
}


