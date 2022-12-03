
package myjavaproject.javaficha;

/**
 *
 * @author devre
 */

//Criando a Classe-tema Funcionario que herda características das Superclasses.
//Criada com sobrescrita, pois consegue especializar os métodos herdados das superclasses.
//Essa classe possui o polimorfismo, pois tem a capacidade de realizar as mesmas tarefas das outras classes.
public class Funcionario extends Pessoa{
    //Inserindo os atributos específicos
    //Inserindo encapsulamento
    private String matricula;
    
    public Funcionario(String nome, String corOlhos, String corPele, String tipoCabelo, int idade, float altura, float peso, char sexo, String matricula ){
       super(nome, corOlhos, corPele, tipoCabelo, idade, altura, peso, sexo);
       setMatricula(matricula);
    }
    //métodos set e get para encapsular os atributos criados em Pessoa   
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
 
    public String getMatricula(){
        return this.matricula;
    }
 
    @Override
    //Diferentes formas para o método. Aqui é um polimorfismo, pois está sobrescrevendo o método imprimir dados, no @Override    
    public void imprimirDados(){
        System.out.println("Imprimir Dados - ALUNO: ");
        System.out.println("Nome: " + getNome() );
        System.out.println("Cor dos Olhos: " + getCorOlhos() );
        System.out.println("Cor da Pele: " + getCorPele() );
        System.out.println("Tipo Cabelo: " + getTipoCabelo() );
        System.out.println("Idade: " + getIdade() );
        System.out.println("Peso: " + getPeso() );
        System.out.println("Altura: " + getAltura() );
        System.out.println("Sexo: " + getSexo() );
        System.out.println("Matricula: " + getMatricula() );
    }   
    
}
    
