/* Laikin Barnard 6955*/

package FA3_6955;

public class BusinessLoan extends Loan {
    double Newintrest = PrimeintrestRate + 0.2;
    
    public BusinessLoan(int LoanNr,String Name,double Loanrate,double AmountLn, String Term){
        super(LoanNr,Name,Loanrate,AmountLn,Term);
        
    }

}
