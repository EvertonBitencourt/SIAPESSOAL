package br.com.siapessoal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	//private Enum cargo;
	private String usuario;
	private String senha;
	//private boolean estado;
	
	public User() {
	}
	
	public User(Long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		//estado = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/*public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}*/
	
}
