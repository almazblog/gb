package lesson_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a=-5;
        int b=-6;
        int c=a+b;

        if (c>=0){
            System.out.println("Сумма положительная");}
                    else{
            System.out.println("Сумма отрицательная");

        }
    }

    private static void printColor() {
        int value=-15;

        if (value<=0){
            System.out.println("красный");
        }
        if (value ==0 && value==100){
            System.out.println("желтый");
        }
        if (value>100){
            System.out.println("зеленый");
        }
    }

    private static void compareNumbers() {
        int a=5;
        int b=4;

        if (a >= b){
            System.out.println("a >= b");}
            else {
                System.out.println("a < b");
            }
        }
    }

