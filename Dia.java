public class Dia{

	private int dia;
	private int mes;
	private int ano;
	private Horario hor;
	
	//Construor
	public Dia(){
		dia = 0;
		mes = 0;
		ano = 0;
		hor = new Horario();
	}
	
	public Horario getHor(){
		return hor;
	}
	
	//Getters
	public int getDia(){
		return dia;		
	}
	
	public int getMes(){
		return mes;
	}

	public int getAno(){
		return ano;
	}
	//Setters
	public void setDia(int dia){
		this.dia = dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
}
