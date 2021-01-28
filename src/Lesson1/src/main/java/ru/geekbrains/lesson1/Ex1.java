package ru.geekbrains.lesson1;

public class Ex1 {
    public static void main(String[] args) {  // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
        byte a = 50;                           // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        short b = 15387;
        int c = 265965652;
        long d = 621651465544L;
        float e = 151.95F;
        double f = 95965.28;
        char g = 'a';
        boolean h = false;
    }

    // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
// 4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false.
    public static boolean tenTwenty(int a, int b) {
        int c = a + b;
        if (c >= 10 || c <= 20)
        {
            return true;
        }
        else
            {
            return false;
        }
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
public static void negativeOrPosotive (int a) {
        if (a < 0) {
        System.out.println("a - отртицательное");
    }
        else {
        System.out.println("a - положительное");
    }

}
}


