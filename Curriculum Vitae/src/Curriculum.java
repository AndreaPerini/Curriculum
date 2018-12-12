import java.time.LocalDate;
//import java.util.*;
//import java.util.ArrayList;

public class Curriculum {

	private int id;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private String descrizione;
	private static int index = 0;
	private static int a;
	private static Curriculum b;
	// ArrayList<Curriculum> elenco = new ArrayList<Curriculum>();
	static Curriculum[] elenco = new Curriculum[100];

	public Curriculum(LocalDate dataInizio, LocalDate dataFine, String descrizione) {
		this.id = index++;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.descrizione = descrizione;
	}
	
	public Curriculum() {
	}

	public int getId() {
		return id;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public static void genera() {
		for (int i = 0; i < elenco.length; i++) {
			elenco[i] = null;
		}
	}

	public static void aggiungiVoce(Curriculum voce) {
		elenco[index] = voce;
		index++;
	}

	public static void rimuoviVoce(int indice) {
		elenco[indice] = null;
		for (int i = indice; i < elenco.length - 1; i++) {
			elenco[i] = elenco[i++];
			elenco[i].id--;
			index--;
		}
	}

	public static void stampaCurriculumByDate() {
		for (int i = 0; i < index; i++) {
			boolean flag = false;
			for (int j = 0; j < index - 1; j++) {
				a = elenco[j].dataFine.compareTo(elenco[j + 1].dataFine);
				if (a > 0) {
					b = elenco[j];
					elenco[j] = elenco[j + 1];
					elenco[j + 1] = b;
					flag = true;
				}
			}
			if (!flag)
				break;
		}
		for (int i = 0; i < elenco.length; i++) {
			System.out.print(elenco[i]);
		}
	}

}
