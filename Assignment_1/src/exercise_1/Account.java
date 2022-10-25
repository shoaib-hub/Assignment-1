package exercise_1;

public class Account {
	String Id;
	String name;
	int Balance = 0;
	
public Account(String Id, String name){
	this.Id = Id;
	this.name = name;
}
public Account(String Id, String name, int Balance) {
	this.Id = Id;
	this.name = name;
	this.Balance = Balance;
}
String getID() {
	return Id;
}
String getName() {
	return name;
}

int getBalance() {
	return Balance;
}
int credit(int amount) {
	return Balance += amount;
}
int debit(int amount) {
	if(amount<=Balance) {
		Balance -= amount;
	}
	else {
		System.out.println("Amount Exceeded Balance");
	}
	return Balance;
}
int transferTo(Account He, int amount) {
	if(amount<=Balance) {
		He.Balance = amount;
	}
	else {
		System.out.println("Amount Exceeded Balance");
	}
	return He.Balance;
}
public String toString() {
	return "Account[Id="+this.Id+" name = "+this.name+" Balance = "+this.Balance+"]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("aaa", "shoaib",1000);
		Account b = new Account("bbb", "Ameer", 20);
		
//		System.out.println(a.transferTo(b, 100));
//		System.out.println(b.getBalance());
//		System.out.println(a.credit(200));
//		System.out.println(a.getBalance());
//		System.out.println(a.debit(800));
//		
////		System.out.println(a.getBalance());
////		System.out.println(a.getName());
////		System.out.println(a.getID());
////		System.out.println(b.getBalance());
////		System.out.println(b.getName());
////		System.out.println(b.getID());
////		System.out.println(a.transferTo(b,200));
////		System.out.println(a.toString());
////		System.out.println(b.toString());
		System.out.println(a.getBalance());
		//credit 100 to a
		System.out.println(a.credit(100));
		//debit 1000 from a
		System.out.println(a.debit(1000));
		//check b balance
		System.out.println(b.getBalance());
		//transferring 2000 from a to b
		System.out.println(a.transferTo(b,2000));
		//check b balance
		System.out.println(b.getBalance());
		//credit 20 to b
		System.out.println(b.credit(20));
		//debit 500 from b
		System.out.println(b.debit(500));
		//check b balance
		System.out.println(b.getBalance());
		//check exceeded amount condition
		System.out.println(b.transferTo(a,2000));
		

	}

}
