import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.*;

public class Diploma extends StudioEffettuato {

	private String tipo;
	private int durata;
	private int voto;

	public Diploma() {
		super();
	}

	public Diploma(LocalDate dataInizio, LocalDate dataFine, String descrizione, String istituto, int anniStudio,
			boolean diplomaConseguito, String tipo, int durata, int voto) {
		super(dataInizio, dataFine, descrizione, istituto, anniStudio, diplomaConseguito);
		this.tipo = tipo;
		this.durata = durata;
		this.voto = voto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

}
