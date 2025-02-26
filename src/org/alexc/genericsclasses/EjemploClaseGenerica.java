package org.alexc.genericsclasses;

public class EjemploClaseGenerica {

    public static void main(String[] args) {
        Camion transpCaballo = new Camion(5);
        transpCaballo.addObjeto(new Animal("Spirit", "Caballo"));
        transpCaballo.addObjeto(new Animal("Lucho", "Caballo"));

    }
}
