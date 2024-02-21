package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Ошибка деления на 0
        // int c = calc.devide.apply(a, b);

        // Добавляем проверку на то, что делитель не равен нулю
        // Или возвращаем 0
        int c =  calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
