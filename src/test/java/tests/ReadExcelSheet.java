package tests;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelSheet {
  @Test
  public void ReadExcelData() throws Exception {
	  String path = System.getProperty("user.dir");
	  System.out.println(path);
	  
	  File file = new File (path+"\\src\\test\\resources\\TestData\\Test dataSample.xlsx");
	  FileInputStream fis = new FileInputStream(file);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  Sheet sheet = wb.getSheetAt(0);
	  int rowCount = sheet.getPhysicalNumberOfRows();
	  System.out.println(rowCount);
	  int columncount = sheet.getRow(0).getPhysicalNumberOfCells();	
	  System.out.println(columncount);
//	  String v1 = sheet.getRow(0).getCell(0).getStringCellValue();
//	  String v2 = sheet.getRow(0).getCell(1).getStringCellValue();
//	  String v3 = sheet.getRow(0).getCell(2).getStringCellValue();
//	  System.out.println(v1+"\t"+v2+"\t"+v3);
	  for(int i = 0;i< rowCount;i++) {
		  for (int j = 0;j<columncount;j++) {
			  String value =sheet.getRow(i).getCell(j).getStringCellValue();
			  System.out.println(value+"\t");
		  }
			System.out.println();  
		  }
		  wb.close();
		  fis.close();
	  }
	  
  }

