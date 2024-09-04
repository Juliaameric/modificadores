package modificadores;

import java.util.Scanner;

public class ObjtPessoaAutomovel {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//cria objt
		Pessoa pessoa = new Pessoa();
		
		String cor, nome;
		int velocidade;
		
		System.out.println("informe a cor d carro");
		cor = ler.next();
		
		System.out.println("informe o nome d carro");
		nome = ler.next();
		
		System.out.println("informe a velocidade d carro");
		velocidade = ler.nextInt();
		
		//utiliza o metodo
		pessoa.compracarro( cor, nome, velocidade);
		
		//utilizando para mostrar o retorno do carro comprado
		Automovel carro = pessoa.getAutomovel();
		
		System.out.println("o carro comprado foi " + carro.getNome()+ " da cor " + carro.getCor() + " que atinge a velocidade de "
		+ carro.getVelocidade());
		
		ler.close();
	}

}
