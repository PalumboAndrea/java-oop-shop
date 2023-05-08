package jana60.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		String UserName = sc.nextLine();
		boolean exit = false;
		
		Conto c = new Conto(
				UserName
				);
		
		String userAnswer;
		
		
		while (!exit) {
			
			System.out.println("Vuoi: depositare, prelevare o uscire?");
			userAnswer = sc.nextLine();
			
			
			if (userAnswer.equals("depositare")) {
				System.out.println("Quanto vuoi depositare?");
				float userDeposit = sc.nextInt();
				c.depositMoney(userDeposit);
				System.out.println("Deposito andato a buon fine! Il tuo saldo è: " + c.getSaldo() + " euro");
			
			
			} 
			
			else if (userAnswer.equals("prelevare")) {
				System.out.println("Quanto vuoi prelevare?");
				float userWithdrawal = sc.nextInt();
				
				if (c.getSaldo() < userWithdrawal) {
					System.out.println("Mi dispiace ma il tuo saldo è insufficiente");
				} else {
					c.withdrawalMoney(userWithdrawal);
					System.out.println("Prelievo andato a buon fine! Il tuo saldo è: " + c.getSaldo() + " euro");
				}
			} 
			
			else if (userAnswer.equals("uscire")) {
				exit = true;
			}
			
			
		}
		
		sc.close();
		
		System.out.println(c);
		
	}
}
