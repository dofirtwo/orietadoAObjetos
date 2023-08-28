/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesInterfaces;

/**
 *
 * @author USUARIO
 */
 class Celular implements ILlamada, ITeclado {
    @Override
    public void llamar(){
        System.out.println("Llamando....");
    }
    @Override
    public void escribir(){
        System.out.println("Escribiendo...");
    }
}
