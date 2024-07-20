public class CompareNumbers {
//    public int compare() {
//        try {
//            compareInside();
//        } catch (MainException e)
//    }


    public void compareInside(int first, int second) throws MainException {
        if (first > second) {
            System.out.println("Первое число больше второго");
            throw new MainException();
        }
        System.out.println();
    }
}

//Напишите метод. В него вводится 2 числа. Метод ничего не возвращает, но если второе число больше первого, то бросьте проверяемое исключение.
