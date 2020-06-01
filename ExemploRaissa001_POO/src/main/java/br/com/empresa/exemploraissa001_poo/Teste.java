
package br.com.empresa.exemploraissa001_poo;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Iniciando");

        Produto produto;
        produto = new Produto("Pen",30.0f);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());

        Armazenamento armazenamento;
        armazenamento = new Armazenamento();
        armazenamento.setNome("SSD");
        //armazenamento.setPreco(100.00f);
        //armazenamento.setCapacidade(1);
        armazenamento.setUnidade("T");
        System.out.println(armazenamento.getNome());
        System.out.println(armazenamento.getPreco());
        System.out.println(armazenamento.getCapacidade());
        System.out.println(armazenamento.getUnidade());

        Armazenamento armazenamento2;
        armazenamento2 = new Armazenamento();
        armazenamento2 = armazenamento2.capacidade(32);
        System.out.println(armazenamento2.toString());

        Carrinho carrinho;
        carrinho = new Carrinho();

        carrinho.p[0]=produto;
        carrinho.p[1]=armazenamento;
        carrinho.p[2]=armazenamento2;

        System.out.println("----");
        //System.out.println(carrinho.p[0].toString());
        //System.out.println(carrinho.p[1].toString());
        //System.out.println(carrinho.p[2].toString());


        System.out.println(carrinho.p.length);

        //carrinho.remove(1);

        for (int i = 0; i < carrinho.p.length; i++) {
            if(carrinho.p[i]!=null){
                 System.out.println(carrinho.p[i].toString());
            }      
        }
        
        //teste genérico
        System.out.println("----teste genérico");
        CarrinhoGenerico carrinhoGenerico;
        carrinhoGenerico = new CarrinhoGenerico<>(10);
        ProdutoGenerico produtoGenerico;
        
        //carrinho.p[0]=produto;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(produto);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        //carrinhoGenerico.p[1]=armazenamento;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(armazenamento);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        
        //carrinhoGenerico.p[2]=armazenamento2;
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(armazenamento2);  
        carrinhoGenerico.guarda(produtoGenerico);
        

        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        carrinhoGenerico.retira(1);
        
        System.out.println("----teste genérico2");
        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        Mouse mouse;
        mouse = new Mouse("UBS","Preto");
        
        produtoGenerico=new ProdutoGenerico();
        produtoGenerico.add(mouse);  
        carrinhoGenerico.guarda(produtoGenerico);
        
        System.out.println("----teste genérico3");
        for (int i = 0; i < carrinhoGenerico.p.length; i++) {
            if(carrinhoGenerico.p[i]!=null){
                 System.out.println(carrinhoGenerico.p[i].toString());
            }      
        }
        
        
        
        

    }
}