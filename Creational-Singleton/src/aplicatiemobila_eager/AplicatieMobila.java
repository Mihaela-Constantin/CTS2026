package aplicatiemobila_eager;

public class AplicatieMobila {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta = new AplicatieMobila("Whatsapp",10);

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static AplicatieMobila getInstanta(){
        return instanta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(float dimensiune) {
        this.dimensiune = dimensiune;
    }
}
