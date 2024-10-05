public class Loan {
    private double loanAmount;
    private boolean isApproved;

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
        this.isApproved = false;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }
}