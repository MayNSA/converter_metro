package converter;

import java.util.Scanner;

public class Converssor {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double metros;
		
		System.out.println("============================================");
		System.out.print("Digite uma distância em metros: ");
		metros = ler.nextDouble();
		
		double km = metros * 0.001;
		double hm = metros * 0.01;
		double dam = metros * 0.1;
		
		double dm = metros * 10;
		double cm = metros * 100;
		double mm = metros * 1000;
		
		System.out.println("============================================");
		System.out.println("A distância de " + metros + "m correspode a: ");
		System.out.println();

		System.out.println(km + " Km" + "     " + dm + " dm");
		System.out.println(hm + " Hm" + "     " + cm + " cm");
		System.out.println(dam + " Dam" + "     " + mm + " mm");

	}

}
