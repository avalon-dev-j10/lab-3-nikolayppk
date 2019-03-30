package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
   public RandomInitializer(int a1, int b1){
       a = a1;
       b = b1;
    }
    int a;
    int b;

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {   
        for (int i = 0; i < array.length; i++){
            double rand = (int) (Math.random()*(b - a))+ a;
            array[i] = (int)rand;
        }
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
    }
}
