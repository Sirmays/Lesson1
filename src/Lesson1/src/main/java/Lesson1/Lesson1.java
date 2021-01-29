package Lesson1;

public class Lesson1 {

    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte a = 50;
        short b = 15387;
        int c = 265965652;
        long d = 621651465544L;
        float e = 151.95F;
        double f = 95965.28;
        char g = 'a';
        boolean h = false;

        System.out.println(calculate(1, 2, 3, 4));

        System.out.println(tenTwenty(15, 1));

        negativeOrPosotive(-2);

        System.out.println(negativeOrPositive2(2));

        callName("Потап");

        year(2400);

    }

    // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float calculate(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
// в противном случае – false.
    public static boolean tenTwenty(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void negativeOrPosotive(int a) {
        if (a < 0) {
            System.out.println("a - отртицательное");
        } else {
            System.out.println("a - положительное");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean negativeOrPositive2(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void callName(String name) {
        System.out.println("Привет, " + name);

    }
    //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void year(int a) {
        if ((a % 100 != 0) && (a % 4 == 0) || (a % 400 == 0)) {
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - невисокосный год");
        }
    }
}



