public class Calculate {


    public  void calculateInside(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
            if (sum > 10000) {
                throw new SecondException();
            }



        }System.out.println("Общая сумма: " + sum);
        ;

    }
}

//2.1. Напишите метод. В него вводится целое число - он выводит сумму всех чисел
// от 1 до этого числа. Если сумма вышла больше 10_000, то бросьте непроверяемое исключение.
