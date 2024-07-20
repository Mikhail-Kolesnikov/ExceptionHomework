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

//2.1. Напишите метод. В него вводится целое число - он выводит сумму всех чисел от 1 до этого числа. Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.
