package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[20];
       Initializer a = new FibonacciInitializer(); 
       a.initialize(array);
       System.out.println("Сумма Фибоначи массива[20] = " + getSum(array));
       System.out.println();
       Initializer b = new RandomInitializer(-50, 50);
       b.initialize(array);
       

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
    // Вычисление суммы элементов массива:
    static public int getSum(int[] array){
          int sum = 0;
           for (int i = 0; i < array.length; i++){
           sum += array[i]; 
           }
           return sum;
       }
}
