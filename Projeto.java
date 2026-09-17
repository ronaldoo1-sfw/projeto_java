public class Projeto{

	public static void main(String arg[]){
		
		Carro c1 = new Carro();
		Pessoa p1 = new Pessoa();
		Alugar a1 = new Alugar();
		Leitura ler = new Leitura();
		
		p1.getEnder().setNumero(115); //Reflections
		p1.getEnder().setRua("das Pedras");//Reflections
		p1.getEnder().getLoc().setCidade("Coroados"); //Reflections
		p1.getEnder().getLoc().setCep("275831758");//Reflections
		p1.getEnder().getLoc().setCodCidade(128429); //Reflections
		
		//Carro
		c1.setAno(Integer.parseInt(ler.entDados("\nANO...: ")));
		c1.setModelo(ler.entDados("\nMODELO..: "));
		c1.setPlaca(ler.entDados("\nPLACA..: "));
		
		//Pessoa
		p1.setIdade(Integer.parseInt(ler.entDados("\nIDADE...: ")));
		p1.setCpf(ler.entDados("\nCPF..: "));
		p1.setNome(ler.entDados("\nNOME..: "));
		
		//Alugar
		a1.setInicio(Integer.parseInt(ler.entDados("\nINICIO...: ")));
		a1.setTermino(Integer.parseInt(ler.entDados("\nTERMINO...: ")));
		a1.setRecorrencia(ler.entDados("\nRECORRÊNCIA..: "));
		a1.setTipo(ler.entDados("\nTIPO..: "));
		
		System.out.println("\nANO...: "+c1.getAno());
		System.out.println("MODELO..: "+c1.getModelo());
		System.out.println("PLACA...: "+c1.getPlaca());
		
		System.out.println("\nIDADE...: "+p1.getIdade());
		System.out.println("CPF..: "+p1.getCpf());
		System.out.println("NOME...: "+p1.getNome());
		System.out.println("\nRUA...: "+p1.getEnder().getRua()); //Reflections		
		System.out.println("\nNUMERO...: "+p1.getEnder().getNumero());//Reflections
		System.out.println("\nCIDADE...: "+p1.getEnder().getLoc().getCidade()); //Reflections		
		System.out.println("\nCEP...: "+p1.getEnder().getLoc().getCep());//Reflections
		System.out.println("\nCODIGO DA CIDADE...: "+p1.getEnder().getLoc().getCodCidade()); //Reflections
		
		System.out.println("\nINICIO...: "+a1.getInicio());
		System.out.println("TERMINO..: "+a1.getTermino());
		System.out.println("RECORRENCIA...: "+a1.getRecorrencia());
		System.out.println("TIPO...: "+a1.getTipo());
	}
}
