public class Pila {
    private Fruta pilas[];
    private int tope;

    public Pila(int capacidad) {
        pilas = new Fruta[capacidad];
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public void push(Fruta i) {
        if (tope + 1 < pilas.length)
            pilas[++tope] = i;
    }

    public Fruta pop() {
        if (isEmpty())
            return null;
        return pilas[tope--];
    }

    public Fruta peek() {
        if (isEmpty())
            return null;
        return pilas[tope];
    }

}
