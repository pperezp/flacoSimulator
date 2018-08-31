package model;

import java.util.ArrayList;
import java.util.List;
import model.personajes.Flaco;
import model.personajes.Malulo;

public class Juego {

    public static List<Malulo> malulos;
    public static List<Flaco> flacosChicos;
    public static List<String> frasesBuenas;
    public static List<String> frasesMalas;
    public static final String TITULO = "Flaco Simulator 16";
    public static final String VERSION = "v0.2a";

    public static void init() {
        frasesMalas = new ArrayList<>();
        frasesBuenas = new ArrayList<>();

        frasesMalas.add("Soy homosexual");
        frasesMalas.add("Soy maraco");
        frasesMalas.add("Tengo un pene en la raja");
        frasesMalas.add("Me gustan los glandes");
        frasesMalas.add("Te lo chupo gratis");
        frasesMalas.add("Soy el pasivo de la relación");
        frasesMalas.add("Me hago candado chino");
        frasesMalas.add("Me dan por el orto");

        frasesBuenas.add("Soy el más macho del universo");
        frasesBuenas.add("Soy bkn");
        frasesBuenas.add("Soy kchro po weon");
        frasesBuenas.add("Soy el más rico del universo");
        frasesBuenas.add("Soy sex symbol");
        frasesBuenas.add("Destajador de uteros");
        frasesBuenas.add("Destrozador de ovarios");
        frasesBuenas.add("Tengo el pene gigante");
        frasesBuenas.add("Las minas me aman");
        frasesBuenas.add("Me afeito con una motosierra");
        frasesBuenas.add("Me corto las uñas a balazos");
    }

    public static int kills = 0;
}
