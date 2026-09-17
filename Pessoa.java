public class Pessoa{

	private int idade = 0;
	private String cpf = "";
	private String nome = "";
	
	private Endereco ender = new Endereco();
	
	public Endereco getEnder() {
        return ender;
    }
	
	//Getters
	public int getIdade(){
		return idade;		
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String getNome(){
		return nome;
	}
	
	//Setters
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
}