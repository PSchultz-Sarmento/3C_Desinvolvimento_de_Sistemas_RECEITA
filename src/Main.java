public class Main{

    public static void main(String[] args) {
        Receita receita = new Receita();
        receita.setNome("Bolo bom");
        receita.setDescricao("Ele é muito bom");
        //É POSSIVEL COLOCAR QUANTOS INGREDIENTES FOREM NECESSÁRIOS
        receita.setIngrediente("Farinha", 300, "g");
        receita.setIngrediente("ovo", 3, "un");
        receita.setIngrediente("chocolate", 100, "g");
        receita.setIngrediente("leite", 100, "g");
        System.out.println(receita);

    }
}