package aplicatiemobila_lazy;

public class AplicatieMobila {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta = null;

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static synchronized AplicatieMobila getInstanta(){
        if(instanta == null){
            instanta = new AplicatieMobila("Whatsapp",20);
        }
        return instanta;
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return this.nume;
    }

    public float getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(float dimensiune) {
        this.dimensiune = dimensiune;
    }
}
