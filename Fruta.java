public class Fruta {

    private String tipoFruta;
    private int cantPeso;

    public Fruta(String tipoFruta, int cantPeso) {
        this.tipoFruta = tipoFruta;
        this.cantPeso = cantPeso;
    }

    public String getTipoFruta() {
        return tipoFruta;
    }

    public int getCantPeso() {
        return cantPeso;
    }
}
