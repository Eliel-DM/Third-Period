package MethodsOfOrdenacion;

public class Select {
    public static void sSort(int[] arr) {
        int n = arr.length;
        for (int f = 0; f < n; f++) {
            System.out.print(" " + arr[f]);
        }
        System.out.println();
        boolean valitator = false;
        for (int i = 0; i < n - 1; i++) {
            valitator = false;

            int indexDoMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indexDoMenor]) {
                    indexDoMenor = j;
                    valitator = true;
                }
            }
            if (!valitator)
                break;


            int menorValor = arr[indexDoMenor];
            arr[indexDoMenor] = arr[i];
            arr[i] = menorValor;

            for (int f = 0; f < n; f++) {
                System.out.print(" " + arr[f]);
            }
            System.out.println();
        }
    }
}
