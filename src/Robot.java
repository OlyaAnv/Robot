public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
        info();

    }

    public void info() {
        System.out.println("Создан робот " + name);

    }

    public void action() {
    }
}
