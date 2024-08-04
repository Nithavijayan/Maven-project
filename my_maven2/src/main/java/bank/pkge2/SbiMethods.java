package bank.pkge2;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import bank.pkge1.RbiInterface;

public class SbiMethods implements RbiInterface
{
	
	
	XSSFSheet sh;

	double amt;
	double yr;
	double rate;
	
	Cell amount;
	Cell years;
	Cell interest;
	
	public SbiMethods() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\91984\\git\\Maven-project\\my_maven2\\src\\main\\resources\\excelpgm1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fp);
		sh=w.getSheet("sheet1");
	}
	
	public void excelData()
	{
		/*for(Row r: sh)
		{
			for(Cell c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}*/
		amount=sh.getRow(0).getCell(1);//cell selected
		amt=amount.getNumericCellValue();//value read in amt
		
		interest=sh.getRow(1).getCell(1);
		rate=interest.getNumericCellValue();
		
		years=sh.getRow(2).getCell(1);
		yr=years.getNumericCellValue();
	
	}
	@Override
	public void withdrawal(float amount) 
	{
		
		if(amount>30000)
			System.out.println("---you should provide your pan details---");
		
	}
	public double calculate() 
	{
		double simpleInterest=amt*rate*yr;
		// TODO Auto-generated method stub
		return simpleInterest;
		
	
		
	}
	
}
