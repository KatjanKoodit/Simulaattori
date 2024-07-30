package jUnitTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import simulaattorinrunko5FX.src.controller.Kontrolleri;
import simulaattorinrunko5FX.src.view.ISimulaattorinUI;

class KontorolleriTest {
	private ISimulaattorinUI ui;

	@Test
	void nollaPalauttaaViisitoista() {
		var kontrolleri = new Kontrolleri(ui);
		assertEquals(15, kontrolleri.luvunMuunnin(0));
	}

	@Test
	void yksiPalauttaaKolmekymmenta() {
		var kontrolleri = new Kontrolleri(ui);
		assertEquals(30, kontrolleri.luvunMuunnin(1));
	}

	@Test
	void kaksiPalauttaaNeljakymmenta() {
		var kontrolleri = new Kontrolleri(ui);
		assertEquals(40, kontrolleri.luvunMuunnin(2));
	}

	@Test
	void kolmePalauttaaKuusikymmentaviisi() {
		var kontrolleri = new Kontrolleri(ui);
		assertEquals(65, kontrolleri.luvunMuunnin(3));
	}

	@Test
	void neljaPalauttaaKahdeksankymmentaviisi() {
		var kontrolleri = new Kontrolleri(ui);
		assertEquals(85, kontrolleri.luvunMuunnin(4));
	}

}
