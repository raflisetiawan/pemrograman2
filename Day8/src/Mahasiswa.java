public class Mahasiswa extends User {
    protected String nim;
    protected ProgramStudi programStudi;
    protected static String hai;
    Dosen dosenWali;

    public Mahasiswa(String nama, ProgramStudi programStudi) {
        this.nama = nama;
        this.programStudi = programStudi;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public static void sayHai(){
        System.out.println(hai);
    }
}
