//import java.util.Scanner;
//
//public class aula10_desafio {
//    static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String nome, sobrenome;
//        int idade = 0;
//        boolean isValida = true;
//
//        titulo();
//        menuCadastro();
//
//        do {
//            System.out.println("Informe a idade: ");
//            idade = scan.nextInt();
//            if (isIdade(idade) == true) {
//                int idadeFinal = idade;
//                break;
//            } else {
//                System.out.printf("Erro, idade tem que ser maior 0 !!!\n");
//            }
//            ;
//        } while (isValida);
//
//        do {
//            System.out.print("Nome do dev: ");
//            nome = scan.nextLine();
//            if (ValidaNome.isNome(nome) == true){
//                do {
//                    System.out.print("Nome do dev: ");
//                    nome = scan.nextLine();
//                    if (ValidaNome.isNome(nome) == true){
//                        String nomeDev = nome;
//                        break;
//                    } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");
//                    }
//                }while (isValida);
//                do {
//                    System.out.print("Informe sobrenome: ");
//                    sobrenome = scan.nextLine();
//                    if (ValidaNome.isNome(sobrenome) == true){
//                        String sobrenomeDev = sobrenome;
//                        break;
//                    } else{ System.out.printf("Erro, sobrenome deve conter no mínimo 3 caracteres !!!\n");
//                    }
//                }while (isValida);
//                break;
//            } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");};
//        }while (isValida);
//        do {
//            System.out.print("Informe sobrenome: ");
//            sobrenome = scan.nextLine();
//            if (ValidaNome.isNome(sobrenome) == true){
//                dev.setNomeDev(sobrenome);
//                break;
//            } else{ System.out.printf("Erro, sobrenome deve conter no mínimo 3 caracteres !!!\n");};
//        }while (isValida);
//    }
//
//
//    static void titulo() {
//        System.out.println("###### Calculator ######\n");
//    }
//
//    static void menuCadastro() {
//        System.out.printf("Cadastro das devs Alessandra e Raissa\n");
//        System.out.printf("\t 1 -Cadastrar Dev\n");
//        System.out.printf("\t 2 -Cadastrar linguagem\n");
//        System.out.printf("\t 0 -Sair\n");
//        System.out.println("Escolha uma Opção: \n");
//    }
//
//    static void menuLinguagem() {
//        System.out.printf("Escolha uma das aplicações:\n");
//        System.out.printf("\t 1 -Front-end\n");
//        System.out.printf("\t 2 -Back-end\n");
//        System.out.printf("\t 3 -Mobile\n");
//        System.out.println("Escolha uma Opção: \n");
//    }
//    static String ler_texto(String mensagem) {
//        String texto = scan.nextLine();
//        return texto;
//    }
//    static int ler_numero(String mensagem) {
//        System.out.print(mensagem);
//        int numero = Integer.parseInt(scan.nextLine());
//        return numero;
//    }
//    public static boolean isIdade(int value) {
//        boolean valido = true;
//        if (value <= 0) {
//            valido = false;
//        }
//        return valido;
//    }
//    public class ValidaNome {
//        public static boolean isNome(String value) {
//            boolean valido = true;
//            if (value.length() < 3) {
//                valido = false;
//            }
//            return valido;
//        }
//    }
//}