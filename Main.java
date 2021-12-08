public class Main 
{
    public static void main(String[] args) 
    {
        StudentOne s1 = new StudentOne(); //membuat object baru untuk studnetone
        StudentTwo s2 = new StudentTwo(); //membuat object baru untuk studnettwo
         
        Admin p = new Admin();
         
        p.attach(s1); //menyimpan pembaruan dari studentone
        p.attach(s2); //menyimpan pembaruan dari studenttwo
        p.notifyUpdate(new Message("Ujian Akhir Semester akan di adakan Awal Januari"));   //s1 and s2 akan menerima pembaruan
        
    }
}
