package exampclasscat2;

public class Lifo {

    private NodoLifo raiz;

    public void Insertar(int x) {
        NodoLifo nuevo;
        nuevo = new NodoLifo();
        nuevo.info = x;

        if (raiz == null) {
            nuevo.sig = raiz;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public void Imprimir() {
        NodoLifo reco = raiz;
        System.out.println("LISTADO DE TODOS LOS ELEMENTOS DE LA PILA.");
        while (reco != null) {
            System.out.println(reco.info + "-");
            reco = reco.sig;
        }
        System.out.println();
    }

    public int Buscar(int buscar) {
        NodoLifo reco = raiz;
        int retorno = 1, posicion = 0;
        while (reco != null) {
            posicion++;
            if (reco.info == buscar) {
                System.out.println("DATO ENCONTRADO EN POSISCION: " + posicion + "");
                retorno = reco.info;
                break;
            }
            reco = reco.sig;
        }
        if (retorno == 1) {
            System.out.println("DATO INGRESADO " + buscar + ", NOSE ENCUENTRA...");
        }
        return retorno;
    }

    public int Sumar() {
        NodoLifo reco = raiz;
        int totalSuma = 0;

        while (reco != null) {
            totalSuma = totalSuma + reco.info;
            reco = reco.sig;
        }
        return totalSuma;
    }

    public int Largo() {
        NodoLifo reco = raiz;
        int totalElementos = 0;

        while (reco != null) {
            totalElementos++;
            reco = reco.sig;
        }
        return totalElementos;
    }

    public int Eliminar() {
        NodoLifo reco = raiz;
        int rt = -1;
        while (reco != null) {
            if (reco.sig != raiz) {
                raiz = reco.sig;
                System.out.println("ES: " + reco.info + "\n");
                rt = reco.info;
                break;
            }

        }
        if (rt == -1) {
            System.out.println("La pila está vacía");
        }
        return rt;
    }

    public void Ordenar(int nElem) {
        NodoLifo reco = raiz;
        int c = 0;
        int ordenado[] = new int[nElem];
        while (reco != null) {
            ordenado[c] = reco.info;
            reco = reco.sig;
            c++;
        }

        for (int i = 0; i < ordenado.length; i++) {
            for (int j = 0; j < ordenado.length - i - 1; j++) {
                if (ordenado[j + 1] < ordenado[j]) {
                    int aux = ordenado[j+1];
                    ordenado[j+1]=ordenado[j];
                    ordenado[j]=aux;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(ordenado[i]+"\n");
        }
    }
}
