
package myjavaproject.javaficha;

/**
 *
 * @author devre
 */

//Criando a Classe Pessoa que herda características da Superclasse.
//Criada com sobrescrita, pois consegue especializar o método herdado da Superclasse.
public class Pessoa {
    //Inserindo encapsulamento
    private String nome;        // >=3 E <=30
    private String corOlhos;    // >=3 E <=10
    private String corPele;     // >=4 E <=10
    private String tipoCabelo;  // >=3 E <=10
    private int idade;          // >0 E <100
    private float altura;       // >0
    private float peso;         // >0
    private char sexo;          // 'm' OU 'f'
    
    //Subclasse com relação a JavaFicha
    //Superclasse com relacão a Classe Funcionário
    public Pessoa(String nome, String corOlhos, String corPele, String tipoCabelo, int idade, float altura, float peso, char sexo){
        //Inserindo atributos genéricos e específicos
        setNome(nome);
        setCorOlhos(corOlhos);
        setCorPele(corPele);
        setTipoCabelo(tipoCabelo);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setSexo(sexo);
    }
    
    public Pessoa(){
 
    }
    //métodos set e get para encapsular os atributos criados em JavaFicha
    public void setNome(String nome){
        if( (nome.length() < 3) || (nome.length() > 30) )
            throw new IllegalArgumentException("Nome invalido. Minimo 3 caracteres, maximo 30 caracteres.");
        else
            this.nome = nome;
    }
    public void setCorOlhos(String corOlhos){
        if( (corOlhos.length() < 3) || (corOlhos.length() > 10) )
            throw new IllegalArgumentException("Nome invalido. Minimo 3 caracteres, maximo 30 caracteres.");
        else
            this.corOlhos = corOlhos;
    }
    public void setCorPele(String corPele){
        if( (corPele.length() < 4) || (corPele.length() > 10) )
            throw new IllegalArgumentException("Nome invalido. Minimo 3 caracteres, maximo 30 caracteres.");
        else
            this.corPele = corPele;
    }
    public void setTipoCabelo(String tipoCabelo){
        if( (tipoCabelo.length() < 3) || (tipoCabelo.length() > 10) )
            throw new IllegalArgumentException("Nome invalido. Minimo 3 caracteres, maximo 30 caracteres.");
        else
            this.tipoCabelo = tipoCabelo;
    }
    public void setIdade(int idade){
        if( (idade <= 0) || (idade >= 100))
            throw new IllegalArgumentException("Idade invalida. Minimo 1, maximo 99");
        else
            this.idade = idade;
    }
    public void setAltura(float altura){
        if( altura <= 0 )
            throw new IllegalArgumentException("Altura invalida. Altura deve ser maior do que 0");
        else
            this.altura = altura;
    }
    public void setPeso(float peso){
        if( peso <= 0 )
            throw new IllegalArgumentException("Peso invalido. Pesoa deve ser maior do que 0");
        else
            this.peso = peso;
    }
    public void setSexo(char sexo){
        if( (sexo != 'm') && (sexo != 'f') )
            throw new IllegalArgumentException("Sexo invalido. 'm' OU 'f' ");
        else
            this.sexo = sexo;
    }
    //Uso da estrutura condicional if, else que alimenta o objetivo do programa
    public String getNome(){
        return this.nome;
    }
    public String getCorOlhos(){
        return this.corOlhos;
    }
    public String getCorPele(){
        return this.corPele;
    }
    public String getTipoCabelo(){
        return this.tipoCabelo;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public char getSexo(){
        return this.sexo;
    }
 
    public void imprimirDados(){
        System.out.println("Imprimir Dados - PESSOA: ");
        System.out.println("Nome: " + nome);
        System.out.println("Cor dos Olhos: " + corOlhos);
        System.out.println("Cor da Pele: " + corPele);
        System.out.println("Tipo Cabelo: " + tipoCabelo);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
}