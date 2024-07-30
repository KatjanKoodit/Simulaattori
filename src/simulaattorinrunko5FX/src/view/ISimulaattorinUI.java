package simulaattorinrunko5FX.src.view;

/**
 * Luokka <code>ISimulaattorinUI</code> interface simulaattorin GUI:lle.
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public interface ISimulaattorinUI {

	/**
	 * Noutaa kayttajan syottaman ajan simulaattorin GUI:sta
	 */
	public double getAika();

	/**
	 * Noutaa kayttajan syottaman viiveen simulaattorin GUI:sta
	 */
	public long getViive();

	/**
	 * Kontrolleri asettaa moottorilta saadun loppuajan nakyviin
	 * 
	 * @param aika loppuaika
	 */
	public void setLoppuaika(double aika);

	/**
	 * Kontrolleri asettaa moottorilta saadut palvellut asiakkaat nakyviin
	 * 
	 * @param asiakkaat palvellut asiakkaat
	 */
	public void setPalvellutAsiakkaat(int asiakkaat);

	/**
	 * vie visualisoinnin kontrollerille
	 */
	public IVisualisointi getVisualisointi();

	/**
	 * Hakee palvelupisteiden maaran
	 */
	int getMontakoPalvelupistettä();

	/**
	 * Hakee turvapisteiden ahkeruusparametrit taulukossa
	 */
	int[] getTurvapisteAhkeruus();

}
