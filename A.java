import models.Cachorro;
import models.Pessoa;

public class A {
    
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Tob","Branco");
        Cachorro cachorro2 = new Cachorro("Jeferson", "Rosa");
        Cachorro cachorro3 = new Cachorro("Cind", "Cinza");

        Pessoa pessoa = new Pessoa("Adryann", "143-640-619.64", 17);

        pessoa.getCachorros().add(cachorro);
        pessoa.getCachorros().add(cachorro2);
        pessoa.getCachorros().add(cachorro3);

        System.out.println("Teste isEmpty");
        System.out.println(pessoa.getCachorros().isEmpty());
        System.out.println(pessoa.getCachorros().size());

        for(Cachorro c: pessoa.getCachorros()){
            System.out.println(c.getNome());
        }


    }
}
