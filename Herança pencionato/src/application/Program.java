package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);
		System.out.println("Digite a quantidade de pessoas para tirar media: ");
		int n = in.nextInt(); 
		
		Product[] products = new Product [n];
		System.out.println("\n");
		for (int i = 0; i < products.length; i++) {
			System.out.println("Enter with the name of "+(i+1)+"th product:");
			String name = in.next();
			System.out.println("Enter with the price of "+(i+1)+"th product: ");
			double price = in.nextDouble();
			products[i] = new Product(name, price);
		}		
				
		double assist=0.0;
		for (int i = 0; i < products.length; i++) {
			assist += products[i].getPrice();
		}
		
		double avg = assist/n;
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getPrice()+"\n");
		}
		
		System.out.printf("AVARAGE PRICE: %.2f",avg);
		
		
		in.close();
	}

}
