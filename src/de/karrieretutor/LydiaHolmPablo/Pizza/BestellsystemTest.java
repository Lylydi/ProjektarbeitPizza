package de.karrieretutor.LydiaHolmPablo.Pizza;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BestellsystemTest {
    AlleZutaten alleZutaten = new AlleZutaten();

    @org.junit.jupiter.api.Test
    void checkPreis(){
        Pizza pizza = new Pizza();
        ArrayList<Zutat> zutaten = new ArrayList<>();
        zutaten.add((Zutat) alleZutaten.getListe().get(0));
        zutaten.add((Zutat) alleZutaten.getListe().get(1));
        pizza.setZutaten(zutaten);
        assertEquals(4.99 + 0.99 + 0.99, pizza.getPreis());
    }

    @org.junit.jupiter.api.Test
    void zahlen() {
        ArrayList<Pizza> pizzen = new ArrayList<>();

        Pizza pizza1 = new Pizza();
        ArrayList<Zutat> zutaten1 = new ArrayList<>();
        zutaten1.add((Zutat) alleZutaten.getListe().get(1));
        zutaten1.add((Zutat) alleZutaten.getListe().get(2));
        pizza1.setZutaten(zutaten1);

        Pizza pizza2 = new Pizza();
        ArrayList<Zutat> zutaten2 = new ArrayList<>();
        zutaten2.add((Zutat) alleZutaten.getListe().get(3));
        zutaten2.add((Zutat) alleZutaten.getListe().get(5));
        zutaten2.add((Zutat) alleZutaten.getListe().get(6));
        pizza2.setZutaten(zutaten2);

        pizzen.add(pizza1);
        pizzen.add(pizza2);

        assertEquals(4.99 + 0.99 + 1.39 + 4.99 + 1.39 + 0.59 + 0.59, Bestellsystem.zahlen(pizzen));
    }
}