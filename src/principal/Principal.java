package principal;


import acão.Batalha;
import personagens.Alien;
import personagens.Personagem;
import personagens.Robo;
import personagens.Soldado;

public class Principal {
    public static void main(String[] args) {
        // Criando personagens
        Personagem soldado = new Soldado("Rambo");
        Personagem alien = new Alien("Xenomorfo");
        Personagem robo = new Robo("Exterminador");

        // Criando a batalha
        Batalha batalha = new Batalha();

        // Iniciando o duelo
        batalha.iniciarDuelo(soldado, alien);
        batalha.iniciarDuelo(robo, soldado);
    }
}

