import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	void persegi(){
		double luas,kel,sisi;
		System.out.println("Masukkan Panjang Sisi :");
		sisi = scan.nextDouble();
		System.out.println("-------------------");
		luas = sisi * sisi;
		kel = sisi * 4;
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
	}
		
	void persegipanjang() {
		double luas, kel, panjang,lebar;
		System.out.println("Masukkan Panjang :");
		panjang = scan.nextDouble();
		System.out.println("Masukkan Lebar :");
		lebar = scan.nextDouble();
		System.out.println("-------------------");
		luas = panjang * lebar;
		kel = (2*panjang) * (2*lebar);
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
	}
		
	void lingkaran() {
		double luas, kel , jarijari;
		double phi= 3.14;
		System.out.println("Masukkan Panjang Jari-jari :");
		jarijari = scan.nextDouble();
		System.out.println("-------------------");
		luas = phi * jarijari * jarijari;
		kel = 2 * phi * jarijari;
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
	}
	
	void segitiga(){
		double luas, kel, alas , tinggi;
		System.out.println("Masukkan Tinggi :");
		tinggi = scan.nextDouble();
		System.out.println("Masukkan Alas :");
		alas = scan.nextDouble();
		System.out.println("-------------------");
		luas = alas * tinggi * 0.5;
		kel = tinggi * 3;
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
	}
	
	void kubus() {
		double luas, kel, volume, sisi;
		System.out.println("Masukkan Panjang Sisi :");
		sisi = scan.nextDouble();
		System.out.println("-------------------");
		luas = 6 * sisi * sisi;
		kel = 12 * sisi;
		volume = sisi * sisi * sisi;
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
		System.out.println("Volume = " + (int)volume);
	}
	
	void balok() {
		double luas, kel, panjang, lebar, volume, tinggi;
		System.out.println("Masukkan Panjang :");
		panjang = scan.nextDouble();
		System.out.println("Masukkan Lebar :");
		lebar = scan.nextDouble();
		System.out.println("Masukkan tinggi :");
		tinggi = scan.nextDouble();
		System.out.println("-------------------");
		luas = ((2*(panjang * lebar)) + (2*(panjang * tinggi)) + (2*(lebar * tinggi)));
		kel = (4*(panjang + lebar + tinggi));
		volume = panjang * lebar * tinggi;
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
		System.out.println("Volume = " + (int)volume);
		
	}
	
	void bola() {
		double phi = 22/7;
		double luas, kel, volume, jarijari;
		System.out.println("Masukkan Jari-jari :");
		jarijari = scan.nextDouble();
		System.out.println("-------------------");
		luas = 4 * phi * (jarijari*jarijari);
		kel = 4/3 * phi * (jarijari *jarijari) ;
		volume = 4/3 * phi * (jarijari*jarijari*jarijari);
		System.out.println("Luas = " + (int)luas);
		System.out.println("Keliling = " + (int)kel);
		System.out.println("Volume = " + (int)volume);
	}
	
	public Main() {
		
	}
}
