package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public FileInputStream fis;
	
	public String getStringDataFromExcel(String sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	
	public double getNumericDataFromExcel(String sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public boolean getBooleanDataFromExcel(String sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getBooleanCellValue();
	}
	
	public LocalDateTime getDateDataFromExcel(String sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getLocalDateTimeCellValue();
	}
	
	public String getPageTitleFromExcel(String sheetname, int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		fis = new FileInputStream("./src/test/resources/testdata/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).getStringCellValue();
	}

}
