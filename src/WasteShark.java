public class WasteShark extends SwimRobot {
    private int capacity;
    private float depth;

    WasteShark(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void action() {
        info();
        System.out.println("Убираю морское дно. Грузоподъемность " + capacity + " кг. мусора");
    }

    @Override
    public void moveUp(float depth) {
        this.depth = depth;
        System.out.println("Уборщик всплывает");

    }

    @Override
    public void moveDown(float depth) {
        this.depth = depth;
        System.out.println("Уборщик погружается");

    }
}
