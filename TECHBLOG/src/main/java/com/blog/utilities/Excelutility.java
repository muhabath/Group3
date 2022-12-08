package com.blog.utilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelutility {
	
	
	
	public static String[][] getCellData()throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+"testdat.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);
		int rows = excelSheet.getPhysicalNumberOfRows();//3
		int cols = excelSheet.getRow(0).getPhysicalNumberOfCells();//2
		String data[][]= new String[rows][cols];
		XSSFCell cell;
		for(int i =0 ; i< rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				cell = excelSheet.getRow(i).getCell(j);
				String cellContents=cell.getStringCellValue();
				data[i][j] = cellContents;
				System.out.println(data[i][j]);
			}
		}
		return data;
	}

	
}

	
	
	

