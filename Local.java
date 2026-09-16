public class Local{

	private String cidade = "";
	private String cep = "";
	private int codCidade = 0;
	
	//Getters
	public String getCidade(){
		return cidade;		
	}
	
	public String getCep(){
		return cep;
	}
	
	public int getCodCidade(){
		return codCidade;
	}
	
	//Setters
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	
	public void setCep(String cep){
		this.cep = cep;
	}
	
	public void setCodCidade(int codCidade){
		this.codCidade = codCidade;
	}
}