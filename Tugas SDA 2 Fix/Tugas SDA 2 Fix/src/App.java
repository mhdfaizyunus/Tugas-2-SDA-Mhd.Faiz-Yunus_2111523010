import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
    LinkedList<String> saya = new LinkedList<String>();

    //Karakter Nama Lengkap "MHD.FAIZ YUNUS"
    saya.add("M");
    saya.add("H");
    saya.add("D");
    saya.add(".");
    saya.add("F");
    saya.add("A");
    saya.add("I");
    saya.add("Z");
    saya.add("");
    saya.add("Y");
    saya.add("U");
    saya.add("N");
    saya.add("U");
    saya.add("S");

    System.out.println("Nama Lengkap Saya yaitu : " + saya);
    System.out.println("size : " + saya.size());
    
    //Soal 1 : Add (Tambahkan) karakter lain yang anda inginkan
    saya.add(5,"L");
    saya.add(8,"P");
    saya.add(1,"O");
    
    System.out.println("List Nama saya setelah ditambahkan beberapa karakter: " + saya); 

    //Soal 2 : Sisipkan Karakter Lain yang Anda Inginkan
    saya.set(3,"K");
    saya.set(1,"I");
    saya.set(6,"N");
    saya.set(12,"G");

    System.out.println("List Nama Saya setelah disisipkan beberapa karakter: " + saya);
   
    //Soal 3 : Hapus (Remove) beberapa karakter yang ingin anda hapus
    saya.remove(6);
    saya.remove(2);
    saya.remove(9);
    saya.remove(1);
    saya.remove(0);
    
    System.out.println("List Nama Saya setelah remove beberapa karakter: " + saya);
    
    // Soal 4 : Buat Fungsi POP dan PUSH pada project anda
    //Fungsi PUSH
    saya.push("H");
    saya.push("P");
    saya.push("T");

    System.out.println("List Nama Saya setelah Fungsi PUSH dijalankan" + saya);
    
    //Fungsi POP
    saya.pop();
    saya.pop();
    System.out.println("List Nama Saya setelah Fungsi POP dijalankan" + saya);
    
    
    System.out.println("List Nama Akhir Saya yaitu sebagai berikut : " + saya);
    System.out.println("size : " + saya.size());
           
}   
    }    
