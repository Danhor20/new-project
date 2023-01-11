public class Main {
    public static void main(String[] args) {

        int katya = 10;
        int misha = 12;
        int danil = 14;


        if (katya > misha && katya > danil) {
            System.out.printf("Misha больше всех");
        } else {
            System.out.printf("Danil среднее ");
            System.out.printf("Misha меньше всех");

        }

        if (misha > katya && misha > danil) {
            System.out.printf("Misha больше всех");
        }else {
            System.out.printf("Danil больше всех");
            System.out.printf("Katya меньше всех");
        }
        if (danil > katya && danil >misha) {
            System.out.printf("Danil больше всех");
        } if (danil > katya && misha > katya) {
            System.out.printf("Katya меньше всех");
            System.out.printf(" Misha среднее");
        }

            
        }
    }
