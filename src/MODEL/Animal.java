package MODEL;

public class Animal {

    public String pelo;
    public String dente;
    public String olhos;



    public Animal(String pelo, String dente, String olhos) {
        this.pelo = pelo;
        this.dente = dente;
        this.olhos = olhos;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getDente() {
        return dente;
    }

    public void setDente(String dente) {
        this.dente = dente;
    }

    public String getOlhos() {
        return olhos;
    }

    public void setOlhos(String olhos) {
        this.olhos = olhos;
    }
}
