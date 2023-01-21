public class Main {
    public static void main(String[] args) {
        task1_2_3_4();
    }
    public static void task1_2_3_4(){
        System.out.println("Задание 1");
        int firstArray[] = new int[] {1,2,3};
        double secondArray[] = {1.57, 7.654, 9.986};
        String stringArray[] = {"one","two","three"};

        System.out.println("Задание 2");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i != firstArray.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i != secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i != stringArray.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = firstArray.length-1; i >= 0 ; i--) {
            System.out.print(firstArray[i]);
            if (i != 0) {
            System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = secondArray.length-1; i >= 0 ; i--) {
            System.out.print(secondArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = stringArray.length-1; i >= 0 ; i--) {
            System.out.print(stringArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}