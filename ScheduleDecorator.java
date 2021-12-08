public abstract class ScheduleDecorator implements Schedule{ //merupakan abstrack kelas dari kelas Schedule
    protected Schedule decoratorSchool; //variable

    public ScheduleDecorator(Schedule decoratorSchool){ //method konstraktor yang memiliki parameter yang bertipe data Schedule
        this.decoratorSchool = decoratorSchool;
    }
}
