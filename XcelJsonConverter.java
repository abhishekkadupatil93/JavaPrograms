import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelJsonConverter {
   
			
			public static void main(String[] args) {
				

				getcityandstate();		
				
			}  
			
		
		public static void getcityandstate() {
			  try { 
			  
			String BaseString ="{dealercode :";
			  FileInputStream file =new FileInputStream(new File("D:\\Office Files\\EMI_Insta_card_PMG\\10JUNE2022\\QR.xlsx"));   
			  
			  XSSFWorkbook workbook = new XSSFWorkbook(file);                      
			            
			                        
			                                 
			  XSSFSheet sheet =workbook.getSheetAt(0);
			   
			  Cell cell = null;   
			  for (int rowIndex =1; rowIndex <= sheet.getLastRowNum(); rowIndex++)
			   { 
			   Row row = sheet.getRow(rowIndex);
			  String newString = BaseString; 
			    
			  cell = row.getCell(0); 
			  newString = newString+'"'+cell+'"'+",";   
			  cell =row.getCell(1);
			  newString = newString+"groupcode" + ""+" :"+'"'+cell+'"'+",";         
			  cell =row.getCell(2);
			  newString = newString+"market" + ""+" :"+'"'+cell+'"'+","; 
			  cell =row.getCell(3);
			  newString = newString+"Flag" +" :"+'"'+cell+'"'+",";     
			  cell =row.getCell(4);
			  newString = newString+"OfferStartDate" +" :"+'"'+cell+'"'+","; 
			  cell =row.getCell(5);
			  newString = newString+"OfferEndDate" +" :"+'"'+cell+'"'+","; 
			  cell =row.getCell(6);
			  newString = newString+"sms_text" +" :"+'"'+cell+'"'+"},";
			     
			        
			    
			  System.out.println(newString);       
			  } 
			  file.close();    
			  }    
			  catch (Exception e)
			  {
			  e.printStackTrace();
			  }
		}
	  
		
}   
