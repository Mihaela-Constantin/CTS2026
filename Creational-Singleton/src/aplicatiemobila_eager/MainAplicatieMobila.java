package aplicatiemobila_eager;

public class MainAplicatieMobila {
    public static void main(String[] args) {
        AplicatieMobila ap3 = AplicatieMobila.getInstanta();
        AplicatieMobila ap4 = AplicatieMobila.getInstanta();
        ap4.setNume("Twitter");
        System.out.println(ap3.getNume());
        System.out.println(ap3 == ap4);
    }
}
