package simulaattorinrunko5FX.src.simu.model;

import java.text.DecimalFormat;

import simulaattorinrunko5FX.src.simu.framework.Kello;
import simulaattorinrunko5FX.src.simu.framework.Trace;

/**
 * Luokka <code>Asiakas</code> simulaattorissa liikkuva asiakas.
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public class Asiakas {
	private double saapumisaika;
	private double poistumisaika;
	private double ppJonoonSaapumisaika;
	private double ppPoistumisaika;
	private int id;
	private static int i = 1;
	private static long sum = 0;
	private static final DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * Konstruktori, jolla luodaan uusia asiakas. Asiakas saa id:n ja luomisen
	 * kellonajan
	 */
	public Asiakas() {
		id = i++;

		saapumisaika = Kello.getInstance().getAika();
		Trace.out(Trace.Level.INFO, "Uusi asiakas nro " + id + " saapui klo " + df.format(saapumisaika));
	}

	/**
	 * Palauttaa asiakkaan poistumisajan
	 * 
	 * @return poistumisaika
	 */
	public double getPoistumisaika() {
		return poistumisaika;
	}

	/**
	 * Asettaa asiakkaan poistumisajan
	 * 
	 * @param poistumisaika kertoo koska asiakas poistuu palvelusta
	 */
	public void setPoistumisaika(double poistumisaika) {
		this.poistumisaika = poistumisaika;
	}

	/**
	 * Palauttaa asiakkaan saapumisajan
	 * 
	 * @return saapumisaika
	 */
	public double getSaapumisaika() {
		return saapumisaika;
	}

	/**
	 * Asettaa asiakkaan saapumisajan
	 * 
	 * @param saapumisaika kertoo milloin asiakas saapui palveluun
	 */
	public void setSaapumisaika(double saapumisaika) {
		this.saapumisaika = saapumisaika;
	}

	/**
	 * Palauuttaa asiakkaan id:n
	 * 
	 * @return id asiakkaan id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Luo raportin asiakkaan saapumisesta, kuinka kauan palvelu kesti ja milloin
	 * asiakas poistui
	 */
	public void raportti() {

		Trace.out(Trace.Level.INFO, "\nAsiakas " + id + " valmis! ");
		Trace.out(Trace.Level.INFO, "Asiakas " + id + " saapui: " + df.format(saapumisaika));
		Trace.out(Trace.Level.INFO, "Asiakas " + id + " poistui: " + df.format(poistumisaika));
		Trace.out(Trace.Level.INFO, "Asiakas " + id + " viipyi: " + (df.format(poistumisaika - saapumisaika)));
		sum += (poistumisaika - saapumisaika);
		double keskiarvo = sum / id;
		System.out.println("Asiakkaiden läpimenoaikojen keskiarvo tähän asti " + df.format(keskiarvo));

	}

	/**
	 * Palauttaa jonoon saapumisajan
	 * 
	 * @return ppJonoonSaapumisaika
	 */
	public double getPpJonoonSaapumisaika() {
		return ppJonoonSaapumisaika;
	}

	/**
	 * Asettaa jonoon saapumisajan
	 * 
	 * @param ppJonoonSaapumisaika koska asiakas saapui jonoon
	 */
	public void setPpJonoonSaapumisaika(double ppJonoonSaapumisaika) {
		this.ppJonoonSaapumisaika = ppJonoonSaapumisaika;
	}

	/**
	 * Palauttaa koska asiakas poistui palvelusta
	 * 
	 * @return ppPoistumisaika
	 */
	public double getPpPoistumisaika() {
		return ppPoistumisaika;
	}

	/**
	 * Asettaa poistumisajan
	 * 
	 * @param ppPoistumisaika milloin asiakas poistui palvelusta
	 */
	public void setPpPoistumisaika(double ppPoistumisaika) {
		this.ppPoistumisaika = ppPoistumisaika;
	}

}
