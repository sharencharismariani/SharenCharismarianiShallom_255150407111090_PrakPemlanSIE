public class Mobil {
private String nopol;
private String warna;
private String merk;
private int kecepatan;
private int jarakTempuh; 

public void setNopol(String n) {
nopol = n;
}

public void setWarna(String s) {
warna = s;
}

public void setMerk(String m) {
merk = m;
}

public void setKecepatan(int k) {
kecepatan = k;
}

public void setJarakTempuh(int j) {
jarakTempuh = j;
}

public void hitungJarak(int waktu) {
jarakTempuh = kecepatan * waktu;
}

public void tampilKecepatanMS() {
    double kecepatanMS = kecepatan / 3.6;
    System.out.println("Kecepatan mobil dalam m/s adalah " + kecepatanMS);
}

public void display() {
System.out.println("Mobil bermerk " + merk);
System.out.println("bernomor polisi " + nopol);
System.out.println("serta memililki warna " + warna);
System.out.println("dan telah menempuh jarak " + jarakTempuh + " km");
System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
    }
} 