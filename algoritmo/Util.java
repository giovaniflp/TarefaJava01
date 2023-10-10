package algoritmo;

public class Util {
	
	public static int somar(int x, int y) {
		
		return x + y;
		
	};
	
	public static int somarPositivo(int x, int y) {
		
		int positiva = x + y;
		
		return Math.abs(positiva);
		
	};
	
	public static double subtrair(double x, double y) {
		
		return x - y;
		
	};
	
	public static double subtrairPositivo(double x, double y) {
		
		double subPositiva = x - y;
		
		return Math.abs(subPositiva);
		
	};
	
	public static int obterResto(int x, int y) {
		
		return x / y;
		
	};
	
	public static double ajustarNota(double nota) {
		
		if (nota < 0) {
			return 0;
		}
		
		else if (nota > 10) {
			return 10;
		}
		
		else {
			return nota;
		}
		
	};
	
	public static double calcularMedia(double nota01, double nota02, double nota03) {
		
		double[] notas = {nota01, nota02, nota03};
		double somaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = ajustarNota(notas[i]);
			somaNotas = somaNotas + notas[i];
		}
		
		return somaNotas / notas.length;
		
	};
	
	public static String verificarAprovacao(double nota01, double nota02, double nota03) {
		
		double calculo = calcularMedia(nota01, nota02, nota03);
		
		if (calculo >= 7) {
			return "APROVADO";
		}
		else if (calculo >= 2 && calculo < 7) {
			return "EXAME FINAL";
		}
		else {
			return "REPROVADO";
		}
		
	};
	
	public static String verificarAprovacaoCompleta(double nota01, double nota02, double nota03, double presencaPorcentagem) {
		
		double calculo = calcularMedia(nota01, nota02, nota03);
		
		if (calculo >= 7 && presencaPorcentagem >= 0.75) {
			return "APROVADO";
		}
		else if (calculo >= 2 && calculo < 7 && presencaPorcentagem >= 0.75) {
			return "EXAME FINAL";
		}
		else if (calculo >= 2 && calculo < 7 && presencaPorcentagem < 0.75) {
			return "REPROVADO POR FALTA";
		}
		else {
			return "REPROVADO";
		}
		
	};
};
