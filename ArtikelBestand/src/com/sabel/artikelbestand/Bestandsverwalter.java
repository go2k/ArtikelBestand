package com.sabel.artikelbestand;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Verwalte den Bestand eines Unternehmens. Der Bestand ist beschrieben durch
 * einen oder mehrere Artikel.
 * 
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestandsverwalter {
	// Das Lager mit den Artikeln
	private ArrayList<Artikel> lager;

	/**
	 * Initialisiere den Bestandsverwalter.
	 */
	public Bestandsverwalter() {
		lager = new ArrayList<Artikel>();
	}

	/**
	 * Führe einen neuen Artikel im Lager ein.
	 * 
	 * @param artikel
	 *            Der Artikel, der neue eingeführt werden soll.
	 */
	public void neuerArtikel2(Artikel artikel) {
		lager.add(artikel);
	}

	public void neuerArtikel(Artikel artikel) {
		if (!lager.contains(artikel) && artikel != null) {
			lager.add(artikel);
		}
	}

	public void neuerArtikel3(Artikel artikel) {
		Artikel gefartikel = findeArtikel(artikel.gibNummer());
		if (gefartikel == null && artikel != null) {
			lager.add(gefartikel);
		}
	}

	/**
	 * Nimm eine Lieferung eines Artikels in das Lager auf. Erhöhe den
	 * Lagerbestand um die angegebene Menge.
	 * 
	 * @param nummer
	 *            Die Artikelnummer des Artikels.
	 * @param menge
	 *            Die angelieferte Menge.
	 */
	public void aufnehmen(int nummer, int menge) {

		Artikel artikel = findeArtikel(nummer);
		if (artikel != null) {
			artikel.erhoeheBestand(menge);
		} else {
			System.out.println("Kein Artikel mit der Nummer: " + nummer + " vorhanden!");
		}
	}

	/**
	 * Versuche einen Artikel mit der angegebenen Nummer im Bestand zu finden.
	 * 
	 * @param nummer
	 *            Die Nummer des zu findenden Artikels.
	 * @return den gefundenen Artikel oder null, falls kein passender Artikel
	 *         gefunden wird.
	 */
	public Artikel findeArtikel(int nummer) {

		for (Artikel artikel : lager) {
			if (artikel.gibNummer() == nummer) {
				return artikel;
			}
		}

		return null;
	}

	// public Artikel findeArtikel(String name) {
	// for (Artikel artikel : lager) {
	// if (artikel.gibName().equals(name)) {
	// return artikel;
	// }
	// }
	// return null;
	// }

	public Artikel findeArtikel(String name) {

		Iterator<Artikel> iterator = lager.iterator();
		while (iterator.hasNext()) {
			Artikel artikel = (Artikel) iterator.next();
			if (artikel != null && artikel.gibName().equals(name)) {
				return artikel;
			}
		}
		return null;
	}

	public Artikel loescheArtikel(String name) {

		Iterator<Artikel> iterator = lager.iterator();
		Artikel artikel = null;
		while (iterator.hasNext()) {
			artikel = (Artikel) iterator.next();
			if (artikel != null && artikel.gibName().equals(name)) {
				iterator.remove();
			}
		}
		return artikel;
	}

	/**
	 * Finde einen Artikel mit der angegebenen Nummer und liefere seine aktuelle
	 * Menge im Bestand. Wenn die Nummer auf keinen Artikel passt, wird Null
	 * zurückgeliefert.
	 * 
	 * @param nummer
	 *            Die Nummer des Artikels.
	 * @return die Menge des Artikels im Bestand.
	 */
	public int mengeImBestand(int nummer) {

		for (Artikel artikel : lager) {
			if (artikel.gibNummer() == nummer) {
				return artikel.gibBestand();
			}
		}

		return 0;
	}

	/**
	 * Informationen über alle Artikel ausgeben.
	 */
	public void alleArtikelAnzeigen() {

		for (Artikel artikel : lager) {
			System.out.println(artikel.toString());
		}
	}

	public void niedrigenArtikelbestandAusgeben(int minimum) {
		for (Artikel artikel : lager) {
			if (artikel.gibBestand() < minimum) {
				System.out.println(artikel);
			}
		}
	}

}
