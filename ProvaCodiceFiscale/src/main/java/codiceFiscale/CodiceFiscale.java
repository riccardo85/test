package codiceFiscale;

import java.util.Scanner;

public class CodiceFiscale {
	private String cognome;
	private String nome;
	private int anno;
	private String mese;
	private int giorno;
	private String sesso;
	private String comune;

	public CodiceFiscale(String cognome, String nome, int anno, String mese, int giorno, String sesso, String comune) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.anno = anno;
		this.mese = mese;
		this.giorno = giorno;
		this.sesso = sesso;
		this.comune = comune;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	@Override
	public String toString() {
		return "CodiceFiscale [cognome=" + cognome + ", nome=" + nome + ", anno=" + anno + ", mese=" + mese
				+ ", giorno=" + giorno + ", sesso=" + sesso + ", comune=" + comune + "]";
	}

}