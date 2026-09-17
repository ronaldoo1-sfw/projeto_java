public class Endereco{

	private String rua = "";
	private int numero = 0;
	
	private Local loc = new Local();
	
	public Local getLoc() {
        return loc;
    }
	
	//Getters
	public String getRua(){
		return rua;		
	}
	
	public int getNumero(){
		return numero;
	}
	
	//Setters
	public void setRua(String rua){
		this.rua = rua;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
}