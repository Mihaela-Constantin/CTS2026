package aplicatiemobila_lazy;

import aplicatiemobila_eager.AplicatieMobila;

public class MainAplicatieMobila {
    public static void main(String[] args) {
        AplicatieMobila ap1 = AplicatieMobila.getInstanta();
        AplicatieMobila ap2 = AplicatieMobila.getInstanta();
        ap2.setNume("Telegram");
        System.out.println(ap1.getNume());
        System.out.println(ap1 == ap2);
    }
}
