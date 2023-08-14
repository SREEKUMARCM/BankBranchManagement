package BankAndBranchDetails;

import java.util.List;
import java.util.Scanner;

public class BankBranchController {
	public  void AddBranch() {
		System.out.println("Please enter the Branch ID :");
		Scanner scBranchId=new Scanner(System.in);
		BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
		int branchID=scBranchId.nextInt();
		newBranch.setBranchid(branchID);
		System.out.println("Please enter the Branch name :");
		Scanner sc=new Scanner(System.in);
		//BankDetails newBank = new BankDetails(0, null, 0, 0);
		String branchName=sc.next();
		newBranch.setBranchName(branchName);
		System.out.println("Please enter the Number of Active Accounts :");
		Scanner scCountAccount=new Scanner(System.in);
		BankDetails newBank = new BankDetails(0, null);
		int countAccount=scCountAccount.nextInt();
		newBranch.setAccountCount(countAccount);
		System.out.println("Please enter the Bank ID :");
		Scanner scBankId=new Scanner(System.in);
		int bankID=scBankId.nextInt();
		newBranch.setBankID(bankID);
		System.out.println("Please enter the IFSCE :");
		Scanner scIFSCE=new Scanner(System.in);
		//BankDetails newBank = new BankDetails(0, null, 0, 0);
		String IFSCE=sc.next();
		newBranch.setIFSCE(IFSCE);
		
		
		Connection_Bank AddBankobj=new Connection_Bank();
		AddBankobj.AddBranch(branchID,branchName,countAccount,bankID,IFSCE);
	}
	 public void ViewBranch(){ 
		  
		  System.out.println(" The available list of all Branch is  :");
		  List<BranchDetails> branchList=new Connection_Bank().ViewBranchdb()	; 
			  for(BranchDetails Branch:branchList) 
			  {  System.out.println("BranchID : " + Branch.getBranchid());
		        System.out.println("BranchName: " + Branch.getBranchName());
		        System.out.println("Number of Account: " + Branch.getAccountCount());
		        System.out.println("BankID: " + Branch.getBankID());
		        System.out.println("IFSCE CODE: " + Branch.getIFSCE() );
		        System.out.println("---------------------");
				  
			  }
		  
		}
	 public  String SearchBranch(){  
			BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
			System.out.println("Please enter the Branch name :");
			Scanner sc=new Scanner(System.in);
			//BankDetails newBank = new BankDetails(0, null, 0, 0);
			String branchName=sc.next();
			newBranch.setBranchName(branchName);
			  Connection_Bank Branchlist=new Connection_Bank(); 
			  String bName1 =Branchlist.SearchBranch(branchName);
			  System.out.println(" -----------"+bName1); 
			  System.out.println(" ***********"+branchName);  
			  String Avalilability=null;
			  if (bName1.equals(branchName)) {
				  Avalilability="yes";
				  System.out.println(" the branch is avaiilable :");
				  
			  }else {
				  Avalilability="no";
				  System.out.println(" the  is not available :");
			  }
			 
			  return Avalilability ;
			}
	 public  void DeleteBranch() {
		 BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
		  System.out.println(" enter the name to be delected :");
		  Scanner sc=new Scanner(System.in);
		  String branchName=sc.next();
		  newBranch.setBranchName(branchName);
		  Connection_Bank branchList=new Connection_Bank(); 
		  branchList. DeleteBranchname(branchName);
	 }
	 public  void UpdateBranch() {
		 BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
		  System.out.println(" enter the name to be Updated :");
		  Scanner sc1=new Scanner(System.in);
		  String branchName1=sc1.next();
		  
		  System.out.println(" enter the new name :");
		  Scanner sc=new Scanner(System.in);
		  String branchName=sc.next();
		  newBranch.setBranchName(branchName);
		  Connection_Bank Branchlist=new Connection_Bank(); 
		  Branchlist.UpdateBranchname(branchName1,branchName);
	 }
	 public void AddBank() {
			System.out.println("Please enter the Bank ID :");
			Scanner scBankId=new Scanner(System.in);
			BankDetails newBank = new BankDetails(0, null);
			int bankID=scBankId.nextInt();
			newBank.setBankID(bankID);
			System.out.println("Please enter the Bank name :");
			Scanner sc=new Scanner(System.in);
			//BankDetails newBank = new BankDetails(0, null, 0, 0);
			String bankName=sc.next();
			newBank.setBankName(bankName);
			Connection_Bank AddBankobj=new Connection_Bank();
			AddBankobj.AddBank(bankID,bankName);
		}
	 public  void ViewBank(){ 
		  
		  System.out.println(" The available list of all Bank is  :");
		  List<BankDetails> bankList=new Connection_Bank().ViewBankdb()	; 
		  int bankID=0;
		
			  for(BankDetails Bank:bankList) 
			  {  System.out.println("BankID: " + Bank.getBankID());
			  bankID=Bank.getBankID();
			  List<BranchDetails>branchLlist=new Connection_Bank().ViewBranchinsidebankdb(bankID)	; 	
		        System.out.println("BankName: " + Bank.getBankName() );
		        System.out.println("------BranchDetails-------");
		        for(BranchDetails branch:branchLlist) {
		        	System.out.println("Branchid : " + branch.getBranchid());
		        	System.out.println("Branchname : " + branch.getBranchName());
		        	System.out.println("ifsc code : " + branch.getIFSCE());
		        }
		      
		        System.out.println("---------------------");
				  
			  }
		  
		}
	 public  String SearchBank(){  
		 BankDetails newBank = new BankDetails(0, null);
			System.out.println("Please enter the Bank name :");
			Scanner sc=new Scanner(System.in);
			//BankDetails newBank = new BankDetails(0, null, 0, 0);
			String bankName=sc.next();
			newBank.setBankName(bankName);
			  Connection_Bank Banklist=new Connection_Bank(); 
			  String bName1 =Banklist.SearchBank(bankName);
			  String Avalilability=null;
			  try {
			  if (bName1.equals(bankName)) {
				  Avalilability="yes";
				  System.out.println(" the bank is avaiilable :");
				  
			  }else {
				  Avalilability="no";
				  System.out.println(" the  is not available :");
			  }
			  }catch(Exception e) {
				  System.out.println(" the  is not available :");
				 // e.printStackTrace();
			  
			  }
			 
			  return Avalilability ;
			}

