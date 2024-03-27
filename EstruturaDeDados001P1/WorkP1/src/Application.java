import MethodsOfOrdenacion.Buble;
import MethodsOfOrdenacion.Select;
import MethodsOfOrdenacion.Insert;
import Questionary.Questionary;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        Buble bubble = new Buble();
        Select selectio = new Select();
        Insert insertion = new Insert();
        Questionary using = new Questionary();

        int[] arrayCards = new int[7];

        System.out.println("Deseja selecioar as cartas ou gerar de forma aleatória ?\n 1- Selecionar\n 2- Aleatoriamente");
        int selectMode = ler.nextInt();
        switch (selectMode) {
            case 1:
                selectMode = 1;
                System.out.println("Selecione cartas entre 1 e 13");

                try {
                    using.setValue(arrayCards);

                } catch (RuntimeException execessao) {
                    System.out.println(execessao.getMessage());
                    using.stopCode();
                }
                break;
            case 2:
                selectMode = 2;
                using.randomValue(arrayCards);
                //System.out.println("As cartas geradas foram: ");

                break;
        }

        /*
        try {
            using.seleSort(using.num);
            if (using.num == 1) {
                bubble.Bsort(arrayCards);
            }
            if (using.num == 2) {
                selectio.sSort(arrayCards);
            }
            if (using.num == 3) {
                insertion.iSort(arrayCards);

            }

        } catch (RuntimeException execessao) {
            System.out.println(execessao.getMessage());
            using.stopCode();
        }

*/
    }
}