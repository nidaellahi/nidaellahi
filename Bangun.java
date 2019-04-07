import java.util.Scanner;

public class Bangun {

	public static void main(String[] args) {
	Main x = new Main();
	Scanner scan = new Scanner(System.in);
	double pilihan;
	System.out.println("Bangun Datar");
	System.out.println("-------------");
	System.out.println("1. Persegi");
	System.out.println("2. Persegi Panjang");
	System.out.println("3. Lingkaran");
	System.out.println("4. Segitiga");
	System.out.println("-------------");
	System.out.println("Bangun Ruang");
	System.out.println("-------------");
	System.out.println("5. Kubus");
	System.out.println("6. Balok");
	System.out.println("7. Bola");
	System.out.println("-------------");
	System.out.println("Masukkan pilihan :");
	pilihan= scan.nextDouble();
	
	int masukan = 0;
	if(pilihan == 1)
		x.persegi();
	else if(pilihan == 2)
		x.persegipanjang();
	else if(pilihan == 3)
		x.lingkaran();
	else if(pilihan == 4)
		x.segitiga();
	else if(pilihan == 5)
		x.kubus();
	else if(pilihan == 6)
		x.balok();
	else if(pilihan == 7)
		x.bola();
	else
		System.out.println("Pilihan Tidak Tersedia");

	}

}
