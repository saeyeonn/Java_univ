public class Q1_SwitchCase {
    public static void main(String[] args) {
        int i = 0;
        switch (i) {
            case 1 -> System.out.println("!");
            case 2 -> System.out.println("@");
            case 3 -> System.out.println("#");
            default -> System.out.println("*");
        }
    }
}
