import java.util.Scanner;

public class aula10_desafio {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nome, sobrenome;
        int idade = 0;
        boolean isValida = true;

        titulo();
        menuCadastro();

        do {
            System.out.println("Informe a idade: ");
            idade = scan.nextInt();
            if (isIdade(idade) == true) {
                int idadeFinal = idade;
                break;
            } else {
                System.out.printf("Erro, idade tem que ser maior 0 !!!\n");
            }
            ;
        } while (isValida);
    }


    static void titulo() {
        System.out.println("###### Calculator ######\n");
    }

    static void menuCadastro() {
        System.out.printf("Cadastro das devs Alessandra e Raissa\n");
        System.out.printf("\t 1 -Cadastrar Dev\n");
        System.out.printf("\t 2 -Cadastrar linguagem\n");
        System.out.printf("\t 0 -Sair\n");
    }
    static void menuLinguagem() {
        System.out.printf("Escolha uma das aplicações:\n");
        System.out.printf("\t 1 -Front-end\n");
        System.out.printf("\t 2 -Back-end\n");
        System.out.printf("\t 3 -Mobile\n");
    }
    static String ler_texto(String mensagem) {
        String texto = scan.nextLine();
        return texto;
    }
    static int ler_numero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        return numero;
    }
    static void escolha_menu() {
        String nome, sobrenome, senioridade, linguagem, descricao;
        int idade, opcao;
        int op = ler_numero("Digite uma opção do menu:");
        switch (op) {
            case 1: // cadastrar dev
                nome= ler_texto("Digite seu nome: ");
                sobrenome = ler_texto("Digite seu sobrenome: ");
                senioridade = ler_texto("Digite sua senioridade: ");
                idade = ler_numero("Digite sua idade: ");
                System.out.printf("Olá, seu nome é %s %s, sua senioridade é %s, e sua idade %d anos", nome, sobrenome, senioridade, idade);
                break;
            case 2: // cadastrar linguagem
                linguagem= ler_texto("Digite o nome da linguagem: ");
                descricao = ler_texto("Digite a descrição da linguagem: ");
                menuLinguagem();
                opcao = ler_numero("Escolha uma opção: ");
                if (opcao == 1){
                    String tipoLinguagem = "Front-end";
            }
                else if (opcao == 2){
                    String tipoLinguagem = "Back-end";
                } else if (opcao == 3){
                    String tipoLinguagem = "Mobile";
            } else {
                    erro();
            }
            break;
        }
    }
    static void erro() {
        System.out.println("Opção inválida, insira uma nova opção entre 1 e 3: ");
    }
    public static boolean isIdade(int value) {
        boolean valido = true;
        if (value <= 0) {
            valido = false;
        }
        return valido;
    }
    public class ValidaNome {
        public static boolean isNome(String value) {
            boolean valido = true;
            if (value.length() < 3) {
                valido = false;
            }
            return valido;
        }
    }
    public class nomeDev {
    }
}

