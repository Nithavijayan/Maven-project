package bank.pkge4;

import java.io.IOException;
import java.util.Scanner;

import bank.pkge2.SbiMethods;
import bank.pkge3.FederalMethods;

public class UserDetails {

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which bank you prefer--SBI--- OR ---FEDERAL---");
		String bank;
		bank=sc.nextLine();
		if(bank.equals("sbi"))
			{
				SbiMethods sbi=new SbiMethods();
				sbi.excelData();
				sbi.withdrawal(50000);
				System.out.println("Simple interest "+sbi.calculate());
			}
		
		else if(bank.equals("federal"))
			{
			FederalMethods federal=new FederalMethods();
			federal.readData();
			federal.withdrawal(60000);
			System.out.println("Compound interest "+federal.calculate());
			}
		
		else
			System.out.println("you not selected any bank");
		
		// TODO Auto-generated method stub

	}

}
