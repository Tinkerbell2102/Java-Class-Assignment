/* Laikin Barnard 6955*/

package FA3_6955;
import java.util.ArrayList;
import javax.swing.*; 

public class Question2 {

    public static void main(String[] args) {
    ArrayList<String> LoansinArray = new ArrayList<String>();    
 
    JFrame f = new JFrame(); 
    double CurrentRate =Double.parseDouble(JOptionPane.showInputDialog(f,"What is the current prime interest rate: ")); // Current interest rate
       
        /*int LoanNr,String Name,double AmountLn, String Term) */
    for (int i=0 ; i < 4; i++){
 
    String CusName = JOptionPane.showInputDialog(f,"Please enter your Surname : ");
    double AmountLn =Double.parseDouble(JOptionPane.showInputDialog(f,"Amount you want to loan : "));  
    String TermDur = JOptionPane.showInputDialog(f,"Loan Term? (Choose between Short, Medium and Long): ");   // Short, Long Medium
  
       if (AmountLn >= 100000){
           System.out.println("LoanAmount too big");
           } else {
           if (TermDur != "Long" || TermDur != "Medium"){
            Loan obj = new Loan(2,CusName,CurrentRate,AmountLn,"Short");
            obj.PrimeintrestRate = CurrentRate;
           LoansinArray.add(obj.toString());
           }else{
            Loan obj = new Loan(2,CusName,CurrentRate,AmountLn,TermDur);
            LoansinArray.add(obj.toString());
            obj.PrimeintrestRate = CurrentRate;
           }                     
        }
    }
  System.out.println(LoansinArray);
       
        
    }
    
}
