package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		Integer months = sc.nextInt();
		
		ContractService contractService = new ContractService(new Contract(number,date,contractValue), months);
		contractService.processContract((OnlinePaymentService) new PaypalService());
		
		System.out.println("Installments:\n" + contractService.getContract().showInstallments());
		
		
		sc.close();
	}

}
