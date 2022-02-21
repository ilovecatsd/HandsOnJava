public class Main {

public static void main(String[] args) {

BankA bankA = new BankA();

BankB bankB = new BankB();

BankC bankC = new BankC();

bankA.deposit(100);

bankB.deposit(150);

bankC.deposit(200);

System.out.println("Balance of Bank A = $"+bankA.getBalance());

System.out.println("Balance of Bank B = $"+bankB.getBalance());

System.out.println("Balance of Bank C = $"+bankC.getBalance());

}

}