public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double jarak;

    public void setWaktu(double waktu){
        rubahSecon(waktu);
    }

    private void rubahSecon(double waktu){
        this.waktu = waktu * 3600;
    }

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = (int)rubahKecepatan(i);
    }

    private double rubahKecepatan (int kecepatan){
        double rubahKecepatan = (double)kecepatan;
        return rubahKecepatan = (rubahKecepatan*10)/36;
    }

    public void hitungJarak(){
        jarak = kecepatan * waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek" + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan" + kecepatan);
        System.out.println("Jarak yang ditempuh : " + (int)jarak/1000);
    }
}