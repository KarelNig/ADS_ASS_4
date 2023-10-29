package ASS_4_FactoryPattern;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
