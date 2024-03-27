package Questionary;

import java.util.Scanner;

public class Questionary {
    Scanner ler = new Scanner(System.in);
    boolean test = true;
    public int num;
    public int value;

    public void apresentation() {
        System.out.println("|___________ THE CARD GAME ___________|");
        System.out.println(" Você tem direito a escolher 7 cartas, de 1 até 13");
    }

    public void selectCode() {
        System.out.println("--------------> Muito Bem! As cartão foram Salvas <-------------");
        System.out.println("--------------> Selecione o algoritmo de ordenação! ");
        System.out.println(" ");
        System.out.println("1- Método BubbleSort");
        System.out.println("2- Método SelectionSort");
        System.out.println("3- Método InsertionSort");
    }

    public void seleSort(int x) {
        if (this.num > 3 || this.num < 1) {
            throw new RuntimeException("O valor indicado não é permitido!");
        } else if (this.num == 1) {
            System.out.println("Using BubbleSort!");
        } else if (this.num == 2) {
            System.out.println("Using SelectionSort!");
        } else if (this.num == 3) {
            System.out.println("Using InsertionSort!");
        }
    }

    public void setValue(int[] arraysCards) {
        int cont = 1;

        for (int i = 0; i < 7; i++) {
            System.out.println("Insira o valor da " + cont + "º carta.");
            this.value = ler.nextInt();
            arraysCards[i] = this.value;
            cont += 1;

            if (this.value <= 0) {
                this.test = false;
                throw new RuntimeException("A carta selecionada não pode ser menor que 1!");
            }
            if (this.value > 13) {
                this.test = false;
                throw new RuntimeException("A carta selecionada não pode ser maior que 13!");
            }

        }

    }

    public void stopCode() {
        System.exit(0);
    }


}