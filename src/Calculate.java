public class Calculate {


    public static void calculateInside(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
            if (sum > 10000) {
                throw new RuntimeException("Cумма больше 10000");
            }



        }System.out.println("Общая сумма: " + sum);
        ;

    }
}
