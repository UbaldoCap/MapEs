public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("mert", "asas", "nmn", 2003);
        Studente studente2 = new Studente("meit", "axxs", "rin", 2008);
        Studente studente3 = new Studente("mdft", "msjs", "egin", 2002);
        Studente studente4 = new Studente("mkjt", "zzxc", "klj", 2005);
        System.out.println(studente1.eta());
        Registro registro = new Registro();
        registro.addStudente(studente1);
        registro.removeStudente(studente1.getMatricola());
        registro.addStudente(studente2);
        registro.addStudente(studente3);
        registro.addStudente(studente4);
        registro.stampaStudenti();
        System.out.println(registro.cercaStudenteMatricola(studente2.getMatricola()));
        System.out.println(registro.numeroStudenti());
        System.out.println(registro.etaMedia());
        registro.ordinaStampaStudentiEta();
    }
}
