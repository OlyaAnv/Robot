public class Drone extends FlyRobot {
    private boolean isOn = false;
    private float flightAltitude;
    private boolean isLand;
    Remote remote = new Remote();

    public Drone(String name) {
        super(name);
    }

    @Override
    public void action() {
    }

    public void moveUp(float flightAltitude) {
        this.flightAltitude = flightAltitude;
        System.out.println("Дрон взлетает");
        isLand = false;
    }

    public void moveDown(float flightAltitude) {
        this.flightAltitude = flightAltitude;
        System.out.println("Дрон садится");
        //снимаем показание датчика
        isLand = true;
    }

    class Remote {
        void on() {
            isOn = true;
            System.out.print("Дрон ");
            info();
            System.out.print(" включен"  + "\n");
        }

        void off() {
            if(isLand) {
                System.out.print("Дрон ");
                info();
                System.out.print(" выключен" + "\n");
                isOn = false;
            }

            else
                System.out.println("Сначала нужно приземлиться");
        }

        void fly() {
            moveUp(flightAltitude);
        }

        void land() {
            moveDown(0);
        }

        void setflyAltitude(float flightAltitude) {
            Drone.this.flightAltitude = flightAltitude;
            System.out.println("Установлена высота " + flightAltitude + " м.");
        }
    }
}