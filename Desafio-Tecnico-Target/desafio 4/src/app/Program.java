package app;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;

		double faturamentoTotal = SP + RJ + MG + ES + Outros;

		System.out.println("Percentual SP: " + calcularPercentual(SP, faturamentoTotal));
		System.out.println("Percentual RJ: " + calcularPercentual(RJ, faturamentoTotal));
		System.out.println("Percentual MG: " + calcularPercentual(MG, faturamentoTotal));
		System.out.println("Percentual ES: " + calcularPercentual(ES, faturamentoTotal));
		System.out.println("Percentual Outros: " + calcularPercentual(Outros, faturamentoTotal));

	}

	public static String calcularPercentual(Double num, double total) {
		double percentual = (num / total) * 100;
		return String.format("%.1f", percentual) + "%";
	}
}
