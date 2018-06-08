public class Cliente{
	//atributos
	private int clienteId;
	private String cpf;
	private Endereco endereco;

	//metodos
	public Cliente(){
	}

	public Cliente(int clienteId, String cpf, Endereco endereco){
		this.clienteId = clienteId;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}


	public int getClienteId() {
		return clienteId;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public String getCpf() {
		return cpf;
	}

	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Endereco getEndereco() {
		return endereco;
	}

	

} 