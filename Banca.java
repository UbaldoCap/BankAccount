import java.util.Arrays;

public class Banca {
    private  String nomeBanca;
    private int numConti;
    private ContoBancario[] contiBancari;
    private int maxConti;

    public Banca (String nomeBanca, ContoBancario[] contiBancari, int maxConti) {
        this.nomeBanca = nomeBanca;
        numConti = contiBancari.length;
        this.contiBancari = contiBancari;
        this.maxConti = maxConti;
    }

    public void aggiungiConto (ContoBancario contoBancario) {
        numConti = 1;
        for (int index = 0; index < contiBancari.length; index++ ) {
            numConti++;
        }
        if ((numConti - 1) < maxConti) {
            contiBancari = java.util.Arrays.copyOf(contiBancari, contiBancari.length + 1);
            contiBancari[numConti - 1] = contoBancario;
        } else {
            System.out.println("Errore, massimo numero conti raggiunto");
            numConti--;
        }
    }

    public void visualizzaInformazioneConti() {
        for (int index = 0; index < contiBancari.length; index++){
            System.out.println("Conto n " + (index + 1) + ": IBAN = " + contiBancari[index].getIban());
            System.out.println("           Saldo = " + contiBancari[index].getSaldo());
        }
    }

    public void saldoTotale () {
        double sum = 0;
        for (int index = 0; index < contiBancari.length; index++){
            sum += contiBancari[index].getSaldo();
        }
        System.out.println("Saldo Totale = " + sum);
    }

    public String getNomeBanca() {
        return nomeBanca;
    }

    public void setNomeBanca(String nomeBanca) {
        this.nomeBanca = nomeBanca;
    }

    public ContoBancario[] getContiBancari() {
        return contiBancari;
    }

    public void setContiBancari(ContoBancario[] contiBancari) {
        this.contiBancari = contiBancari;
    }

    public int getNumConti() {
        return numConti;
    }

    public void setNumConti(int numConti) {
        this.numConti = numConti;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nomeBanca='" + nomeBanca + '\'' +
                ", numConti=" + numConti +
                ", contiBancari=" + Arrays.toString(contiBancari) +
                ", maxConti=" + maxConti +
                '}';
    }
}
