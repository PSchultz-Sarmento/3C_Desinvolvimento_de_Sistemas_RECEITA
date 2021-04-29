public class Ingrediente { //CLASSE ABSTRATA DOS INGREDIENTES
    //atributos
    private String nome;
    private double qtde;
    private String um;

    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    @Override
    public String toString() { //PRINTA A O NOME, QUANTIDADE E UNIDADE DO INGREDIENTE
        return "\n\nIngrediente: " + "\nnome: " + nome + "\nqtde: " + qtde + "\num: " + um;
    }
}
