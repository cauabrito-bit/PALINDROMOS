import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> listNum = new ArrayList<>();
		listNum.add(121);
		listNum.add(212);
		listNum.add(131);
		listNum.add(211);
		ArrayList<Integer> panaonao = new ArrayList<>();
		ArrayList<Integer> palili = new ArrayList<>();
		
		for(Integer num : listNum) {
			Palindromo i = new Palindromo (num);
			boolean resultado = i.BOLONHESA();
			
			if (resultado == true) {
				palili.add(num);
			} else {
				panaonao.add(num);
			}
		}
		System.out.println("PALINDROMOS ENCONTRADOS: ");
		for(Integer n : palili) {
			System.out.println(n);
		}
		System.out.println("NAO PALINDROMOS ENCONTRADOS: ");
		for(Integer x : panaonao) {
			System.out.println(x);
		}
	}

}
