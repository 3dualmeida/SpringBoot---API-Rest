package br.com.alura.forum.controller.dto;

public class TokenTDO {

	private String token;
	private String string;

	public TokenTDO(String token, String string) {
		this.token = token;
		this.string = string;
	}

	public String getToken() {
		return token;
	}

	public String getString() {
		return string;
	}

}
