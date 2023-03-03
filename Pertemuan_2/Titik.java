/**
 * File      : Titik.java				01/03/23
 * Penulis   : Naufal Dzaki Imtiyaz
 * Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat (setelah ditambahkan enkapsulasi)
 * 
 */

public class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik; //menghitung objek titik
	
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public static int getCounterTitik(){
		return counterTitik;
	}
}