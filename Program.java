package lesson2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        MyArrayList<Integer> list = new MyArrayList<>();
        int repit = 5;
        long[] arrTimeInsert = new long[repit];
        long[] arrTimeSelect = new long[repit];

        for (int i = 0; i < repit ; i++) {
            list.initArr(6,10006);


            long start = System.currentTimeMillis();
            list.insertionSort(Integer::compareTo);
            long end = System.currentTimeMillis();
            long result = end - start;
            arrTimeInsert[i] = result;

           // System.out.println( "Время выполнения: " + result);
           // System.out.println("Отсортированный массив: " + list);
        }

        for (int i = 0; i < repit ; i++) {
            list.initArr(6,10006);


            long start = System.currentTimeMillis();
            list.selectionSort(Integer::compareTo);
            long end = System.currentTimeMillis();
            long result = end - start;
            arrTimeSelect[i] = result;

            //System.out.println( "Время выполнения: " + (end - start));
            //System.out.println("Отсортированный массив: " + list);
        }
        System.out.println("|" +"№пп" + "|" + "Сортировка"+"|" + "Сортировка" +"|");
        System.out.println("|" +"    " + "|" + " вставками"+"|" + "   выбором" +"|");
        System.out.println("|" +"----" + "|" + "----------"+"|" + "----------" +"|");
        printTime(arrTimeInsert,arrTimeSelect);
        System.out.println("|" +"----" + "|" + "----------"+"|" + "----------" +"|");
        System.out.println("|" +"ср.з" + "|" +"\t"+ mediumTime(arrTimeInsert)+"|" +"\t\t"+ mediumTime(arrTimeSelect) +"|");
        System.out.println("|" +"----" + "|" + "----------"+"|" + "----------" +"|");



    }
    public static void printTime (long[] arr1, long[] arr2){
        int number = 1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("|" +"\t"+ number + "|" +"\t"+ arr1[i] + "|" +"\t\t\t"+ arr2[i] +"|");
            number++;
        }
    }

    public static long mediumTime (long[] arr){
        long summ = 0;
        for (int i = 0; i <arr.length ; i++) {
            summ += arr[i];
        }
        return summ/arr.length;
    }
}
