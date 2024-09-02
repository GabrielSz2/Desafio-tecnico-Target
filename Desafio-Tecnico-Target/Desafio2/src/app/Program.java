package app;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		int test1 = 1;
		System.out.println(testFibonacci(test1));
		
		int test2 = 377;
		System.out.println(testFibonacci(test2));
		
		int test3 = 200;
		System.out.println(testFibonacci(test3));
		
		int test4 = 300;
		System.out.println(testFibonacci(test4));
		
		// A minha sequencia de Fibonnaci possui 30 números;
		
	}
	
	public static String testFibonacci(int num) {
		List <Integer> fibo = new ArrayList<>();
		int valorAntigo=0, valorAtual=1, proximoValor=0;
		
		fibo.add(valorAntigo);
		fibo.add(valorAtual);
		
		for(int i=0; i<= 30; i++) {
			proximoValor = valorAntigo + valorAtual;
			valorAntigo = valorAtual;
			valorAtual = proximoValor;
			
			fibo.add(proximoValor);
		}
		
		for(Integer fiboNum : fibo) {
			if(fiboNum == num) {
				return "Pertence a sequencia!";
			}
		}
		return "não pertence a sequencia!";
		
	}
}
