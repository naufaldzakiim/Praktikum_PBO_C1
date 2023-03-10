/**
 * File      : Titik.java				22/02/23
 * Penulis   : Naufal Dzaki Imtiyaz
 * Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 * 
 */

public class Titik {
	double absis;
	double ordinat;
	static int counterTitik; //menghitung objek titik
	
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	static int getCounterTitik(){
		return counterTitik;
	}
}