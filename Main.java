public class Main {

    public static void main(String[] args) throws Exception {
        Pila pila = new Pila(30);
        Pila pila1 = new Pila(30);
        Pila pila2 = new Pila(30);

        MyQueue colaGeneral = new MyQueue(30);

        colaGeneral.enqueue(new Fruta("Manzana", 5));
        colaGeneral.enqueue(new Fruta("Membrillo", 2));
        colaGeneral.enqueue(new Fruta("Fresa", 4));

        colaGeneral.enqueue(new Fruta("Manzana", 7));
        colaGeneral.enqueue(new Fruta("Membrillo", 3));
        colaGeneral.enqueue(new Fruta("Fresa", 5));

        colaGeneral.enqueue(new Fruta("Manzana", 3));
        colaGeneral.enqueue(new Fruta("Membrillo", 8));
        colaGeneral.enqueue(new Fruta("Fresa", 6));

        colaGeneral.enqueue(new Fruta("Manzana", 7));
        colaGeneral.enqueue(new Fruta("Membrillo", 8));
        colaGeneral.enqueue(new Fruta("Fresa", 7));

        colaGeneral.enqueue(new Fruta("Fresa", 6));
        colaGeneral.enqueue(new Fruta("Manzana", 5));
        colaGeneral.enqueue(new Fruta("Membrillo", 4));

        colaGeneral.enqueue(new Fruta("Fresa", 2));
        colaGeneral.enqueue(new Fruta("Manzana", 3));
        colaGeneral.enqueue(new Fruta("Membrillo", 7));

        colaGeneral.enqueue(new Fruta("Fresa", 5));
        colaGeneral.enqueue(new Fruta("Manzana", 2));
        colaGeneral.enqueue(new Fruta("Membrillo", 4));

        System.out.println("Bodega:");

        while (!colaGeneral.isEmpty()) {
            Fruta fruta = colaGeneral.dequeue();

            if (fruta.getTipoFruta().equals("Fresa")) {
                pila.push(fruta);
            }
            if (fruta.getTipoFruta().equals("Manzana")) {
                pila1.push(fruta);
            }
            if (fruta.getTipoFruta().equals("Membrillo")) {
                pila2.push(fruta);
            }
        }
        Fruta caja1;
        System.out.println("----CONTENEDOR DE CAJAS DE FRESA----");
        while (!pila.isEmpty()) {
            caja1 = pila.pop();

            System.out.println("El almacen cuenta con cajas de: " + caja1.getTipoFruta() + " y su peso es de: "
                    + caja1.getCantPeso() + " kg");

        }
        System.out.println("----CONTENEDOR DE CAJAS DE MANZANA----");
        while (!pila1.isEmpty()) {
            caja1 = pila1.pop();

            System.out.println("El almacen cuenta con cajas de: " + caja1.getTipoFruta() + " y su peso es de: "
                    + caja1.getCantPeso() + " kg");

        }
        System.out.println("----ALMACEN DE CAJAS DE MEMBRILLO----");
        while (!pila2.isEmpty()) {
            caja1 = pila2.pop();

            System.out.println("El almacen cuenta con cajas de: " + caja1.getTipoFruta() + " y su peso es de: "
                    + caja1.getCantPeso() + " kg");

        }

    }

}
