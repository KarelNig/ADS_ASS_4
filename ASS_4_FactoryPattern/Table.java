package ASS_4_FactoryPattern;

public class Table implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a table.");
    }
}