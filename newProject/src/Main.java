public class Main {
    public static void main(String[] args) {

        int katyaAge = 10;
        int mishaAge = 12;
        int danilAge = 14;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст



        if (katyaAge > mishaAge && katyaAge > danilAge) {
            System.out.printf("Misha больше всех");
        } else {
            System.out.printf("Danil среднее ");
            System.out.printf("Misha меньше всех");

        }

        if (mishaAge > katyaAge && mishaAge > danilAge) {
            System.out.printf("Misha больше всех");
        }else {
            System.out.printf("Danil больше всех");
            System.out.printf("Katya меньше всех");
        }
        if (danilAge > katyaAge && danilAge >mishaAge) {
            System.out.printf("Danil больше всех");
        } if (danilAge > katyaAge && mishaAge > katyaAge) {
            System.out.printf("Katya меньше всех");
            System.out.printf(" Misha среднее");
        }


        }
    }
