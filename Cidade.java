package modificadores;

public class Cidade {
	private String nome;
	private Estado estado;

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

protected String getNome() {
	return nome;
}

protected void setNome(String nome) {
	this.nome = nome;
}
}