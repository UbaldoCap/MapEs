import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Registro {
    HashMap<String, Studente> studenteHashMap;

    public Registro() {
        this.studenteHashMap = new HashMap<>();
    }

    public void addStudente(Studente studente) {
        studenteHashMap.put(studente.getMatricola(), studente);
    }

    public void removeStudente(String matricola) {
        studenteHashMap.remove(matricola);
        System.out.println("Studente rimosso");
    }

    public void stampaStudenti() {
        Integer i = 0;
        System.out.println("Elenco Studenti");
        for (Map.Entry<String, Studente> entry : studenteHashMap.entrySet()) {
            i++;
            System.out.print(i);
            System.out.print(" Matricola: " + entry.getKey());
            entry.getValue().stampaDettagli();
        }
    }

    public Studente cercaStudenteMatricola(String matricola) {
        return studenteHashMap.get(matricola);
    }

    public Integer numeroStudenti() {
        return studenteHashMap.size();
    }

    public Integer etaMedia() {
        Integer etatotale = 0;
        for (Map.Entry<String, Studente> entry : studenteHashMap.entrySet()) {
            etatotale+=entry.getValue().eta();
        }
        return etatotale/studenteHashMap.size();
    }

    public void ordinaStampaStudentiEta() {
        ArrayList<Studente> arrayList = new ArrayList<>(studenteHashMap.values());
        arrayList.sort(Comparator.comparing(Studente::getAnnoNascita));
        for (Studente studente : arrayList) {
            studente.stampaDettagli();
        }
    }
}
