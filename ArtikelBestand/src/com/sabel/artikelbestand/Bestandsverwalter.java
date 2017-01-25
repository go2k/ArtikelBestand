package com.sabel.artikelbestand;
import java.util.ArrayList;

/**
 * Verwalte den Bestand eines Unternehmens.
 * Der Bestand ist beschrieben durch einen oder
 * mehrere Artikel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestandsverwalter
{
    // Das Lager mit den Artikeln
    private ArrayList<Artikel> lager;

    /**
     * Initialisiere den Bestandsverwalter.
     */
    public Bestandsverwalter()
    {
        lager = new ArrayList<Artikel>();
    }

    /**
     * Führe einen neuen Artikel im Lager ein.
     * @param artikel Der Artikel, der neue eingeführt werden soll.
     */
    public void neuerArtikel(Artikel artikel)
    {
        lager.add(artikel);
    }
    
    /**
     * Nimm eine Lieferung eines Artikels in das Lager auf.
     * Erhöhe den Lagerbestand um die angegebene Menge.
     * @param nummer Die Artikelnummer des Artikels.
     * @param menge Die angelieferte Menge.
     */
    public void aufnehmen(int nummer, int menge)
    {
    }
    
    /**
     * Versuche einen Artikel mit der angegebenen Nummer im
     * Bestand zu finden.
     * @param nummer Die Nummer des zu findenden Artikels.
     * @return den gefundenen Artikel oder null, falls kein
     *         passender Artikel gefunden wird.
     */
    public Artikel findeArtikel(int nummer)
    {
        return null;
    }
    
    /**
     * Finde einen Artikel mit der angegebenen Nummer und
     * liefere seine aktuelle Menge im Bestand.
     * Wenn die Nummer auf keinen Artikel passt, wird
     * Null zurückgeliefert.
     * @param nummer Die Nummer des Artikels.
     * @return die Menge des Artikels im Bestand.
     */
    public int mengeImBestand(int nummer)
    {
        return 0;
    }

    /**
     * Informationen über alle Artikel ausgeben.
     */
    public void alleArtikelAnzeigen()
    {
    }
}