/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Libreria.LimpiarPantalla;
import newpackage.Numerito;

/**
 *
 * @author Sanat
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Integer numerito = 5;
//        cambio(numerito);
//        System.out.println(numerito);
//        
//        Numerito nuevonum = new Numerito(numerito);
//        cambioClase(nuevonum);
//        System.out.println(nuevonum.getNumero());
        System.out.println("hola mundo");
        LimpiarPantalla.limpiarConAviso();

        System.out.println("adios");
    }

    public static void cambio(Integer numero) {
        numero++;
        System.out.println(numero);
    }

    public static void cambioClase(Numerito num) {
        Integer local = num.getNumero();
        local++;
        num.setNumero(local);
    }

}
