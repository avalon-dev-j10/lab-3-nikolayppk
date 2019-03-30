package ru.avalon.java.dev.j10.labs.sort;




import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sort(int[] array) {
     int temp;
       int h = 0;//величина интервала
       
       //вычисляем исходное значение интервала
       while(h <= array.length/2)
           h = 2*h + 1;
       
       for(int k = h; k > 0; k = (k-1)/2)
           for(int i = k; i < array.length; i++)
           {
               temp = array[i];
               int j;
               for(j = i; j >= k; j -= k)
               {
                   if(temp < array[j - k])
                       array[j] = array[j - k];
                   else
                       break;
               }
               array[j] = temp;
    
      
      
   }   
        for (int aa = 0; aa < array.length; aa++){
            System.out.print(array[aa] + " ");}
    
 
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
    }
    
}
