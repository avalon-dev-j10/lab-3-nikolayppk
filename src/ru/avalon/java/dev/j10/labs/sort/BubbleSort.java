package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Пузырьковая сортировка (англ. bubble sort).
 *
 * <p>Простой алгоритм сортировки. Для понимания и
 * реализации этот алгоритм — простейший, но эффективен он
 * лишь для небольших массивов. Сложность алгоритма: O(n^2).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%BF%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC">Пузырьковая сортировка</a>
 */
public class BubbleSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
        for(int i = array.length - 1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            if( array[j] > array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
        }
    }
         for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        /*int a; //промежуточная переменная
        char b = 0; // переменная проверки окончания цикла
        int i = 0;
        while (i < array.length){
            if (array[i] > array[i + 1] && i + 1 != array.length) {
                a = array[i];
                array[i] = array[i + 1];
                array[i + 1] = a;
                b = 1;
            }
                i++;  
            if (i == array.length && b == 1){
                i = 0;
                b = 0;
            }
        }*/
        
        
        
        
        /*
         * TODO(Студент): Реализовать метод sort класса BubbleSort
         */
    }
}
