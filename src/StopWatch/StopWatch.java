package StopWatch;

public class StopWatch {
    private long startTime = 0, stopTime = 0;
    boolean running = false;

    public StopWatch() {
    }
    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }
    public long getElapsedTime(){
        long elapsed;
        if (running){
            elapsed = (System.nanoTime() - startTime);
        } else {
            elapsed = (stopTime -startTime);
        }
        return elapsed;
    }
}
