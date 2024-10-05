public class BankEmployee {
    private String employeeId;
    private String name;

    public BankEmployee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void approveLoan(Loan loan) {
        loan.setApproved(true);
        System.out.println("Loan approved.");
    }
}