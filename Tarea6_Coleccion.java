/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6_coleccion;
/**
 * @author Gabriel Alexander Diaz Vera
 */
import java.util.ArrayList;
import java.util.Collection;
public class Tarea6_Coleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema: Simulacion del accionamiento de un airbag mediante "
            + "un indicador auditivo y visual (buzer, led), además le permita "
            + "determinar el tiempo en que se mantiene accionado\n");
        Collection listaElementosProyecto=new ArrayList< String >();
        //El tipo de lista ElementosProyecto es collection
        listaElementosProyecto.add("Circuito integrado NE555");
        listaElementosProyecto.add("Led rojo");
        listaElementosProyecto.add("Buzer");
        listaElementosProyecto.add("Piezoelectrico");
        listaElementosProyecto.add("Dos resistencia 10K");
        listaElementosProyecto.add("una resisitencia 1k");
        listaElementosProyecto.add("Un condensador 100 microfaradios");
        listaElementosProyecto.add("Alambre de timbre");
        listaElementosProyecto.add("Protoboard");
        listaElementosProyecto.add("Fuente DC");
        listaElementosProyecto.add("Acido Ferrico");
        listaElementosProyecto.add("Baquelita");
        listaElementosProyecto.add("Cautin");
        listaElementosProyecto.add("Estanio");
        System.out.println("\nNumero de elementos utilizados en el proyectos: "
                + ""+listaElementosProyecto.size());
        System.out.println("\nLOS ELEMENTOS UTILIZADOS SON: ");
        System.out.println(listaElementosProyecto.toString());
        listaElementosProyecto.remove("Acido Ferrico");
        listaElementosProyecto.remove("Baquelita");
        System.out.println("\nNumero de elementos despues de ser eliminados Acido Ferrico"
                + " y Baquelita: "+listaElementosProyecto.size());
        System.out.println("\nLA LISTA DE ELEMENTOS QUE QUEDAN SON: ");
        System.out.println(listaElementosProyecto.toString());


    }

}
