package ss;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private Endereco  e ;
	private Genitores n;
   
public Pessoa(String nome, int idade, double altura, Endereco endereco, Genitores genitores) {
      	this.nome = nome;
      this.idade = idade;
      this.altura = altura;
      this.e = endereco;
      this.n = genitores;
      
  }
    public void setEndereco (Endereco endereco) {
        this.e = endereco;
    }
    
    public void setGenitores (Genitores genitores) {
    	this.n = genitores;
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
   	public double getAltura() {
      return altura;
     
  }
  	public void setAltura(double altura) {
      this.altura = altura;
     
  }
   	public String tostring() {
      return "Nome: " + nome + "\nIdade: " + idade + " anos\nAltura: " + altura + " m" +"\n Endereço: " + e.toString() + "\n Genitores:  " + n.toString();
  }
}


