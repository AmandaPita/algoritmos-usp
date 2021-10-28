public class Cliente {
	private String nome;
	private float valorConta;
	/**
	* Construtor padr�o. Garante que todos os clientes saibam que mais uma
	* pessoa chegou na mesa.
	*/
	public Cliente() {
		valorConta = 0;
	}
	/**
	* M�todo que atualiza o nome do cliente.
	*/
	public void setNome(String nome){
		this.nome = nome;
	}
	/**
	* M�todo que retorna o nome do cliente.
	*/
	public String getNome(){
		return nome;
	}
	/**
	* M�todo que notifica ao cliente que a mesa pediu um novo prato ou bebida
	* de um dado valor. O cliente deve calcular a parte que lhe cabe em rela��o �
	* quantidade de pessoas na mesa e atualizar-se de acordo.
	*/
	public void novaDespesa(float valor){
		valorConta = valorConta + valor;
	}
	/**
	* M�todo que retorna o valor atual de sua conta.
	* O m�todo deve incluir neste c�lculo os 10% do gar�om.
	*/
	public float getConta(){
		return(valorConta);
	}
	/**
	* M�todo para fechar a conta de um cliente. Deve garantir que todos os
	* outros clientes saibam que a partir de agora h� uma pessoa menos na mesa.
	* O cliente que chama este m�todo n�o deve mais fazer parte do aplicativo.
	* Este m�todo deve ser usado quando o cliente sai da mesa.
	*/
	public float pagarConta(){
		float out = (float)(getConta() + getConta()*.1);
		return(out);
	}
}