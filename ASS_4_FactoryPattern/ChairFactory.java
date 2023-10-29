package ASS_4_FactoryPattern;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}