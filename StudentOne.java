public class StudentOne implements Observer //class studentOne yang di implemts dengan observer
{
    @Override
    public void update(Message m) { //di override method update dari kelas observer
        System.out.println("StudentOne : " + m.getMessageContent()); //ngeprint hasil 
    }
}
