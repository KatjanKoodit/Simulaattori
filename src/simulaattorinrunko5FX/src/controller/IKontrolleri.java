package simulaattorinrunko5FX.src.controller;

/**
 * Luokka <code>IKontrolleri</code> rajapinta kontrollerille.
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */

public interface IKontrolleri {

	// Rajapinta, joka tarjotaan käyttöliittymälle:

	/**
	 * Kaynnistaa simuloinnin
	 */
	public void kaynnistaSimulointi();

	/**
	 * Nopeuttaa simuloinnin viivetta
	 */
	public void nopeuta();

	/**
	 * Hidastaa simuloinnin viivetta
	 */
	public void hidasta();

	/**
	 * Poistaa viiveen, jotta simulointi tapahtuu mahdollisimman nopeasti
	 */
	public void skippaa();

	// Rajapinta, joka tarjotaan moottorille:

	/**
	 * Nayttaa simulaation loppuajan
	 * 
	 * @param ajoId tietyn ajon id
	 */
	public void naytaLoppuaika(int ajoId);

	/**
	 * Visualisoi checkin asiakkaan
	 */
	public void visualisoiLaukutonAsiakas();

	/**
	 * Nayttaa palvellut asiakkaat
	 * 
	 * @param ajoId tietyn ajon id
	 */
	public void naytaPalvellutAsiakkkat(int ajoId);

	/**
	 * Ottaa kayttoon halutun maaran palvelupisteita
	 */
	public void palvelupisteidenMaara();

	/**
	 * Asettaa palvelupisteille uusen ahkeruusarvon
	 */
	void palvelupisteidenAhkeruus();

}
