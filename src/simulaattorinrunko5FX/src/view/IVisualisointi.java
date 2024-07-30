package simulaattorinrunko5FX.src.view;

/**
 * Rajapinta <code>IVisualisointi</code> Rajapinta, joka maarittaa simulaattorin
 * animointia.
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public interface IVisualisointi {

	/**
	 * Alustaa visualisoinnin alkutilanteeseen
	 */
	public void tyhjennaNaytto();

	/**
	 * Alustaa visualisoinnin alkutilanteeseen ja luo turvatarkastuspisteet
	 * 
	 * @param maara haluttu turvatarkastuspisteiden maara
	 */
	public void tyhjennaNaytto(int maara);

	/**
	 * Visualisoi laukut ruumaan vieva asiakas
	 */
	public void laukkuAsiakas();

	/**
	 * Visualisoi kasimatkatavaroilla matkustava asiakas
	 */
	public void laukutonAsiakas();

	/**
	 * Poista laukut ruumaan vievan asiakkaan visualisointi
	 */
	public void poistaLaukkuAsiakas();

	/**
	 * Poista kasimatkatavaroilla matkustavan asiakkaan visualisointi
	 */
	public void poistaLaukutonAsiakas();

	/**
	 * Visualisoi ensimmaisen turvatarkastuspisteen asiakas
	 */
	public void turva1Asiakas();

	/**
	 * Poista ensimmaisen turvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaTurva1Asiakas();

	/**
	 * Visualisoi toisen turvatarkastuspisteen asiakas
	 */
	public void turva2Asiakas();

	/**
	 * Poista toisen turvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaTurva2Asiakas();

	/**
	 * Visualisoi kolmannen turvatarkastuspisteen asiakas
	 */
	public void turva3Asiakas();

	/**
	 * Poista kolmannen turvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaTurva3Asiakas();

	/**
	 * Visualisoi neljannen turvatarkastuspisteen asiakas
	 */
	public void turva4Asiakas();

	/**
	 * Poista neljannen turvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaTurva4Asiakas();

	/**
	 * Visualisoi viidennen turvatarkastuspisteen asiakas
	 */
	public void turva5Asiakas();

	/**
	 * Poista viidennen turvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaTurva5Asiakas();

	/**
	 * Visualisoi erityisturvatarkastuspisteen asiakas
	 */
	public void eTurvaAsiakas();

	/**
	 * Poista erityisturvatarkastuspisteen asiakkaan visualisointi
	 */
	public void poistaETurvaAsiakas();

	/**
	 * Paivittaa palveltujen ruumaan jonottavien asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiLaukutPalvelumaara(int nro);

	/**
	 * Paivittaa palveltujen kasimatkatavarapisteen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiCheckinPalvelumaara(int nro);

	/**
	 * Paivittaa ensimmaisessa turvatarkastuspisteessa palveltujen asiakkaiden
	 * lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva1Palvelumaara(int nro);

	/**
	 * Paivittaa toisessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva2Palvelumaara(int nro);

	/**
	 * Paivittaa kolmannessa turvatarkastuspisteessa palveltujen asiakkaiden
	 * lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva3Palvelumaara(int nro);

	/**
	 * Paivittaa neljannessa turvatarkastuspisteessa palveltujen asiakkaiden
	 * lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva4Palvelumaara(int nro);

	/**
	 * Paivittaa viidennessa turvatarkastuspisteessa palveltujen asiakkaiden
	 * lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva5Palvelumaara(int nro);

	/**
	 * Paivittaa erityisturvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiETurvaPalvelumaara(int nro);

	/**
	 * Paivittaa visualissoinnin viivearvoa
	 * 
	 * @param viive paljonko nykyinen viive on
	 */
	public void visualisoiViive(long viive);

}
