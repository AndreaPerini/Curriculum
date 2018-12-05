import java.time.LocalDate;
//import java.util.*;

public class EsperienzaLavorativa extends Curriculum {

	private String nomeAzienda;
	private int stipendio;
	private boolean corsiAggiornamento;
	private String tipoCorso;

	
	public EsperienzaLavorativa() {
		super();
	}

	public EsperienzaLavorativa(LocalDate dataInizio, LocalDate dataFine, String descrizione, String nomeAzienda,
			int stipendio, boolean corsiAggiornamento, String tipoCorso) {
		super(dataInizio, dataFine, descrizione);
		this.nomeAzienda = nomeAzienda;
		this.stipendio = stipendio;
		this.corsiAggiornamento = corsiAggiornamento;
		this.tipoCorso = tipoCorso;
	}

	public EsperienzaLavorativa(LocalDate dataInizio, LocalDate dataFine, String descrizione, String nomeAzienda,
			int stipendio, boolean corsiAggiornamento) {
		super(dataInizio, dataFine, descrizione);
		this.nomeAzienda = nomeAzienda;
		this.stipendio = stipendio;
		this.corsiAggiornamento = corsiAggiornamento;
		this.tipoCorso = null;
	}

	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public boolean isCorsiAggiornamento() {
		return corsiAggiornamento;
	}

	public void setCorsiAggiornamento(boolean corsiAggiornamento) {
		this.corsiAggiornamento = corsiAggiornamento;
	}

	public String getTipoCorso() {
		return tipoCorso;
	}

	public void setTipoCorso(String tipoCorso) {
		this.tipoCorso = tipoCorso;
	}

}
