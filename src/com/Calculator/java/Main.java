package com.Calculator.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
        int choice = 0;
        int stop=1;


            do {

                System.out.println("Введите 1(калькулятор ) или 2(калькулятор римских цифр )");

                choice = in.nextInt();
            switch (choice) {
                case 1:
                    int input1 = 0;
                    int input2 = 0;
                    int rezult2 = 0;
                    int operator2 = 0;
                    System.out.println("введите число 1");
                    input1 = in.nextInt();
                    System.out.println("введите число 2");
                    input2 = in.nextInt();
                    if((input1 > 0 || input1 <= 10) && (input2 > 0 || input2 <= 0)){
                    System.out.println("введите  1(+),2(-),3(*),4(/)");
                }
                    operator2 = in.nextInt();
                    switch (operator2) {
                        case 1:
                            rezult2 = input1 + input2;
                            System.out.println(rezult2);
                            break;
                        case 2:
                            rezult2 = input1 - input2;
                            System.out.println(rezult2);
                            break;
                        case 3:
                            rezult2 = input1 * input2;
                            System.out.println(rezult2);
                            break;
                        case 4:
                            rezult2 = input1 / input2;
                            System.out.println(rezult2);

                            break;
                    }
                    System.out.println("чтобы выйти из программы нажмите 0");
                    stop=in.nextInt();
                    break;

                case 2:
                    int sum = 0;
                    int sum2 = 0;
                    int rezult = 0;
                    int operator = 0;
                    String convertor = "";
                    String RomeNuber = "";
                    String RomeNuber2 = "";
                    System.out.println("Введите римское число");
                    RomeNuber = in.nextLine();
                    Rome X = Rome.valueOf(RomeNuber = in.nextLine());
                    if (null != RomeNuber) {

                    }
                    System.out.println("Введите второе римское число");
                    Rome I = Rome.valueOf(RomeNuber2 = in.nextLine());
                    if (null != RomeNuber2) {

                    }
                    X.getnum();
                    I.getnum();
                    for (int i = 0; i <= X.getnum(); i++) {
                        if (X.getnum() == i) {
                            sum += i;

                        }
                    }
                    for (int j = 0; j <= I.getnum(); j++) {
                        if (I.getnum() == j) {
                            sum2 += j;


                        }
                    }
                    System.out.println("Введите 1(+), 2(-),3(*),4(/)");

                    switch (operator = in.nextInt()) {
                        case 1:
                            rezult = sum + sum2;

                            break;

                        case 2:
                            rezult = sum - sum2;

                            break;
                        case 3:
                            rezult = sum * sum2;

                            break;
                        case 4:
                            rezult = sum / sum2;
                            break;
                    }
                    while (rezult >= 100) {
                        convertor += "C";
                        rezult -= 100;
                    }
                    while (rezult >= 90) {
                        convertor += "XC";
                        rezult -= 90;
                    }
                    while (rezult >= 50) {
                        convertor += "L";
                        rezult -= 50;
                    }
                    while (rezult >= 40) {
                        convertor += "XL";
                        rezult -= 40;
                    }
                    while (rezult >= 10) {
                        convertor += "X";
                        rezult -= 10;
                    }
                    while (rezult >= 9) {
                        convertor += "IX";
                        rezult -= 9;
                    }
                    while (rezult >= 5) {
                        convertor += "V";
                        rezult -= 5;

                    }
                    while (rezult >= 4) {
                        convertor += "IV";
                        rezult -= 4;

                    }
                    while (rezult >= 1) {
                        convertor += "I";
                        rezult -= 1;

                    }

                    System.out.println(convertor);


                System.out.println("чтобы выйти из программы нажмите 0");
                stop=in.nextInt();
                break;
                default:

            }
        }while (stop!=0);
    }
}

