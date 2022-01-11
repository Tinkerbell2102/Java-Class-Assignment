/* Laikin Barnard 6955*/

package FA3_6955;

public class Loan implements LoanConstants {
    
    int LoanNumber;
    String CustomerName;
    double AmountLoan;
    double PrimeintrestRate = 0.7;
    String term;

    public Loan(int LoanNr,String Name,double Loanrate,double AmountLn, String Term){
        this.LoanNumber = LoanNr;
       this.CustomerName= Name; 
        this.AmountLoan= AmountLn;
        this.PrimeintrestRate= Loanrate;
         this.term= Term;     
   
    }
    public String toString(){
     return "Dear "+this.CustomerName +" Your loan nr is :" + this.LoanNumber + "Your loan amount is :" 
             +this.AmountLoan  + " Your interest rate is: "
             +this.PrimeintrestRate+ " And you have selected a " +this.term+ " which is so many years";   
    }
}
