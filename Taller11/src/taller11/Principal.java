/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

import java.util.ArrayList;

/**
 *
 * @author UTPL
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Menu> menu = new ArrayList<>();

        MenuNiños mn1 = new MenuNiños("Niños 01", 2, 1, 1.5);
        mn1.calcularValorTotal();

        MenuNiños mn2 = new MenuNiños("Niños 02", 3, 1, 1.5);
        mn2.calcularValorTotal();
        menu.add(mn1);
        menu.add(mn2);

        MenuEconomico me1 = new MenuEconomico("Econo 001", 4, 25);
        me1.calcularValorTotal();
        menu.add(me1);

        MenudelDia md1 = new MenudelDia("Dia 001", 5, 1, 1);
        md1.calcularValorTotal();
        menu.add(md1);

        MenuCarta mC1 = new MenuCarta("Carta001", 6, 1.5, 2, 10);
        mC1.calcularValorTotal();
        menu.add(mC1);

        Cuenta c = new Cuenta("Jean Panamito", menu, 5);
        c.calcularValorCancelar();

        System.out.println(c);

    }

}
