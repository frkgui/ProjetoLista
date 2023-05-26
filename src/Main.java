import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Sistema de Atendimento ---");
        System.out.println("""
                Serviços disponíveis:
                \n
                (1) - Adicionar um cliente na fila
                (2) - Ver cliente da fila
                (3) - Ver quantidade de clientes que estão na fila
                (4) - Atender um cliente
                (5) - Pesquisar um cliente pelo CPF
                (6) - Pesquisar clientes pelo interesse
                (7) - Retirar todos os clientes da fila
                (0) - Sair
                """);
        System.out.print("Digite a opção desejada: ");
        int selectedOption = input.nextInt();
        input.nextLine();

        switch (selectedOption){
            case 0:
                System.exit(0);
                break;
            case 1:
                Pessoa p = new Pessoa();
                System.out.print("Digite o nome do cliente: ");
                p.setNome(input.nextLine());

        }


        input.close();
    }

}
