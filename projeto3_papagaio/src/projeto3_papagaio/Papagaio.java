package projeto3_papagaio;

import java.util.Scanner;

public class Papagaio {
	String name;
	int vida;
	int biscoito;
	int passos;
	
	void comerBiscoito() {
		this.biscoito +=1 ;
		if(this.biscoito == 3 ) {
			this.vida -= 1 ;
			System.out.println("o papagaio morreu por comer demais");
		}
	}
			
	void andar() {
		this.passos +=1;
		System.out.println("O papagaio pipo está andando");
		
	}
	
	void falar() {
		System.out.println("Olá eu sou o papagaio pipo!");
	}
	
	void contar() {
		System.out.println("1,2,3,4 !");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Papagaio papagaio = new Papagaio();
		papagaio.name = "pipo";
		papagaio.vida = 1;
		papagaio.biscoito = 0;
		papagaio.passos = 0;

		
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("ande")) {
				papagaio.andar();
			}else if(ui[0].equals("fale")) {
				papagaio.falar();
			}else if(ui[0].equals("conte")) {
				papagaio.contar();	
			}else if(ui[0].equals("coma")) {
				papagaio.comerBiscoito();
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();

	}
}
