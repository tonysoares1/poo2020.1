package gato1;

public class gato1 {

	String name;
	int vidas;
	void miar() {
		if(this.vidas > 0)
			System.out.println("miau");
		else
			System.out.println("...");
	}	
		void fingirDeMorto() {
			this.vidas -=1;
		
	}
	public static void main(String[] args) {
		gato1 gatho = new gato1 ();
		gatho.name = "gatho barbosa";
		gatho.vidas = 7;
		for(int i = 0; i < 10 ; i +=1) {
			gatho.miar();
			gatho.fingirDeMorto();
			
			 
		}
		
		
	}

}
