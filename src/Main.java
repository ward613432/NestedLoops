public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            PrintFigure(i);
        }
        System.out.println();

        for (int i = 5; i >= 1; i--) {
            PrintFigure(i);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            PrintFigure(5);
        }
    }

    public static void PrintFigure(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}