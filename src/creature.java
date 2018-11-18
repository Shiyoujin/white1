public class creature {
    public static void main(String[] args) {
        sale(-3);
//        sale(-3);
    }

    public static void sale(int money) {
        if (money <= 0) {
            return;

        }
        for (int x = 1; x <= money; x++) {
            System.out.println("王健开笑，第" + x + "次");
        }
    }
} //