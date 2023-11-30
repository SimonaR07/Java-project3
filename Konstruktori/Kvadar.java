package Konstruktori;

public class Kvadar {

	public class Kvadar {
		int dolzina;
		int visina;
		int sirina;
		public int getVolumen() {
			return(dolzina*visina*sirina);
		}

		Kvadar(){
			dolzina = 2;
			visina = 3;
			sirina = 4;
		}
		
		Kvadar(int d, int v, int s){
			dolzina = d;
			visina = v;
			sirina = s;
		}
	}
}

	
