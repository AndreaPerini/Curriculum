import java.util.*;
import java.time.LocalDate;

public class Avvia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Curriculum.genera();
		boolean flag = false;
		boolean generata = false;
		boolean opzioni = false;
		LocalDate datainizio, datafine;
		int d1, d2, d3, d4, d5, d6, comp, stipendio, anniStudio, durata, voto;
		String descrizione, nomeazienda, tipocorso, istituto, tipo;
		boolean corsoaggiornamento, diplomaConseguito;
		
		
		do {
			System.out.println("Seleziona l'azione da eseguire: ");
			System.out.println("1 = Aggiungi voce");
			System.out.println("2 = Elimina voce");
			System.out.println("3 = Stampa elenco dal più recente");
			System.out.println("Qualsiasi altro numero per uscire dal programma");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				generata = true;
				Curriculum cur = new Curriculum();
				boolean date = false;
				do {
					System.out.println("Inserici una data di inizio");
					System.out.println("Anno: ");
					d1 = sc.nextInt();
					System.out.println("Mese: ");
					d2 = sc.nextInt();
					System.out.println("Giorno: ");
					d3 = sc.nextInt();
					datainizio = LocalDate.of(d1, d2, d3);
					System.out.println("Inserici una data di termine");
					System.out.println("Anno: ");
					d4 = sc.nextInt();
					System.out.println("Mese: ");
					d5 = sc.nextInt();
					System.out.println("Giorno: ");
					d6 = sc.nextInt();
					datafine = LocalDate.of(d4, d5, d6);
					comp = datainizio.compareTo(datafine);
					if (comp > 0) {
						System.out.println("Reinserisci le date");
					} else {
						date = true;
					}
				} while (!date);
				System.out.println("Inserisci una descrizione");
				descrizione = sc.nextLine();
				do {
					System.out.println("Scegli cosa vuoi fare: ");
					System.out.println("1 = Non inserire altro");
					System.out.println("2 = Inserisci Esperienza Lavorativa");
					System.out.println("3 = Inserisci Studio Effettuato");
					int scelta = sc.nextInt();
					switch (scelta) {
					case 1:
						cur.setDataInizio(datainizio);
						cur.setDataFine(datafine);
						cur.setDescrizione(descrizione);
						Curriculum.aggiungiVoce(cur);
						opzioni = true;
						break;
					case 2:
						EsperienzaLavorativa cures = new EsperienzaLavorativa();
						System.out.println("Inserisci il nome dell'azienda");
						nomeazienda = sc.nextLine();
						System.out.println("Inserisci lo stipendio");
						stipendio = sc.nextInt();
						System.out.println("Inserisci corso d'aggiornamento");
						corsoaggiornamento = sc.nextBoolean();
						cures.setDataInizio(datainizio);
						cures.setDataFine(datafine);
						cures.setDescrizione(descrizione);
						cures.setNomeAzienda(nomeazienda);
						cures.setStipendio(stipendio);
						cures.setCorsiAggiornamento(corsoaggiornamento);
						if (corsoaggiornamento == false) {
							Curriculum.aggiungiVoce(cures);
						} else {
							System.out.println("Inserisci il tipo del corso");
							tipocorso = sc.nextLine();
							cures.setTipoCorso(tipocorso);
							Curriculum.aggiungiVoce(cures);
						}
						opzioni = true;
						break;
					case 3:
						StudioEffettuato curst = new StudioEffettuato();
						Diploma curdi = new Diploma();
						System.out.println("Inserisci l'istituto");
						istituto = sc.nextLine();
						System.out.println("Inserisci gli anni di studio");
						anniStudio = sc.nextInt();
						System.out.println("Inserisci se il diploma è stato conseguito");
						diplomaConseguito = sc.nextBoolean();
						if (diplomaConseguito == false) {
							curst.setIstituto(istituto);
							curst.setAnniStudio(anniStudio);
							curst.setDiplomaConseguito(diplomaConseguito);
							Curriculum.aggiungiVoce(curst);
						} else {
							System.out.println("Inserisci tipo del diploma");
							tipo = sc.nextLine();
							System.out.println("Inserisci la durata del diploma");
							durata = sc.nextInt();
							System.out.println("Inserisci il voto");
							voto = sc.nextInt();
							curdi.setIstituto(istituto);
							curdi.setAnniStudio(anniStudio);
							curdi.setDiplomaConseguito(diplomaConseguito);
							curdi.setTipo(tipo);
							curdi.setDurata(durata);
							curdi.setVoto(voto);
							Curriculum.aggiungiVoce(curdi);
						}
						opzioni = true;
						break;
					default:
						System.out.println("Inserimento errato");
					}
				} while (opzioni = false);
				break;
			case 2:
				if (generata == true) {
					System.out.println("Inserisci l'id della voce da eliminare");
					int ind = sc.nextInt();
					Curriculum.rimuoviVoce(ind);
				} else
					System.out.println("Inserisci almeno una voce");
				break;
			case 3:
				Curriculum.stampaCurriculumByDate();
				break;
			default:
				flag = true;
			}
		} while (!flag);
		sc.close();
	}

}