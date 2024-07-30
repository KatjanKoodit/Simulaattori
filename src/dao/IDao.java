package dao;

import java.util.ArrayList;

import entity.Tulokset;

/**
 * Luokka <code>IDao</code> .
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public interface IDao {
	/**
	 * Lisaa ajokerran tulokset tietokantaan
	 * 
	 * @param ajokerta yhden ajokerran tulokset-olio
	 */
	public void lisaaTulos(Tulokset ajokerta);

	/**
	 * Hae ajokerran tulokset tietokannasta
	 * 
	 * @param ajokertaId haettavan ajokerran id
	 */
	public Tulokset haeTulokset(int ajokertaId);

	/**
	 * Poista ajokerran tulokset tietokannasta
	 * 
	 * @param ajokertaId haettavan ajokerran id
	 */
	public void poistaTulos(int ajokertaId);

	/**
	 * Hae kaikki tulokset tietokannasta ja luo niista pelkat ajoId:t sisaltava
	 * lista
	 */
	public ArrayList<String> haeAjokertaLista();
}
