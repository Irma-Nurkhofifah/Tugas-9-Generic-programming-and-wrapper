package tgs9;

/*
Nama      : Irma Nurkhofifah M.
Kelas     : B2
hari/tgl  : Kamis, 8 Mei 2020
tugas 9 PBO
 */
public class LatihanWrapperClass {
    public static void main(String[] args){
        
        Character objChar = new Character('W');
        Byte objByte = new Byte("12");
        Short objShort = new Short("100");
        Integer objInt = new Integer(523);
	Long objLong = new Long(7689);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(82.89f);
        Double objDouble = new Double(34.67);
        
        //Menampilkan Output dari Class Wrapper
        System.out.println("Character: "+objChar);
        System.out.println("Byte: "+objByte);
        System.out.println("Short: "+objShort);
        System.out.println("Integer: "+objInt);
        System.out.println("Long: "+objLong);
        System.out.println("Boolean: "+objBoolean);
        System.out.println("Float: "+objFloat);
        System.out.println("Double: "+objDouble);
    }
}
