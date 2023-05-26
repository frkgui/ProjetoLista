import java.util.ArrayList;

public class FilaDeAtendimento {
    private ArrayList<Pessoa> fila;

    public FilaDeAtendimento(ArrayList<Pessoa> fila) {
        this.fila = fila;
    }

    public ArrayList<Pessoa> getFila() {
        return fila;
    }

    public void setFila(ArrayList<Pessoa> fila) {
        this.fila = fila;
    }

    public void addPessoa(Pessoa p){
        this.fila.add(p);
    }

    public int getQntdPessoas(){
        return this.fila.size();
    }

    public Pessoa atenderPessoa(){
        Pessoa p1 = this.fila.get(0);
        this.fila.remove(0);
        return p1;
    }

    public void apagarTodos(){
        this.fila.clear();
    }

    public Pessoa searchByCpf(String cpf){
        for()
    }
}
