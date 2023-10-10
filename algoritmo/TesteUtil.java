package algoritmo;

public class TesteUtil {

	public static void main(String[] args) {
		testarSomar();
		testarAjustarNota();
		testarCalcularMedia();
		testarVerificarAprovacaoCompleta();
	}
	
	public static void testarSomar() {
		int soma = Util.somar(60, 9);
		System.out.println(soma);
	}
	
	public static void testarAjustarNota() {
		double num = Util.ajustarNota(5);
		System.out.println(num);
	}
	
	public static void testarCalcularMedia() {
		double media = Util.calcularMedia(5.2, 8.3, 7.6);
		System.out.println(media);
	}
	
	public static void testarVerificarAprovacaoCompleta() {
		String verificado = Util.verificarAprovacaoCompleta(4.6, 9.2, 10, 0.75);
		System.out.println(verificado);
	}

}
