public class Work {
    Robot[] robots;
    public Work(int number) {

        robots = new Robot[number];
        for (int i = 0; i < robots.length; i++) {
            if (Math.random() > .5) robots[i] = new Drone("Drone ");
            else robots[i] = new WasteShark("Cleaner ", 100);
        }
    }

    public void clean() {
        for(Robot r: robots) {
            if(r instanceof WasteShark)
                r.action();
        }
    }
}
