/* Laikin Barnard 6955*/

package FA3_6955;

public class PersonalLoan extends Loan {
    double Newintrest = PrimeintrestRate +(PrimeintrestRate * 0.2) + (PrimeintrestRate * 0.7) ; 
    
    public PersonalLoan(int LoanNr,String Name,double Loanrate,double AmountLn, String Term){
        super(LoanNr,Name,Loanrate,AmountLn,Term); }
}    
