public class Pessoa {
    private String nome;
    private String cpf;
    private byte interesse;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public byte getInteresse() {
        return interesse;
    }

    public void setInteresse(byte interesse) {
        this.interesse = interesse;
    }

    @Override
    public String toString() {

        String interesseStr = "";

        switch (interesse){
            case 1: interesseStr = "Pagamento de conta";
            case 2: interesseStr = "Recebimento de salário";
            case 3: interesseStr = "Outros";
        }

        return "\nNome: " + nome +
                ", CPF: " + cpf +
                ", Interesse: " + interesseStr;
    }
}
