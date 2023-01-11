public class Main {
    public static void main(String[] args) {

        int katyaAge = 10;
        int mishaAge = 12;
        int danilAge = 14;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст


        if (katyaAge >= mishaAge && katyaAge >= danilAge) {
            max = katyaAge;

            if (mishaAge >= danilAge) {
                middle = mishaAge;

                min = danilAge;
            } else {
                middle = danilAge;
                min = mishaAge;
            }

        }

        if (mishaAge >= katyaAge && mishaAge >= danilAge) {
            max = mishaAge;

            if (katyaAge >= danilAge) {

                middle = katyaAge;
                min = danilAge;
            } else {
                middle = danilAge;
                min = katyaAge;
            }

        }







        if (danilAge >= katyaAge && danilAge >= mishaAge) {
            max = danilAge;

            if (katyaAge >= mishaAge) {

                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }

            System.out.println("Minimal age : " + min);
            System.out.println("Middle age : " + middle);
            System.out.println("Maximal age : " + max);
        }

        }


}

