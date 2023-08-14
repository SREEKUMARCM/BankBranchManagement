package BankAndBranchDetails;

import java.util.List;
import java.util.Scanner;
public class BankMain {
	public static void selection() {
		System.out.println("1.Bankdetails");
		System.out.println("2.Branchdetails");
		System.out.println("Please select your choice");
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		selection();
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("*********Bankdetails********");
			Bankdata();
			
		}else if(choice==2){
			System.out.println("*********Branchdetails********");
			Branchdata();
		}
		}while(choice<2);{
			sc.close();
		}
	}
	public static void Bankdata() {
		int choiceBank=0;
		Scanner scBank=new Scanner(System.in);
		do {
		System.out.println("1.  Add Bank");
		System.out.println("2.  View Bank list");
		System.out.println("3.  Serach Bank");
		System.out.println("4.  Delete Bank");
		System.out.println("5.  Update Bank");
		System.out.println("6.  calculate Total account and branch count");
		System.out.println("7.  Exit");
		System.out.println("Please select your choice");
		
		choiceBank=scBank.nextInt();
		if(choiceBank==1) {
			BankBranchController addObj=new BankBranchController();
			addObj.AddBank();
		}else if(choiceBank==2){
			BankBranchController viewObj=new BankBranchController();
			viewObj.ViewBank();
		}else if(choiceBank==3){
			BankBranchController searchObj=new BankBranchController();
			searchObj. SearchBank();
			
		}
		else if(choiceBank==4){
			BankBranchController deleteObj=new BankBranchController();
			deleteObj.DeleteBank();
			
		}
		else if(choiceBank==5){
			BankBranchController updateObj=new BankBranchController();
			updateObj.UpdateBank();
			
		}
		else if(choiceBank==6) {
			BankBranchController accountCountObj=new BankBranchController();
			accountCountObj.NoAccout();
			BankBranchController branchCountObj=new BankBranchController();
			branchCountObj.NoBranch();
			
		}else if(choiceBank==7){
			main(null);
		}
		}while(choiceBank<7);{
			scBank.close();
		}
	}
	public static void Branchdata() {
		int choiceBranch=0;
		Scanner scBank=new Scanner(System.in);
		do {
		System.out.println("1.  Add Branch");
		System.out.println("2.  View Branch list");
		System.out.println("3.  Serach Branch");
		System.out.println("4.  Delete Branch");
		System.out.println("5.  Update Branch");
		System.out.println("6.  Exit");
	
		System.out.println("Please select your choice");
		
		choiceBranch=scBank.nextInt();
		if(choiceBranch==1) {
			BankBranchController addObj=new BankBranchController();
			addObj.AddBranch();
			
		}else if(choiceBranch==2) {
			BankBranchController viewObj=new BankBranchController();
			viewObj.ViewBranch();
		}else if(choiceBranch==3) {
			BankBranchController SearchObj=new BankBranchController();
			SearchObj.SearchBranch();
		}else if(choiceBranch==4) {
		
				BankBranchController deleteObj=new BankBranchController();
				deleteObj.DeleteBranch();
			
		}else if(choiceBranch==5) {
			BankBranchController updateObj=new BankBranchController();
			updateObj.UpdateBranch();
			
		}
		
		else if(choiceBranch==6) {
			main(null);
		}
		}while(choiceBranch<6);{
			scBank.close();
		}
		
	}
	
	
	
	 
}


