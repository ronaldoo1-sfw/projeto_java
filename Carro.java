public class Carro{//Tipo abstrato de dados

	private int ano = 0;
	private String modelo = "";
	private String placa = "";
	
	//Getters
	public int getAno(){
		return ano;		
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public String getPlaca(){
		return placa;
	}
	
	//Setters
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}
}