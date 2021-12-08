import java.util.ArrayList; //import array list, karna kita akan menggunakan array list untuk mengubah data
import java.util.List;
 
public class Admin implements Subject { 
     
    private List<Observer> observers = new ArrayList<>(); //arraylist yang bertipe data private untuk menyimpan data.
 
    @Override
    public void attach(Observer o) { //method untuk menyimpan pembaruan notifikasi yang diambil dari method di kelas Subject
        observers.add(o);
    }
 
    @Override
    public void notifyUpdate(Message m) { //method untuk update notifikasi dari admin yang diambil dari method di kelas Subject
        for(Observer o: observers) {
            o.update(m);

            Schedule schedule = new ScheduleSchoolDecorator(new NoSchedule()); //membuat object baru schedule
            schedule.addSchedule();
        }
    }
}