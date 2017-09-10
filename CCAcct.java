/**
 * Created by jackbrashier on 9/9/17.
 */
public class CCAcct {
    /** variables that make up a CCAcct */
    private String acctName;
    private int ssn;
    private double debt;

    /** default constructor */
    public CCAcct() {
        this.acctName = "John Doe";
        this.ssn = 123456789;
        this.debt = 0.00;
    }

    /** custom constructor */
    public CCAcct(String name, int ssn, double debt) {
        this.acctName = name;
        this.ssn = ssn;
        this.debt = debt;
    }
    /** returns the name & social security number of the account holder and the accrued debt */
    public String getAcct() {
        return (this.acctName + " (" + this.ssn + ") $" + debt);
    }
    /** adds to the debt - used when a purchase is made */
    public void authCharge(double amount) {
        this.debt += amount;
    }
    /** subtracts from the debt - used when a payment is made */
    public void payment(double amount) {
        this.debt -= amount;
    }
    /** multiplies the debt by a 2% monthly interest rate - used when a payment isn't made on time */
    public void lateFee(int months) {
        this.debt *= (Math.pow(1.02, months));
    }
}
