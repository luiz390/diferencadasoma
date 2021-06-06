package diferencadenumero;

import java.util.Scanner;

public class MultiplicacaoEDiferenca {

	public static void main(String[] args) {
		// DIFEREÇA DA MULTIPLICAÇÃO
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int diferenca;      
		
		diferenca = A*B - C * D;
		
		System.out.println("A DIFERENÇA DA OPREAÇÃO FOI "+ diferenca);
		

	}

}
