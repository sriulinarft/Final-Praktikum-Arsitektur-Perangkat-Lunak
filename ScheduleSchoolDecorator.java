public class ScheduleSchoolDecorator extends ScheduleDecorator{ //kelas yang mengekstend kelas ScheduleDecorator
    
    
    public ScheduleSchoolDecorator (Schedule decoratorSchool){ //method konstraktor yang memiliki parameter yang bertipe data schedule
        super(decoratorSchool);
    }

    @Override 
    public void addSchedule(){ //mengoverride method dari kelas ScheduleDecorator
        decoratorSchool.addSchedule();
        setSchoolSchedule(decoratorSchool);
    }

    private void setSchoolSchedule (Schedule decoratorSchool){ //method set untuk mengupdate data
        System.out.println("Tanggal    : 5 Januari 2022-20 Januari 2022 \n"); //print hasil
    }
}