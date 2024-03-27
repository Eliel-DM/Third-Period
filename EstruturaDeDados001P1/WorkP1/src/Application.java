import MethodsOfOrdenacion.Buble;
import MethodsOfOrdenacion.Select;
import MethodsOfOrdenacion.Insert;
import Questionary.Questionary;

import java.util.Scanner;

public class Application {
    public static void main(String [] args) {

        for (int c = 0; c <= 1; c++) {
            Buble bubble = new Buble();
            Select selectio = new Select();
            Insert insertion = new Insert();

            Questionary using = new Questionary();
            Scanner ler = new Scanner(System.in);
            int[] arrayCards = new int[7];

            using.apresentation();
            try {
                using.setValue(arrayCards);

            } catch (RuntimeException execessao) {
                System.out.println(execessao.getMessage());
                using.stopCode();
            }

            using.selectCode();
            using.num = ler.nextInt();

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

            System.out.println("Deseja começar novamente?");
            System.out.println("NÃO - 1 ");
            System.out.println("SIM - 0");
            c = ler.nextInt();
        }


    }
}