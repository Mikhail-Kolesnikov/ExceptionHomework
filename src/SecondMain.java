public class SecondMain {
    public static void main(String[] args) {
        CompareNumbers compareNumbers = new CompareNumbers();
        try {
            compareNumbers.compareInside(3,6);

        } catch (FirstException e) {

            e.printStackTrace();

        }
    }
}