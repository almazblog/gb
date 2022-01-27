package lesson_2;

public class HomeWorkApp_2 {
    public static void main(String[] args) {
        cheсkSum();
        cheсkControl(0);
//        System.out.println(checkParamBool(-1));  TODO: если нужно вывести в консоль
        checkParamBool(-1);
        checkParamStirng(5, "geek");
        System.out.println(checkYear(16));
    }

    public static void cheсkSum() {
        int a = 1;
        int b = 1;
        int sum = a + b;
        if (sum >= 10 & sum <= 20){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    private static void cheсkControl(int a) {

        if (a<=-1){
            System.out.println("отрицательное число");
        }
        if (a>=0){

            System.out.println("положительное число");
        }
    }

    private static boolean checkParamBool(int a){
        boolean l1=true;
        boolean l2=false;
        if (a<=-1){
            return l1;
        }
        else {
            return l2;
        }

    }

    private static void checkParamStirng(int b, String text){
        for (int a=0;a<=b;a++){
            System.out.println(text);
        }
    }

    private static boolean checkYear(int a){

        if (a%4==0 || a%400==0 && a%100!=0){
            return true;
        }
        else {
            return  false;
        }
    }
}
