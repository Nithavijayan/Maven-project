package bank.pkge3;

import java.io.*;
//import java.io.IOException;
import java.lang.Math;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import bank.pkge1.RbiInterface;

public class FederalMethods implements RbiInterface
{
	
	XSSFSheet sh;
	
	Cell amount;
	Cell interest;
	Cell years;
	
	double amt;
	double rate;
	double yr;

	public FederalMethods() throws IOException
	{
		FileInputStream filepath=new FileInputStream("C:\\Users\\91984\\git\\Maven-project\\my_maven2\\src\\main\\resources\\excelpgm1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(filepath);
		sh=w.getSheet("sheet1");
	}
	@Override
	public void withdrawal(float amount) 
	{
		if(amount>50000)
			System.out.println("---you should provide your pan details---");
		// TODO Auto-generated method stub
		
	}

	public void readData()
	{
		amount=sh.getRow(4).getCell(1);
		amt=amount.getNumericCellValue();
		
		interest=sh.getRow(5).getCell(1);
		rate=interest.getNumericCellValue();
		
		years=sh.getRow(6).getCell(1);
		yr=years.getNumericCellValue();
	}
	@Override
	public double calculate()
	{
		double compoundinterest=amt*Math.pow((1+rate/100),yr);
		return compoundinterest;
		
		
	}
	
}
