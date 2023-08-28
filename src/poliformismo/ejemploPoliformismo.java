/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliformismo;

/**
 *
 * @author USUARIO
 */
public class ejemploPoliformismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        puerta cerrada = new puertaCerrada();
        puerta abierta=new puertaAbierta();
        System.out.println(cerrada.UsarLlave());
        System.out.println(abierta.UsarLlave());
    }

}
