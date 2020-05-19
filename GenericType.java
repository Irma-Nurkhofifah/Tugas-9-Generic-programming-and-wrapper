package tgs9;

/*
Nama      : Irma Nurkhofifah M.
Kelas     : B2
hari/tgl  : Kamis, 7 Mei 2020
tugas 9 PBO
 */

public class GenericType {
    public static void main(String[] args) {
        Integer nilai = 90;
        Double IPK = 3.82;
        Character Grade = 'A';
        String Matkul = "PBO";
 
      System.out.println();
      System.out.println("cetak nilai :");
 
      print("Nilai = "+nilai);
      print("IPK = "+IPK);
      print("Grade = "+Grade);
      print("Mata Kuliah = "+Matkul);        
   }
 
   public static <T> void print(T nilai) {
      System.out.println(nilai);      
        }
}

