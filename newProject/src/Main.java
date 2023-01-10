public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 14;
        if (a > b && a > c) {
            System.out.printf("a больше всех");
        } else {
            System.out.printf("с среднее ");
            System.out.printf("b меньше всех");

        }

        if (b > a && b > c) {
            System.out.printf("b больше всех");
        }else {
            System.out.printf("с больше всех");
            System.out.printf("а меньше всех");
        }
        if (c > a && c >b) {
            System.out.printf("c больше всех");
        }else {
            System.out.printf("a меньше всех");
            System.out.printf(" b среднее");
        }
    }
}