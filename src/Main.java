import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();

    }


    // 1
    public static void task1() {

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] decimals = {1.57, 7.654, 9.986};
        String[] num = {"6", "7", "8"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }


    // 2
    public static void task2() {

        int[] array1 = {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {6, 7, 8,};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // 3
    public static void task3() {

        int[] array1 = {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {6, 7, 8};
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // 4
    public static void task4() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}