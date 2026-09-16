public class Alugar{

	private int inicio= 0;
	private int termino  = 0;
	private String recorrencia = "";
	private String tipo = "";
	
	//Getters
	public int getInicio(){
		return inicio;		
	}
	
	public int getTermino(){
		return termino;
	}
	
	public String getRecorrencia(){
		return recorrencia;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	//Setters
	public void setInicio(int inicio){
		this.inicio = inicio;
	}
	
	public void setTermino(int termino){
		this.termino = termino;
	}
	
	public void setRecorrencia(String recorrencia){
		this.recorrencia = recorrencia;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
}
