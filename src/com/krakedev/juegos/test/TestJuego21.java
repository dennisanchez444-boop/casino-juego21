package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Juego21;
import com.krakedev.juegos.entidades.Jugador;

public class TestJuego21 {

	public static void main(String[] args) {
		Juego21 juego = new Juego21();
		juego.inicializar();

		Jugador j1 = new Jugador();
		j1.setNickname("Dennis");

		Jugador j2 = new Jugador();
		j2.setNickname("Juan");

		Jugador j3 = new Jugador();
		j3.setNickname("Pedro");

		juego.agregarJugador(j1);
		juego.agregarJugador(j2);
		juego.agregarJugador(j3);

		var ganadores = juego.jugar();

		System.out.println("=== CARTAS DE LOS JUGADORES ===");
		juego.imprimirJugadores();

		System.out.println("=== RESULTADO ===");

		if (ganadores.isEmpty()) {
			System.out.println("No hubo ganadores");
		} else {
			for (Jugador j : ganadores) {
				System.out.println("Ganador: " + j.getNickname() + 
					" con " + j.getPuntajeCartas());
			}
		}
	}
}