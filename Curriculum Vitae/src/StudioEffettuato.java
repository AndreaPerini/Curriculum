import java.time.LocalDate;
//import java.util.*;

public class StudioEffettuato extends Curriculum {

	private String istituto;
	private int anniStudio;
	private boolean diplomaConseguito;
	
	public StudioEffettuato() {
		super();
	}

	public StudioEffettuato(LocalDate dataInizio, LocalDate dataFine, String descrizione, String istituto,
			int anniStudio, boolean diplomaConseguito) {
		super(dataInizio, dataFine, descrizione);
		this.istituto = istituto;
		this.anniStudio = anniStudio;
		this.diplomaConseguito = diplomaConseguito;
	}

	public String getIstituto() {
		return istituto;
	}

	public void setIstituto(String istituto) {
		this.istituto = istituto;
	}

	public int getAnniStudio() {
		return anniStudio;
	}

	public void setAnniStudio(int anniStudio) {
		this.anniStudio = anniStudio;
	}

	public boolean isDiplomaConseguito() {
		return diplomaConseguito;
	}

	public void setDiplomaConseguito(boolean diplomaConseguito) {
		this.diplomaConseguito = diplomaConseguito;
	}

}
