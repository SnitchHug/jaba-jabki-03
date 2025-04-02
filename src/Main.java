public class Main {
    public static void main(String[] args) {

        // 1.1
        int numberEven = 10;

        if (numberEven % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        // 1.2
        int numberGreater = 20;
        int numberLess = 10;

        if (numberGreater > numberLess) {
            System.out.println("Первое больше");
        } else if (numberGreater < numberLess) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        // 1.3
        int numberPositive = 10;

        if (numberPositive > 0) {
            System.out.println("Положительное");
        } else if (numberPositive < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        // 1.4
        int numberAge = 18;

        if (numberAge >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        // 1.5
        String colour = "Green";

        if (colour.equals("Green")) {
            System.out.println("Иди");
        } else if (colour.equals("Yellow")) {
            System.out.println("Внимание");
        } else {
            System.out.println("Стой");
        }

        // 2.1
        int numberNegative = -4;
        System.out.println(numberNegative > 0 ? "положительное" : (numberNegative == 0 ? "нулевое" : "отрицательное"));

        // 2.2
        int numberToDivide = 509;
        System.out.println(numberToDivide % 3 == 0 && numberToDivide % 5 == 0 ? "Кратно" : "Не кратно");

        // 2.3
        int numberOdd = 33;
        System.out.println(numberOdd % 2 == 0 ? "Четное" : "Нечетное");

        // 3.1
        int numberFriday = 5;

        switch (numberFriday) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка");
        }

        // 3.2
        int numberGood = 4;

        switch (numberGood) {
            case 1:
                System.out.println("Нельзя отправлять");
                break;
            case 2:
                System.out.println("Ужасно");
                break;
            case 3:
                System.out.println("Приемлемо");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Неоценимо");
        }

        // 4.1
        int numberSum = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                numberSum += i;
            }
        }
        System.out.println(numberSum);

        // 4.2
        int numberMax = 0;

        for (int i = 0; i < 20; i++) {
            if (i > numberMax) {
                numberMax = i;
            }
        }
        System.out.println(numberMax);

        // 4.3 добавил произведение в вывод
        int numberMultiSeven = 7;

        for (int i = 1; i < 11; i++) {
            System.out.printf("%s * %s = %s\n", numberMultiSeven, i, numberMultiSeven * i);
        }

        // 4.4
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 4.5
        int numberCount = 0;

        for (int i = 1; i < 51; i++) {
            if (i % 2 == 0) {
                numberCount++;
            }
        }
        System.out.println(numberCount);

        // 5.1 поменял условие while и if, и значение переменной
        int y = 7;

        while (y % 7 == 0) {
            if (y > 99) {
                System.out.println(y);
                break;
            }
            y += 7;
        }

        // 5.2
        int b = 10;
        int factorial = 1;
        int x = 1;

        while (x <= b) {
            factorial = factorial * x;
            x++;
        }
        System.out.println(factorial);

        // 5.3 добавил пробел после if
        int numberSimple = -4;
        int m = 2;
        String result = "Число простое";

        if (numberSimple > 1) {
            while (m < numberSimple){
                if (numberSimple % m == 0) {
                    result = "Число не простое";
                    break;
                }
                m++;
            }
        } else {
            result = "Число не простое";
        }
        System.out.println(result);

        // 5.4
        int numberSkittles = 1;

        while (numberSkittles <= 10) {
            if (numberSkittles < 10) {
                System.out.printf("Осталось %s\n", numberSkittles);
            } else {
                System.out.println("Страйк!");
            }
            numberSkittles++;
        }

        // 6.1 убрал else из конструкции if
        for (int i = 1; i <= 20 ; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 6.2 увеличен диапазон, добавленая конструкция if
        int v = 0;

        for (int i = 20; i > -5; i--) {
            if (i < 0) {
                break;
            }
            v += i;
        }
        System.out.println(v);

        // 6.3 упростил условие в if
        int g = 0;

        for (int i = 1; i > 0; i++) {
            g += i;
            if (g > 99) {
                System.out.println(g);
                break;
            }
        }
    }
}