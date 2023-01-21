public class Main {
    public static void main(String[] args) {
        task1task2();
        task3();
        task4();
    }
    public static void task1task2(){
        System.out.println("Задание 1, Задание 2");
        int firstArray[] = new int[] {1,2,3};
        double secondArray[] = {1.57, 7.654, 9.986};
        String stringArray[] = {"one","two","three"};
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]+ " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задание 3");
    }
    public static void task4(){
        System.out.println("Задание 4");
    }
}