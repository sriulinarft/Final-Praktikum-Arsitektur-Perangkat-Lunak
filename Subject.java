public interface Subject 
{
    public void attach(Observer o); //method untuk menyimpan pembaruan notifikasi
    public void notifyUpdate(Message m); //method untuk update notifikasi dari admin
}