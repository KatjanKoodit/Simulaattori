package simulaattorinrunko5FX.src.view;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Luokka <code>Visualisointi</code> Luokka, joka vastaa simulaattorin animoinnista.
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public class Visualisointi extends Canvas implements IVisualisointi {

	private GraphicsContext gc;

	private double i = 140;
	private double j = 215;
	private double x = 140;
	private double y = 415;
	private double a = 265;
	private double b = 110;
	private double c = 365;
	private double d = 110;
	private double e = 465;
	private double f = 110;
	private double g = 565;
	private double h = 110;
	private double k = 665;
	private double l = 110;
	private double m = 740;
	private double n = 250;

	//
	
	/**
	 * Konstruktori visualisoinnille
	 * 
	 * @param w halutun visualisoinnin ikkunan leveys
	 * @param h halutun visualisoinnin ikkuann korkeus
	 */
	public Visualisointi(int w, int h) {
		super(w, h);
		gc = this.getGraphicsContext2D();
		tyhjennaNaytto();
	}

	/**
	 * Piirtaa tyhjan nelion ja checkin pisteet visualisointiin, eli ns. alustaa visualisoinnin
	 */
	public void tyhjennaNaytto() {
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(0, 0, this.getWidth(), this.getHeight());
		luoCheckinPisteet();	
	}

	/**
	 * Piirtaa alkutilan ja valitun maaran turvatarkastuspisteita
	 * 
	 * @param maara montako turvatarkastuspistetta piirretaan
	 */
	public void tyhjennaNaytto(int maara) {
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(0, 0, this.getWidth(), this.getHeight());
		luoCheckinPisteet();
		luoUITurvaPisteet(maara);
	}

	/**
	 * Piirtaa ruuman asiakasjonoon palloja
	 */
	public void laukkuAsiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(i, j, 20, 20);

		i = (i - 20);
		if (i <= 0) {
			i = 140;
			j -= 20;
		}
	}

	/**
	 * Poistaa ruuman aiakasjonon palloja
	 */
	public void poistaLaukkuAsiakas() {
		if (i >= 140) {
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillOval(i, j, 20, 20);
			i = 20;
			j += 20;
		} else {
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillOval(i, j, 20, 20);
			i += 20;
		}
	}

	/**
	 * Piirtaa kasimatkatavarajonoon palloja
	 */
	public void laukutonAsiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(x, y, 20, 20);

		x = (x - 20);
		if (x <= 0) {
			x = 140;
			y += 20;
		}
	}

	/**
	 * Poistaa kasimatkatavarajonon palloja
	 */
	public void poistaLaukutonAsiakas() {
		if (x >= 140) {
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillOval(x, y, 20, 20);
			x = 20;
			y -= 20;
		} else {
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillOval(x, y, 20, 20);
			x += 20;
		}
	}

	/**
	 * Piirtaa ensimmaisen turvatarkastuspisteen palloja
	 */
	public void turva1Asiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(a, b, 20, 20);

		b = (b + 20);
	}

	/**
	 * Poistaa ensimmaisen turvatarkastuspisteen palloja
	 */
	public void poistaTurva1Asiakas() {
		b -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(a, b, 20, 20);
	}
	
	/**
	 * Piirtaa toisen turvatarkastuspisteen palloja
	 */
	public void turva2Asiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(c, d, 20, 20);

		d = (d + 20);
	}

	/**
	 * Poistaa toisen turvatarkastuspisteen palloja
	 */
	public void poistaTurva2Asiakas() {
		d -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(c, d, 20, 20);
	}
	
	/**
	 * Piirtaa kolmannen turvatarkastuspisteen palloja
	 */
	public void turva3Asiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(e, f, 20, 20);

		f = (f + 20);
	}

	/**
	 * Poistaa kolmannen turvatarkastuspisteen palloja
	 */
	public void poistaTurva3Asiakas() {
		f -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(e, f, 20, 20);
		
	}
	
	/**
	 * Piirtaa neljannen turvatarkastuspisteen palloja
	 */
	public void turva4Asiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(g, h, 20, 20);

		h = (h + 20);
	}

	/**
	 * Poistaa neljannen turvatarkastuspisteen palloja
	 */
	public void poistaTurva4Asiakas() {
		h -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(g, h, 20, 20);
	}
	
	/**
	 * Piirtaa viidennen turvatarkastuspisteen palloja
	 */
	public void turva5Asiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(k, l, 20, 20);

		l = (l + 20);
	}

	/**
	 * Poistaa viidennen turvatarkastuspisteen palloja
	 */
	public void poistaTurva5Asiakas() {
		l -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(k, l, 20, 20);
	}
	
	/**
	 * Piirtaa erityisturvatarkastuspisteen palloja
	 */
	public void eTurvaAsiakas() {
		gc.setFill(Color.DARKGREEN);
		gc.fillOval(m, n, 20, 20);

		n = (n + 20);
	}

	/**
	 * Poistaa erityisturvatarkastuspisteen palloja
	 */
	public void poistaETurvaAsiakas() {
		n -= 20;
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillOval(m, n, 20, 20);
	}
	
	/**
	 * Paivittaa palveltujen ruumaan jonottavien asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiLaukutPalvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(171, 180, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 175, 195);
	}
	
	/**
	 * Paivittaa palveltujen kasimatkatavarapisteen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiCheckinPalvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(171, 380, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 175, 395);
	}
	
	/**
	 * Paivittaa ensimmaisessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva1Palvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(261, 40, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 265, 55);
	}
	
	/**
	 * Paivittaa toisessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva2Palvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(361, 40, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 365, 55);
	}
	
	/**
	 * Paivittaa kolmannessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva3Palvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(461, 40, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 465, 55);
	}
	
	/**
	 * Paivittaa neljannessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva4Palvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(561, 40, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 565, 55);
	}
	
	/**
	 * Paivittaa viidennessa turvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiTurva5Palvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(661, 40, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 665, 55);
	}
	
	/**
	 * Paivittaa erityisturvatarkastuspisteessa palveltujen asiakkaiden lukumaaraa
	 * 
	 * @param nro montako asiakasta palveltu
	 */
	public void visualisoiETurvaPalvelumaara(int nro) {
		String txt = Integer.toString(nro);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(736, 180, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 740, 195);
	}
	
	/**
	 * Paivittaa visualissoinnin viivearvoa
	 * 
	 * @param viive paljonko nykyinen viive on
	 */
	public void visualisoiViive(long viive) {
		String txt = Long.toString(viive);
		gc.setFill(Color.rgb(208, 241, 218));
		gc.fillRect(736, 20, 60, 20);
		gc.setFill(Color.BLACK);
		gc.fillText(txt, 740, 35);
	}

	/**
	 * Piirtaa palvelupisteet ja niihin liittyvat tekstit
	 */
	public void luoCheckinPisteet() {
		gc.setFont(new Font("Arial", 15));
		gc.setFill(Color.rgb(139, 150, 167));
		gc.fillRect(160, 200, 50, 50);
		gc.fillRect(160, 400, 50, 50);
		gc.setFill(Color.WHITE);
		gc.fillText("Ruuma", 161, 230);
		gc.setFill(Color.BLACK);
		gc.fillText("Palveltu:", 161, 180);
		gc.fillText("Palveltu:", 161, 380);
		gc.setFill(Color.WHITE);
		gc.fillText("Käsi-", 168, 425);
		gc.fillText("tavarat", 162, 437);

		gc.setFill(Color.rgb(92, 133, 173));
		gc.fillRect(250, 60, 50, 50);
		gc.setFill(Color.BLACK);
		gc.fillText("Palveltu:", 251, 40);
		gc.setFill(Color.WHITE);
		gc.fillText("Turva", 255, 82);
		gc.fillText("1", 271, 100);
		
		gc.setFill(Color.rgb(129, 166, 119));
		gc.fillRect(725, 200, 50, 50);
		gc.setFill(Color.BLACK);
		gc.fillText("Palveltu:", 726, 180);
		gc.setFill(Color.WHITE);
		gc.fillText("E-turva", 726, 230);
		
		gc.setFill(Color.BLACK);
		gc.fillText("Viive:", 730, 20);
	}

	/**
	 * Piirtaa turvatarkastuspisteet valitun maaran mukaan
	 * 
	 * @param maara montako turvatarkastuspistetta on valittu
	 */
	public void luoUITurvaPisteet(int maara) {
		switch (maara) {
		case 0:
			gc.setFill(Color.rgb(92, 133, 173));
			gc.fillRect(250, 60, 50, 50);
			gc.setFill(Color.BLACK);
			gc.fillText("Palveltu:", 251, 40);
			gc.setFill(Color.WHITE);
			gc.fillText("Turva", 255, 82);
			gc.fillText("1", 271, 100);
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillRect(350, 60, 50, 50);
			gc.fillRect(450, 60, 50, 50);
			gc.fillRect(550, 60, 50, 50);
			gc.fillRect(650, 60, 50, 50);
			break;
		case 1:
			gc.setFill(Color.rgb(92, 133, 173));
			gc.fillRect(250, 60, 50, 50);
			gc.fillRect(350, 60, 50, 50);
			gc.setFill(Color.BLACK);
			gc.fillText("Palveltu:", 251, 40);
			gc.fillText("Palveltu:", 351, 40);
			gc.setFill(Color.WHITE);
			gc.fillText("Turva", 255, 82);
			gc.fillText("1", 271, 100);
			gc.fillText("Turva", 355, 82);
			gc.fillText("2", 371, 100);
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillRect(450, 60, 50, 50);
			gc.fillRect(460, 400, 50, 50);
			gc.fillRect(460, 500, 50, 50);
			break;
		case 2:
			gc.setFill(Color.rgb(92, 133, 173));
			gc.fillRect(250, 60, 50, 50);
			gc.fillRect(350, 60, 50, 50);
			gc.fillRect(450, 60, 50, 50);
			gc.setFill(Color.BLACK);
			gc.fillText("Palveltu:", 251, 40);
			gc.fillText("Palveltu:", 351, 40);
			gc.fillText("Palveltu:", 451, 40);
			gc.setFill(Color.WHITE);
			gc.fillText("Turva", 255, 82);
			gc.fillText("1", 271, 100);
			gc.fillText("Turva", 355, 82);
			gc.fillText("2", 371, 100);
			gc.fillText("Turva", 455, 82);
			gc.fillText("3", 471, 100);
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillRect(550, 60, 50, 50);
			gc.fillRect(650, 60, 50, 50);
			break;
		case 3:
			gc.setFill(Color.rgb(92, 133, 173));
			gc.fillRect(250, 60, 50, 50);
			gc.fillRect(350, 60, 50, 50);
			gc.fillRect(450, 60, 50, 50);
			gc.fillRect(550, 60, 50, 50);
			gc.setFill(Color.BLACK);
			gc.fillText("Palveltu:", 251, 40);
			gc.fillText("Palveltu:", 351, 40);
			gc.fillText("Palveltu:", 451, 40);
			gc.fillText("Palveltu:", 551, 40);
			gc.setFill(Color.WHITE);
			gc.fillText("Turva", 255, 82);
			gc.fillText("1", 271, 100);
			gc.fillText("Turva", 355, 82);
			gc.fillText("2", 371, 100);
			gc.fillText("Turva", 455, 82);
			gc.fillText("3", 471, 100);
			gc.fillText("Turva", 555, 82);
			gc.fillText("4", 571, 100);
			gc.setFill(Color.rgb(208, 241, 218));
			gc.fillRect(650, 60, 50, 50);
			break;
		case 4:
			gc.setFill(Color.rgb(92, 133, 173));
			gc.fillRect(250, 60, 50, 50);
			gc.fillRect(350, 60, 50, 50);
			gc.fillRect(450, 60, 50, 50);
			gc.fillRect(550, 60, 50, 50);
			gc.fillRect(650, 60, 50, 50);
			gc.setFill(Color.BLACK);
			gc.fillText("Palveltu:", 251, 40);
			gc.fillText("Palveltu:", 351, 40);
			gc.fillText("Palveltu:", 451, 40);
			gc.fillText("Palveltu:", 551, 40);
			gc.fillText("Palveltu:", 651, 40);
			gc.setFill(Color.WHITE);
			gc.fillText("Turva", 255, 82);
			gc.fillText("1", 271, 100);
			gc.fillText("Turva", 355, 82);
			gc.fillText("2", 371, 100);
			gc.fillText("Turva", 455, 82);
			gc.fillText("3", 471, 100);
			gc.fillText("Turva", 555, 82);
			gc.fillText("4", 571, 100);
			gc.fillText("Turva", 655, 82);
			gc.fillText("5", 671, 100);
			break;
		}
	}
}
