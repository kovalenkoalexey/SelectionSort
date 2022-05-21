import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        long beginArray = System.nanoTime();
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
        long endArray = System.nanoTime();
        System.out.println();
        System.out.println("Массив после сортировки: ");
        for (int j = 0; j < array.length; j++)
            System.out.print(array[j] + " ");
        System.out.println();
        System.out.println("Время сортировки массива: " + (endArray - beginArray) + ".");
        System.out.println();
        System.out.println("ArrayList до сортировки: ");
        for (int l = 0; l < arrayList.size(); l++)
            System.out.print(arrayList.get(l) + " ");
        System.out.println();
        long beginArrayList = System.nanoTime();
        Collections.sort(arrayList);
        long endArrayList = System.nanoTime();
        System.out.println("ArrayList после сортировки: ");
        for (int k = 0; k < arrayList.size(); k++)
            System.out.print(arrayList.get(k) + " ");
        System.out.println();
        System.out.println("Время сортировки ArrayList: " + (endArrayList - beginArrayList));
    }
}