public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1.2
        System.out.println("Задание 1.2");
        for (int y = 1904; y <= 2096; y++) {
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            System.out.println(y + " год является високосным");
        }
        // Задание 2.2
        System.out.println("Задание 2.2");
        for (int z = 7; z <= 98; z += 7) {
            System.out.print(z + " ");
        }
        System.out.println();

        // Задание 3.2
        System.out.println("Задание 3.2");
        for (int e = 1; e <= 512; e *= 2) {
            System.out.print(e + " ");
        }
        System.out.println();
        //
    }
}