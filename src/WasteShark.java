public class WasteShark extends SwimRobot {
    private int capacity;

    WasteShark(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    @Override
    public void action() {
        info();
        System.out.println("Убираю морское дно. Грузоподъемность " + capacity + " кг. мусора");
    }
}
