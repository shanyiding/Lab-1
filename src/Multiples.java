public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println("Count of multiples of 3 or 5 below 1000: " + count);
    }
}