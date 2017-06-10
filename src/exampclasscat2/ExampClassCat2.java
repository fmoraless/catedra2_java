package exampclasscat2;

public class ExampClassCat2 {

    public static void main(String[] args) {
        Lifo P = new Lifo();
        int op = 0, opctLCP = 0, dat, aux, maxelementospila = 0;

        do {
            System.out.print("Ingrese cantidad maxima de elementos para la Pila (Mayor a 0)");
            maxelementospila = Leer.datoInt();
        } while (maxelementospila == 0);

        do {
            Limpiar.cls();
            System.out.println("SEG >> " + "\n" + maxelementospila);
            System.out.println("MENU PRINCIPAL" + "\n");
            System.out.println("1) INGRESER DATOS");
            System.out.println("2) MOSTRAR DATOS");
            System.out.println("3) ELIMINAR DATOS");
            /* Catedra 2*/
            System.out.println("4) SUMAR DATOS");
            System.out.println("5) ORDERNAR DATOS");/* Catedra 2*/
            System.out.println("6) BUSCAR DATOS");
            System.out.println("7) SALIR");
            System.out.println("Ingrese su Opción: ");
            op = Leer.datoInt();

            SelPila(op, P, maxelementospila);
        } while (op != 7);
    }

    public static void SelPila(int op, Lifo P, int maxele) {
        int dat, aux, nElem = 0;

        switch (op) {
            case 1:
                Limpiar.cls();
                if (P.Largo() < maxele) {
                    System.out.println("INGRESE NUMERO: ");
                    dat = Leer.datoInt();
                    P.Insertar(dat);
                    System.out.println("PRESIONE ENTER PARA CONTINUAR: ");
                    aux = Leer.datoInt();
                } else {
                    Limpiar.cls();
                    System.out.println("MAXIMO ALCANZADO POR LA PILA: [" + maxele + "[");
                    System.out.println("PRESIONE ENTER PARA CONTINUAR: ");
                    aux = Leer.datoInt();
                }
                break;
            case 2:
                Limpiar.cls();
                System.out.println("EL CONTENIDO DE LA PILA  ES :: ");
                P.Imprimir();
                System.out.println("PRESIONES ENTER PARA CONTINUAR ");
                aux = Leer.datoInt();
                break;
            case 3:
                Limpiar.cls();
                System.out.println("EL CONTENIDO DE LA PILA  ES :: ");
                System.out.println(P.Eliminar());
                dat = Leer.datoInt();
                P.Buscar(dat);
                System.out.println("PRESIONES ENTER PARA CONTINUAR ");
                aux = Leer.datoInt();
                break;
            case 4:
                Limpiar.cls();
                System.out.println("EL CONTENIDO DE LA PILA  ES :: ");
                System.out.println(P.Sumar());
                System.out.println("PRESIONES ENTER PARA CONTINUAR ");
                aux = Leer.datoInt();
                break;
            case 5:
                Limpiar.cls();
                System.out.println("EL CONTENIDO DE LA PILA  ES :: ");
                System.out.println(P.Ordenar());
                System.out.println("PRESIONES ENTER PARA CONTINUAR ");
                aux = Leer.datoInt();
                break;
        }
    }

}
