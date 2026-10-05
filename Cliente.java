public class Cliente extends Pessoa{

	private String email;
	private String telefone;
	
	//Construor
	public Cliente(){
		email = "";
		telefone = "";
	}
	
	//Getters
	public String getEmail(){
		return email;		
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	//Setters
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
}
