package BankAndBranchDetails;

public class BranchDetails {
	
	private int branchid;
	private String branchName;
	private int accountCount;
	private int bankID;
	private String IFSCE;
	public BranchDetails(int branchid,String branchName,int accountCount,int bankID,String IFSCE) {
		this.branchid=branchid;
		this.branchName=branchName;
		this.accountCount=accountCount;
		this.bankID=bankID;
		this.IFSCE=IFSCE;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getAccountCount() {
		return accountCount;
	}
	public void setAccountCount(int accountCount) {
		this.accountCount = accountCount;
	}
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public String getIFSCE() {
		return IFSCE;
	}
	public void setIFSCE(String iFSCE) {
		IFSCE = iFSCE;
	}
	
}
