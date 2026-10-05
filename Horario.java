public class Horario{

	private String inicio;
	private String termino;
	
	//Construor
	public Horario(){
		inicio = "";
		termino = "";
	}
	
	//Getters
	public String getInicio(){
		return inicio;		
	}
	
	public String getTermino(){
		return termino;
	}
	
	//Setters
	public void setInicio(String inicio){
		this.inicio = inicio;
	}
	
	public void setTermino(String termino){
		this.termino = termino;
	}
}