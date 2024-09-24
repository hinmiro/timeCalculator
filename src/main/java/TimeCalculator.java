public class TimeCalculator {

    public static double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        System.out.println(calculateTime(400, 80));
        System.out.println(calculateTime(1000, 60));
        System.out.println(calculateTime(50, 0));
    }
}
