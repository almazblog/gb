package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp_4 {
    public static class MainClass {
        public static int SIZE = 5;
        public static int DOTS_TO_WIN = 5;
        public static final char DOT_EMPTY = '-';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победитель человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья!");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Терминатор");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена навсегда");
        }


        public static boolean checkWin(char symb) {
            if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb && map[0][3] == symb && map[0][4] == symb) return true;
            if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb && map[1][3] == symb && map[1][4] == symb) return true;
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb && map[2][3] == symb && map[2][4] == symb) return true;
            if (map[3][0] == symb && map[3][1] == symb && map[3][2] == symb && map[3][3] == symb && map[3][4] == symb) return true;
            if (map[4][0] == symb && map[4][1] == symb && map[4][2] == symb && map[4][3] == symb && map[4][4] == symb) return true;
            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb && map[3][3] == symb && map[4][4] == symb) return true;
            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb && map[3][0] == symb && map[4][0] == symb) return true;
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb && map[3][1] == symb && map[4][1] == symb) return true;
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb && map[3][2] == symb && map[4][2] == symb) return true;
            if (map[0][3] == symb && map[1][3] == symb && map[2][3] == symb && map[3][3] == symb && map[4][3] == symb) return true;
            if (map[0][4] == symb && map[1][4] == symb && map[2][4] == symb && map[3][4] == symb && map[4][4] == symb) return true;

                return false;
            }

//        public static boolean checkWin(char symb) {
//            for (int i = 0; i < SIZE; i++) {
//                int row = 0;
//                int column = 0;
//                int mainDiag = 0;
//                int subDiag = 0;
//                for (int j = 0; j < SIZE; j++) {
//
//                    if (map[i][j]==symb){
//                        row++;
//                    }
//                    if (map[i][j]==symb){
//                        column++;
//                    }
//                    if (map[i][j]==symb){
//                        mainDiag++;
//                    }
//                    if (map[i][SIZE-1-j]==symb){
//                        subDiag++;
//                    }
//                    if (row==DOTS_TO_WIN||column==DOTS_TO_WIN||mainDiag==DOTS_TO_WIN||subDiag==DOTS_TO_WIN){
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
