import java.time.LocalTime;
import java.util.Scanner;

interface Alarm {
    void setAlarm(String time);
    void showAlarm();
}

abstract class Weekday implements Alarm {
    //Walang laman
}

class Monday extends Weekday {
    private String alarmTime;

    @Override
    public void setAlarm(String time) {
        alarmTime = time;
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(alarmTime);
        LocalTime now = LocalTime.now();

        if (alarm.isAfter(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else {
            System.out.println("I'll wake you up later!");
        }
    }
}

public class Monday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the alarm time (HH:mm): ");
        String alarmTime = scanner.nextLine();

        Monday monday = new Monday();
        monday.setAlarm(alarmTime);
        monday.showAlarm();
    }
}
