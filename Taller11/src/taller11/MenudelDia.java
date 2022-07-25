/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenudelDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenudelDia(String n, double vinicial, double vP, double vB) {
        super(n, vinicial);
        valorPostre = vP;
        valorBebida = vB;
    }

    public void establecerValorPostre(double vP) {
        valorPostre = vP;
    }

    public void establecerValorBebida(double vBebida) {
        valorBebida = vBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    public double obtenerValorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia\n%s", super.toString());
        cadena = String.format("%s"
                +"\tValor Bebida:%.2f\n"
                +"\tValor Postre:%.2f\n"
                + "\tValor del Menu:%.2f\n", cadena,
                obtenerValorBebida(),
                obtenerValorPostre(),
                obtenerValorMenu());
        return cadena;
    }
}
