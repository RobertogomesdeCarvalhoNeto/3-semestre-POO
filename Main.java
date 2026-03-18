import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nome:");
        String nome=sc.nextLine();
        System.out.print("Idade:");
        

         class Pessoa{
            String nome;
            int idade;
        }
       
        Pessoa p1=new Pessoa();{
            p1.nome="Roberto";
            p1.idade=20;
        }
            System.out.println("Nome: "+p1.nome+"\n"+"Idade: "+p1.idade);
            sc.close();
        
    }
}
