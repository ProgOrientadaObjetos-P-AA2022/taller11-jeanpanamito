/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

/**
 *
 * @author UTPL
 */
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nP, double vinicialM, double pD) {
        super(nP, vinicialM);
        porcentajeDescuento = pD;

    }

    public void establecerPorcentajeDescuento(double pD) {
        porcentajeDescuento = pD;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void calcularValorTotal() {
        valorMenu = valorInicial - ((porcentajeDescuento * valorInicial) / 100);
    }

    public double obtenervalorcancelartotal() {
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Económico\n%s", super.toString());
        cadena = String.format("%s"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menu:%.2f\n",
                cadena,
                obtenerPorcentajeDescuento(),
                obtenerValorMenu());
        return cadena;
    }
}
