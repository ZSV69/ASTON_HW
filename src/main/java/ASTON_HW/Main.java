package ASTON_HW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sum(12,125));
        cheсkNumber(125);
        System.out.println(checkNegativeNumber(0));
        printString("Вроде получилось)))", 2);
        System.out.println(leapYear(2027));
        changeArr();
        fillingArr();
        changeArr2();
        squareArr();
        System.out.println(Arrays.toString(arr(5,1)));
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 120;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else if  (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 17;
        int b = 25;
            if (a>=b) {
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
    }

    public static boolean sum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void cheсkNumber(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNegativeNumber (int num) {
        return num < 0;
    }

    public static void printString (String string, int count) {
        for (int i =0; i < count; i++) {
            System.out.println(string);
        }
    }

    public static boolean leapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void changeArr() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1) {
                arr [i] = 0;
            } else if (arr [i] == 0) {
                arr [i] = 1;
            }
        }
        System.out.println(Arrays.toString((arr)));
    }

    public static void fillingArr() {
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArr2() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squareArr() {
        int [] [] square = new int[5][5];
        for (int i = 0; i < 5; i++) {
            square[i] [i] = 1;
            square [i][5 - i - 1] = 1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(square[i][j]);
            }
                System.out.println();
            }
    }

    public static int [] arr(int len, int initialValue) {
       int [] arr = new int[len];
       for (int i = 0; i < len; i++) {
           arr[i] = initialValue;
       }
       return arr;
    }
}