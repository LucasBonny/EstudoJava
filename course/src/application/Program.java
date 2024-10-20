package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		Product product;
		product = new Product();
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println("\nProduct data: " + product);
		System.out.print("\nEnter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println("\nUdated data: " + product);
		System.out.print("\nEnter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println("\nUpdated data: " + product);
		sc.close();
	}

}
