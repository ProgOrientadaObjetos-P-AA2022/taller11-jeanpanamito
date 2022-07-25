/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(String nombrePl, double valorinicial, double vH, double vP) {
        super(nombrePl, valorinicial);
        valorHelado = vH;
        valorPastel = vP;
    }

    public void establecerValorHelado(double valorH) {
        this.valorHelado = valorH;
    }

    public void establecerValorPastel(double valorP) {
        valorPastel = valorP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu de Ninos\n%s", super.toString());
        cadena = String.format("%s"
                + "\tValor Porcion Helado:%.2f\n"
                + "\tValor Porcion Pastel:%.2f\n"
                + "\tValor del Menu:%.2f\n", cadena,
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenerValorMenu()
        );
        return cadena;
    }
}
