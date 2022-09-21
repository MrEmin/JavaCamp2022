package oop1;

import java.util.Arrays;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		//Veri türü - ismi - veri.
		String mesaj = "Vade oranı";
		
		//Bir class değişkeni oluşturmanın yöntemi budur.
		Product product1 = new Product();
		
		//set value(değer atama)
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
	
		
		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			//get()
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05534323432");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Muhammet Emin");
		individualCustomer.setLastName("Özdemir");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("02123545121");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("1111111111");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}

}
