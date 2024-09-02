package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class Program {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\gabriel.souza\\Downloads\\gabriel\\workspace\\WK - eclipse\\desafio 3\\src\\resources\\faturamento.json";
		// Caso for verificar para teste, trocar o diretorio da onde está salvo no seu computador o "faturament.json";
		
		try {	
			String content = new String(Files.readAllBytes(Paths.get(filePath)));
			JSONObject json = new JSONObject(content);
			JSONArray faturamentoDiario = json.getJSONArray("faturamentoDiario");
			
			int minFaturamento = Integer.MAX_VALUE;
			int maxFaturamento = Integer.MIN_VALUE;
			int somaFaturamento = 0;
			int diasComFaturamento = 0;
			
			for(int i=0; i < faturamentoDiario.length(); i++) {
				JSONObject dia = faturamentoDiario.getJSONObject(i);
				int valor = dia.getInt("valor");
				
				
				if(valor > 0) {
					
					if(valor < minFaturamento) minFaturamento = valor;
					if(valor > maxFaturamento) maxFaturamento = valor;
					somaFaturamento += valor;
					diasComFaturamento++;
				} 
			}
			
			double mediaFaturamento = diasComFaturamento > 0 ? (double) somaFaturamento / diasComFaturamento : 0;
			int diasAcimaMedia = 0;
			
			for(int i=0; i < faturamentoDiario.length(); i++) {
				JSONObject dia = faturamentoDiario.getJSONObject(i);
				int valor = dia.getInt("valor");
				
				if(valor > mediaFaturamento) diasAcimaMedia++;
			}
			
			System.out.println("Menor valor de faturamento: " + minFaturamento);
			System.out.println("Maior valor de faturamento: " + maxFaturamento);
			System.out.println("Número de dias com faturamento acima da media: " + diasAcimaMedia);
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
