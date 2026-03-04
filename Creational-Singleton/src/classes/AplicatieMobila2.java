package classes;

public class AplicatieMobila2 {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila2 instanta = new AplicatieMobila2("Whatsapp",10);

    private AplicatieMobila2(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static AplicatieMobila2 getInstanta(){
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
