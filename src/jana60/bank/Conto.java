package jana60.bank;

import java.util.Random;

public class Conto {
	
	private int numeroDiConto;
	public String nomeInt;
	private float saldo;
	
	Random rnd = new Random();
	
	public Conto(String nomeInt) {
		setNumeroDiConto();
		setNomeInt(nomeInt);
		setSaldo(0);
	}
	
	private void setNumeroDiConto() {
		this.numeroDiConto = rnd.nextInt(1000);
	}
	
	public int getNumeroDiConto() {
		return this.numeroDiConto;
	}
	
	public void setNomeInt(String nomeInt) {
		this.nomeInt = nomeInt;
	}
	
	private void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public String getNomeInt() {
		return this.nomeInt;
	}
	
	public void depositMoney(float cash) {
		saldo += cash;
	}
	
	public void withdrawalMoney(float cash) {
		if (saldo - cash > 0) {
			saldo -= cash;
		}
	}
	
	public String toString() {
		
		return "Numero di conto: " + getNumeroDiConto() + ", saldo: " 
				+ getSaldo() + "euro, utente: " 
				+ getNomeInt();
	}
	
	
	
	
	
	





}
