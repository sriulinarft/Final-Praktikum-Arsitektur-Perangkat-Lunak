public class StudentTwo implements Observer //class studentTwo yang di implemts dengan observer
{
    @Override
    public void update(Message m) { //di override method update dari kelas observer
        System.out.println("StudentTwo : " + m.getMessageContent()); //ngeprint hasil 
    }
}
