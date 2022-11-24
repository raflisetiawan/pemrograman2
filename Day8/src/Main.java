public class Main {
    public static void main(String[] args) {
        Mahasiswa arsy = new Mahasiswa("Arsy", new ProgramStudi("Informatika"));
        Dosen doni = new Dosen("doni");

        sapa(arsy);
        sapa(doni);
        Mahasiswa.hai = "Hai woi";
        Mahasiswa.sayHai();

}

    public static void  sapa(User user){
        System.out.print("Halo " + user.getNama() + " Selamat datang di GAPURA UISI");
        if(user instanceof Mahasiswa mahasiswa){
            System.out.println("dari Prodi " + mahasiswa.getProgramStudi().getNama());
            mahasiswa.getDosenWali();
        }else if(user instanceof Dosen ){
            Dosen dosen = (Dosen) user;
            dosen.getProgramStudi();
        }
    }
}