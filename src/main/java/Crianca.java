public class Crianca {
	
	private String nome = "";
	private int idade;
	private int count = 0;
	
    public Crianca(String name, int idade){
    	this.nome=name;
    	this.idade=idade;
    }

    public void setCount() {
    	count++;
    }
    
    public int getCount() {
    	return count;
    }
    
    public String getName() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
