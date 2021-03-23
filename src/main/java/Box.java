public class Box implements Runnable {

    volatile boolean turnOn;
    boolean isInterrupt;


    public boolean isInterrupt() {
        return isInterrupt;
    }

    public void setInterrupt(boolean interrupt) {
        isInterrupt = interrupt;
    }

    public void turnOnToggle() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Тумблер включен");
            turnOn = true;
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void turnOffToggle() {
        while (!isInterrupt) {
            if (turnOn) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Тумблер выключен");
                turnOn = false;
            }
        }
    }

    @Override
    public void run() {

    }
}
