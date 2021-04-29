import java.util.ArrayList;
import java.util.List;

public class Receita {
    //atributos
    private String nome;
    private String descricao;
    private List<Ingrediente> ingredientes;

    public Receita(){
        ingredientes = new ArrayList<>(); //DEFINE QUE OS INGREDIENTES FICARAM ARMAZENADOS NO ARRAY
    }

    //getters e setters QUE SERÃO ARMAZENADOS NO ARRAY
    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public void setIngrediente(String nome, double qtde, String um){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(nome); 
        ingrediente.setQtde(qtde); //QUANTIDADE
        ingrediente.setUm(um); // QUAL UNIDADE DE MEDIDA, SENDO GRAMAS, UNIDADES, XICARAS E ETC
        ingredientes.add(ingrediente);
    }

    public void setIngredientes(Ingrediente ingrediente){
        this.ingredientes = ingredientes;

    }

    //GETS E SETS
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Receita: \n" + "nome: " + nome + "\ndescricao: " + descricao + "\ningredientes: " + ingredientes + "\n";
    }
}