abstract public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
        System.out.println("Создан робот " + name);
    }

    public void info() {
        System.out.print(name);
    }

    public abstract void action();
}
