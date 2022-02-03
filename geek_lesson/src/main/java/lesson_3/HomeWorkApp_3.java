package lesson_3;

public class HomeWorkApp_3 {

    public static void main(String[] args) {
        int[] ex6 = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10, 11};

        exercise_1();
        exercise_2();
        exercise_3();
        exercise_4();
        exercise_5(7, 1);
        exercise_6(ex6);
    }

    private static void exercise_1() {

        int[] ex1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int checkLenght = ex1.length;
        for (int i = 0; i < checkLenght; i++) {
            if (ex1[i] == 1) {
                ex1[i] = 0;
            } else ex1[i] = 1;
        }
        System.out.println("exercise 1:");
        for (int i = 0; i < checkLenght; i++) {
            System.out.print(ex1[i]);
        }
    }

    private static void exercise_2() {

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("exercise 2:");

        int[] ex2 = new int[100];
        int b = 0;
        int checkLenght_2 = ex2.length;
        for (int i = 0; i < checkLenght_2; i++, b = b + 1) {
            ex2[i] = b;
            System.out.print(ex2[i] + " ");
        }
    }
        ///////////////////////////////////

    private static void exercise_3() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("exercise 3:");


        int[] ex3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int checkLenght_3 = ex3.length;
        for (int i = 0; i < checkLenght_3; i++) {
            if (ex3[i] < 6)
                ex3[i] = ex3[i] * 2;

        }
        for (int i = 0; i < checkLenght_3; i++) {
            System.out.print(ex3[i] + " ");

        }
    }

    private static void exercise_4() {

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("exercise 4:");

        int[][] ex4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < j) {
                    ex4[i][j] = 0;
                } else if (i > j) {
                    ex4[i][j] = 1;
                } else {
                    ex4[i][j] = 1;
                }
                System.out.print(ex4[i][j] + " ");
            }
            System.out.println(" ");

        }
    }

    public static void exercise_5(int len, int initialValue){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("exercise 5:");

        int[] ex5 = new int[len];
        for (int i = 0; i < len; i++) {
            ex5[i] = initialValue;
            System.out.println("[" + i + "]" + ex5[i] + " ");
        }
    }

    private static void exercise_6(int[] ex6) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("exercise 6:");

        int maximum = ex6[0];
        int minimum = ex6[0];

        for (int i = 0; i < ex6.length; i++) {
            if (ex6[i] > maximum) {
                maximum = ex6[i];
            }
        }
        for (int i = 0; i < ex6.length; i++) {
            if (ex6[i] < minimum) {
                minimum = ex6[i];
            }
        }
        System.out.println("maximum "+maximum);
        System.out.println("minimum "+minimum);
    }
}


