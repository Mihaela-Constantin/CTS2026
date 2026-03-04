package main;

import classes.AplicatieMobila;
import classes.AplicatieMobila2;

public class MainAplicatieMobila {
    public static void main(String[] args) {
        AplicatieMobila ap1 = AplicatieMobila.getInstanta();
        AplicatieMobila ap2 = AplicatieMobila.getInstanta();
        ap2.setNume("Telegram");
        System.out.println(ap1.getNume());
        System.out.println(ap1 == ap2);

        AplicatieMobila2 ap3 = AplicatieMobila2.getInstanta();
        AplicatieMobila2 ap4 = AplicatieMobila2.getInstanta();
        ap4.setNume("Twitter");
        System.out.println(ap3.getNume());
        System.out.println(ap3 == ap4);
    }
}
