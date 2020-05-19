package tgs9;

/*
Nama      : Irma Nurkhofifah M.
Kelas     : B2
hari/tgl  : Kamis, 7 Mei 2020
tugas 9 PBO
 */
public class GenericMethod {
    public static<E> void printArray(E[] inputArray){
        for(E element : inputArray)
            System.out.printf("%s",element);
            System.out.println(" ");
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5} ;
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'J','A','V','A'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
    }
}
