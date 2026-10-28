
public class Palindromo { // criacao oadrao da classe palindromo
	private int x;
	private int reverso;
	private int original;
	
	public Palindromo(int x) { // constructor
		this.x = x;
	}
	public boolean ehPalindromo() { // metodo de verificaco
			if(this.x < 0) { // numero negativos n podem ser palindromos
				return false;
				}
			int tx = this.x;
			int origin = this.x; // origin recebe o valor da variavel x para comparacao ao final do codigo
			int resto = 0; // criamos uma variavel para receber os restos(numero final da divisao)
			
			while( tx > 0) { // enquanto o numero for maior q 0 percorra nosso codigo
				int digito = tx %10; // criamos digito que recebe o resto (o ultimo digito na divisao por 10)
				resto = (resto * 10) + digito; // multiplico reverso por 10 e somo com digito
				tx = tx /10; // x recebe o somente os numeros apos a virgula por ser uma variavel int cortando oq vem dps
			}
			this.original = origin;
			this.reverso = resto ;
			 return this.original == this.reverso; // comparando se os valores sao iguais e retornando isso como resultado boolean

	}
	public int getOriginal() {
		return this.original;
	}
	public int getReverso() {
		return this.reverso;
	}

}
