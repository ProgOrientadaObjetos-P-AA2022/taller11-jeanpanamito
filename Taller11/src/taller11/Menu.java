/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String n, double vI) {
        nombrePlato = n;
        valorInicial = vI;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorMenu(double v) {
        valorMenu = v;
    }

    public void establecerValorInicial(double vI) {
        valorInicial = vI;
    }

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public abstract void calcularValorTotal();

    @Override
    public String toString() {
        String cadena = String.format("\tPlato: %s\n"
                + "\tValor Inicial del menu: %.2f\n", 
                obtenerNombrePlato(),
                obtenerValorInicial());
        return cadena;
    }
}
