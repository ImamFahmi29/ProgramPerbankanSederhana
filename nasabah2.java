    import java.io.*;
	import java.util.Scanner;
    class tabungan {
    String bank;
    String nama_nasabah;
    String rekening;
    int nabung;
    int penarikan;


    void saldo2() {
     System.out.println ("SALDO ANDA = "+ (nabung - penarikan));
    }

    }
    public class nasabah2 {
    static Scanner input=new Scanner (System.in);

    public static void main(String[] bank) throws Exception {
    tabungan t;
    t= new tabungan();
	 System.out.println("\n\n\n =========================================");
    System.out.println("\n\n\t   [ THE BANK OF DOA IBU ]\n\t MELAYANI DENGAN PENUH CINTA");
	System.out.println("\n\n =========================================");
	System.out.println(" Selamat Datang,");
    System.out.println(" Tekan Enter Untuk Melanjutkan...");
	String caset=input.nextLine();
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n");

   
    boolean status = false;
    int kembali=0;
    while (kembali!=1){
    System.out.println();
    System.out.println("+==============THE BANK OF DOA IBU==============+");
    System.out.println("+===============================================+");
    System.out.println();
    System.out.println("+____________________*MENU*_____________________+");
    System.out.println("| 1. MENABUNG  |");
    System.out.println("| 2. PENARIKAN |");
    System.out.println("| 3. CEK SALDO |");
    System.out.println("| 4. VIEW DATA |");
    System.out.println("| 5. EXIT      |");
    System.out.println("+_______________________________________________+");
    System.out.println();
    System.out.print("Silahkan Masukan Pilihan Anda : ");
    int pilihan=Integer.parseInt(input.next());
    switch(pilihan){
    case 1:
    System.out.println ("SILAHKAN MASUKAN DATA ANDA");
	System.out.println ("NAMA NASABAH :");
    t.nama_nasabah =  input.next();
    System.out.println ("NO REKENING: ");
	t.rekening =  input.next();
    System.out.println ("MENABUNG: ");
	t.nabung =  input.nextInt();
    status = true;
    System.out.println("________________________________________________");
    System.out.println();
    System.out.println("Tekan Enter Untuk Kembali.....");
    String case1=input.nextLine();
    kembali=0;
    break;

    case 2:
    if (status == true){
		System.out.print ("\nMasukkan Jumlah Tarik Tunai: Rp. ");
		t.penarikan =  input.nextInt();
		System.out.print ("\nPenarikan Tunai Berhasil...");
		}
    else {
    System.out.println ("MAAF TABUNGAN ANDA TIDAK ADA");
     }
	System.out.println("\n________________________________________________");
	String case2=input.nextLine();
	System.out.print("\n\n\n\n\n\n\n\n\n");
    break;

   case 3:
  
    break;

    case 4:
   

    break;

    case 5:
   
    break;

    }
    }
    }


}