package com.ictak.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	private static XSSFCell cell;
	
	public static String getCellData(int i,int j) throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/techblogtest.xlsx");
		excelWBook=new XSSFWorkbook(ExcelFile);
		excelWSheet=excelWBook.getSheetAt(0);
		
		return excelWSheet.getRow(i).getCell(j).getStringCellValue();
		
	}
	public static String getCellData1(int i,int j) throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/techblogtest.xlsx");
		excelWBook=new XSSFWorkbook(ExcelFile);
		excelWSheet=excelWBook.getSheetAt(1);
		return excelWSheet.getRow(i).getCell(j).getStringCellValue();
		
	}
	public static String getCellData2(int RowNum,int ColNum) throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/techblogtest.xlsx");
		excelWBook=new XSSFWorkbook(ExcelFile);
		excelWSheet=excelWBook.getSheetAt(2);
		return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
	}
}

