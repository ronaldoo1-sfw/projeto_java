public class Funcionario extends Pessoa{

	private String cargo;
	private float salario;
	
	//Construor
	public Funcionario(){
		cargo = "";
		salario = 0;
	}
	
	//Getters
	public String getCargo(){
		return cargo;		
	}
	
	public float getSalario(){
		return salario;
	}
	
	//Setters
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
}
