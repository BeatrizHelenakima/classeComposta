package ss;

public class Conta {
		private int numeroConta;
		private double saldo;
		private Titular t;
		
			
		public Conta(int novoNumeroConta,double novoSaldo, Titular titular) {
			    this.numeroConta = novoNumeroConta;
			    this.saldo = novoSaldo;
			    this.t = titular;
			       
		}
		
		public void setTitular(Titular titular) {
			  this.t = titular;
		}  
		
			public int getNumeroConta() {
				return numeroConta;
			}
				
		
			public double getSaldo() {
				return saldo;
			}
			
		  public void setSaldo(double novoSaldo) {
			  this.saldo = novoSaldo;
			  
		  }
		  
		  public void sacar(double valor) {
			  this.saldo= saldo - valor;
		  }
		  public void depositar(double valor) {
			  this.saldo= saldo + valor;
		  }
		  public String toString () {
			  return "Número da conta:" + this.numeroConta + "\n saldo: R$ " + this.saldo + " \n O titular da conta é:" + t.toString(); 
		  }
	}

