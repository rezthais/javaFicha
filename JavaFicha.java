
package myjavaproject.javaficha;

/**
 *
 * @author devre
 */
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

//Superclasse 
public class JavaFicha {

    public static void main(String[] args) {
        //Inserindo os atributos genéricos
        Scanner leitura = new Scanner(System.in);
        String nome;
        String matricula;
        String corOlhos;
        String corPele;
        String tipoCabelo;
        int idade;
        float altura;
        float peso;
        char sexo;
 
        try{
            System.out.print("Digite seu nome: ");
            nome = leitura.nextLine();
 
            System.out.println("Digite sua matricula: ");
            matricula = leitura.nextLine();
            
            System.out.println("Digite a cor dos seus olhos: ");
            corOlhos = leitura.nextLine();
            
            System.out.println("Digite a cor da sua pele: ");
            corPele = leitura.nextLine();
            
            System.out.println("Digite o tipo do seu cabelo: ");
            tipoCabelo = leitura.nextLine();
 
            System.out.print("Digite sua idade: ");
            idade = leitura.nextInt();
 
            System.out.print("Digite sua altura - separe com virgula: ");
            altura = leitura.nextFloat();
 
            System.out.print("Digite seu peso - separe com virgula: ");
            peso = leitura.nextFloat();
 
            System.out.print("Digite seu sexo - m ou f: ");  
            sexo = (char) System.in.read();
 
 
            Funcionario funcionario = new Funcionario(nome, corOlhos, corPele, tipoCabelo, idade, altura, peso, sexo, matricula); 
            
            Pessoa pessoa = funcionario;
 
            pessoa.imprimirDados();
            
            //POLIMORFISMO - Diferentes formas para o método. Imprimir os dados da Classe Funcionário sobrescreve a Classe Pessoa.
 
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}

