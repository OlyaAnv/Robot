public class Main {
    public static void main(String[] args) {
        //Work work = new Work(5);
        //work.clean();
        Drone drone = new Drone("Петя");
        Drone.Remote remote = drone.remote;
        remote.on();
        remote.setflyAltitude(2f);
        remote.fly();
        remote.off();
        remote.land();
        remote.off();
    }
}
