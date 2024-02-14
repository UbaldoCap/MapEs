import java.time.LocalDateTime;

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private Integer annoNascita;

    public Studente(String matricola, String nome, String cognome, Integer annoNascita) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(Integer annoNascita) {
        this.annoNascita = annoNascita;
    }

    public Integer eta() {
        Integer annoCorrente = LocalDateTime.now().getYear();
        return annoCorrente - annoNascita;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome + " Cognome: " + cognome + " Anno Nascita: " + annoNascita);
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola='" + matricola + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", annoNascita=" + annoNascita +
                '}';
    }
}
