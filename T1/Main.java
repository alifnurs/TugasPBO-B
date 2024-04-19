class Buku{
    int lembar;
    int perLembar = 4;

    public void setLembar(int lembar){
        this.lembar = lembar;
    }

    public void hitungLama(){
        int hasil = lembar * perLembar;
        System.out.println("Jadi lama ia menghabiskan "+ lembar +" lembar adalah selama " + hasil +" hari");
    }
}


public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setLembar(50);
        buku1.hitungLama();
    }
}
