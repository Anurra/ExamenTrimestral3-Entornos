/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentrimestral3;

/**
 * La clase Cafetera, organizara el funcionamiento de una cafetera, llenar,
 * vaciar,servir o agregar café
 *
 * @author Antonio Urbano Ramos
 * @version 1.0
 * @since 24/05/2021
 */
public class ExamenTrimestral3 {

    public class Cafetera implements InterfaceCafetera {

        private int llenaTotal;
        private int contadorLlenado;
        
        /*
         * se aplican los Getters y Setters
         */

        /**
         * @return the contadorLlenado
         */
        @Override
        public int getContadorLlenado() {
            return contadorLlenado;
        }

        /**
         * @param contadorLlenado the contadorLlenado to set
         */
        public void setContadorLlenado(int contadorLlenado) {
            this.contadorLlenado = contadorLlenado;
        }

         /**
         * @return the llenaTotal
         */
        @Override
        public int getLlenaTotal() {
            return llenaTotal;
        }

        /**
         * @param llenaTotal the llenaTotal to set
         */
        public void setLlenaTotal(int llenaTotal) {
            this.llenaTotal = llenaTotal;
        }
        
        /*
         * se empieza a declarar los constructores
         */
        
        /**
         * contiene el llenado total y el actual, si el actual es superior, la ajusta al maximo
         * @param llenaTotal
         * @param contadorLlenado 
         */

        public Cafetera(int llenaTotal, int contadorLlenado) {
            contadorLlenado = contadorLlenado;
            llenaTotal = Math.max(llenaTotal, contadorLlenado);
        }

        /**
         * se establece el llenado total y se inicializa el contador de llenado
         * @param llenaTotal 
         */
        public Cafetera(int llenaTotal) {
            this(llenaTotal, 0);
        }

        /**
         * se establece el llenado total en 1000 y se inicializa el contador de llenado
         */
        public Cafetera() {
            this(1000, 0);
        }

        /*
         * se empieza a declarar los métodos
         */
      
        /**
         * El contador de llenado, es llenado a su llenadoTotal
         */
        public void llenarCafetera() {
            setContadorLlenado(getLlenaTotal());
        }

        /**
         * El contador de llenado menos la tamaño de la taza, sera el resultado del contadorLlenado
         * @param tamanoTaza
         * @throws Exception 
         */
        public void servirTaza(int tamanoTaza) throws Exception {
            setContadorLlenado(getContadorLlenado() - tamanoTaza);
            if (getContadorLlenado() < 0) {
                setContadorLlenado(0);
                throw new Exception("No hay café");
            }
        }

       /**
        * Cafetera vacía, contadorLlenado es cero
        */
        public void vaciarCafetera() {
            setContadorLlenado(0);
        }

        /**
         * se agrega un contadorLlenado
         * la cantidad introducida
         * @param cantidad
         * @throws Exception 
         */
        public void agregarCafe(int cantidad) throws Exception {
            setContadorLlenado(getContadorLlenado() + cantidad);
            if (getContadorLlenado() > getLlenaTotal()) {
                setContadorLlenado(getLlenaTotal());
                throw new Exception("Rebosa");
            }

        }

    }
}
