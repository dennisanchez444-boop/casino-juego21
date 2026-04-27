package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	private ArrayList<Carta> naipe;

	public Dealer() {
		naipe = new ArrayList<>();
		generarNaipe();
	}

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	public void generarNaipe() {
		String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] palos = { "T", "CN", "D", "CR" };

		for (String palo : palos) {
			for (String valor : valores) {
				Carta carta = new Carta(valor,palo);
				naipe.add(carta);
			}
		}
	}
	
	public void imprimirNaipe() {
		for(Carta c : naipe) {
			c.imprimir();
		}
	}
	
	
}
