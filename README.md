# School Schedule
Sri Ulina Raftaini | 1908107010012

School Schedule merupakan suatu layanan yang ada di suatu sekolah dimana 
admin sekolah memberitahukan jadwal Ujian Akhir Semester
kepada siswa-siswi yang ada di sekolah tersebut. Layanan ini dibuat 
menggunakan 2 Design Pattern yaitu Design ObserverPattern dan DecotarorPattern.

1. Observer Pattern disini digunakan untuk memberi suatu notifikasi kepada siswa-siswi, 
seperti "Ujian Akhir Semester akan di adakan Awal Januari".Observer Pattern di implementasikan pada kelas Admin, Message, Observer,
StudentOne, StudentTwo dan Subject.

2. Decorator Pattern disini digunakan untuk memberi decor yang ada di jadwal sekolah
tersebut, seperti "Tanggal: 5 Januari 2022-20 Januari 2022".Decorator Pattern di Implementasikan di kelas Schedule,
ScheduleDecorator, ScheduleSchoolDecorator dan NoSchedule.

Untuk menjalankan code ini maka run file Main.java.
