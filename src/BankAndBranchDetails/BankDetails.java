package BankAndBranchDetails;

import java.util.List;

public class BankDetails {
		private int bankID;
		private String bankName;
		private List<BranchDetails> branches;
		
		public BankDetails(int bankID,String bankName) {
			this.bankID=bankID;
			this.bankName=bankName;
			
			}

		public int getBankID() {
			return bankID;
		}

		public void setBankID(int bankID) {
			this.bankID = bankID;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public List<BranchDetails> getBranches() {
			return branches;
		}

		public void setBranches(List<BranchDetails> branches) {
			this.branches = branches;
		}


	
		
}
