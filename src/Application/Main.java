package Application;

import Entities.Fila;

public class Main {

	public static void main(String[] args) {
		
		Fila f;
		int e;
		f = new Fila();
		
		f.inserir(176);
		f.inserir(952);
		f.inserir(46);
		f.inserir(1329);
		f.inserir(457);
		
		System.out.println("Bem vindos ");
		System.out.println("Servimos muito bem");
		System.out.println("Atendimento-----------");
		
		while(!f.isEmpty()) {
			
			e = f.retirar();
			System.out.println("Senha a ser atendida no guinche "+e);
			
		}

	}

}
