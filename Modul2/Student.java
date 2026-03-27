public class Student {
    private String nama;
    private int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    public void ubahNama (String nama) {
        this.setNama(nama);
    }

    public static void setNama(Student std, String nama) {
        std.setNama(nama);
    }

    public int getSkor() {
        return this.skor;
    }
}