	 public  void DeleteBank() {
		 BankDetails newBank = new BankDetails(0, null);
		  System.out.println(" enter the name to be delected :");
		  Scanner sc=new Scanner(System.in);
		  String bankName=sc.next();
		  newBank.setBankName(bankName);
		  Connection_Bank bankList=new Connection_Bank(); 
		  bankList. DeleteBankname(bankName);
	 }
	
	 public  void UpdateBank() {
		 BankDetails newBank = new BankDetails(0, null);
		  System.out.println(" enter the name to be Updated :");
		  Scanner sc1=new Scanner(System.in);
		  String bankName1=sc1.next();
		  
		  System.out.println(" enter the new name :");
		  Scanner sc=new Scanner(System.in);
		  String bankName=sc.next();
		  newBank.setBankName(bankName);
		  Connection_Bank Banklist=new Connection_Bank(); 
		  Banklist.UpdateBankname(bankName1,bankName);
	 }
	 public  void Addcount(int bankID,int count) {
		 int bankid=bankID;
		 int count1=count;
		 Connection_Bank Banklist=new Connection_Bank(); 
		  Banklist.AddBranchCount(bankid,count1);
	 }
	 public  void AddcountAccount(int bankID) {
		 int bankid=bankID;
		
		 Connection_Bank Banklist=new Connection_Bank(); 
		  Banklist.AddAccountCountdb(bankid);
	 }
	 public  void NoAccout() {
			BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
			System.out.println("Please enter the Bank ID :");
			Scanner scBankId=new Scanner(System.in);
			int bankID=scBankId.nextInt();
			newBranch.setBankID(bankID);
			Connection_Bank AddBranchCountobj=new Connection_Bank();
			int count=AddBranchCountobj.CountBranch(bankID);
			System.out.println("No of Account is "+count);
			AddcountAccount(bankID);
			
		}
		public  void NoBranch() {
			BranchDetails newBranch = new BranchDetails(0, null, 0, 0, null);
			System.out.println("Please enter the Bank ID :");
			Scanner scBankId=new Scanner(System.in);
			int bankID=scBankId.nextInt();
			newBranch.setBankID(bankID);
			Connection_Bank AddBranchCountobj=new Connection_Bank();
			int count=AddBranchCountobj.CountBranch(bankID);
			System.out.println("No of bank is "+count);
			Addcount(bankID,count);
			
			
		}

}
