public class Box implements Runnable {
   volatile  boolean turnOn;


    public void turnOnToggle() {

            System.out.println("Тумблер включен");
            turnOn = true;


    }

    public void turnOffToggle() {
        while (turnOn) {
            System.out.println("Тумблер выключен");
            turnOn = false;
        }

    }

    @Override
    public void run() {

    }
}
