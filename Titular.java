package ss;

public class Titular {
	private String nome;
	private int idade;
	private String dataN;
	private String cpf;
	private String tele;
	
	public Titular (String nome, int idade, String dataN , String cpf, String tele) {
      	this.nome = nome;
      this.idade = idade;
      this.dataN = dataN;
      this.cpf = cpf; 
      this.tele = tele;
	}
   
	    
	  	public String getNome() {
	      return nome;
	     
	  }
	  	public void setNome(String nome) {
	      this.nome = nome;
	     
	  }
	   	public int getIdade() {
	      return idade;
	     
	  }
	  	public void setIdade(int idade) {
	      this.idade = idade;
	     
	  }
	   	public String getDataN() {
	      return dataN;
	     
	  }
		public void setDataN(String dataN) {
			this.dataN = dataN;
		  }
	  	public void setCpf (String cpf) {
	      this.cpf = cpf;
	  	}
	      
	      public String getCpf () {
		     return cpf;
	      }
	      
	      public void setTele (String tele) {
		      this.tele = tele;
		  	}
		      
		      public String getTele () {
			     return tele;
		      }

		      public String tostring() {
			        return  "Titular da conta é" + this.nome + "tem"+ this.idade + "idade,"+ "nascido em" + this.dataN+ "."+ "\n dados pessoais: \n"+ this.cpf+ this.tele;
			    }	
	     
}
