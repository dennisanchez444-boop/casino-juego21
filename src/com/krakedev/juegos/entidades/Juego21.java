package com.krakedev.juegos.entidades;

import java.util.ArrayList;

import com.krakedev.juegos.servicios.Dealer;

public class Juego21 {
	private ArrayList<Jugador> jugadores;
	private Dealer dealer;

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void cargarValores() {
		for (Carta c : dealer.getNaipe()) {
			String valor = c.getValor();

			if (valor.equals("A")) {
				c.setValorJuego(11);
			} else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
				c.setValorJuego(10);
			} else {
				c.setValorJuego(Integer.parseInt(valor));
			}
		}
	}

	public void inicializar() {
		jugadores = new ArrayList<>();
		dealer = new Dealer();
		cargarValores();
	}

	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);
	}

	public void repartirRonda() {
		for (int i = 0; i < 2; i++) {
			for (Jugador j : jugadores) {
				repartirCarta(j);
			}
		}
	}
	
	public void imprimirJugadores() {
		for (Jugador j : jugadores) {
			System.out.println("Jugador: " + j.getNickname());

			for (Carta c : j.getCartas()) {
				c.imprimir();
			}

			System.out.println("-------------------");
		}
	}
}
