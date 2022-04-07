public class Main {

    public static void main(String[] args) {
        //aqui em baixo foi declarada uma variável de
        //  referência chamada animal, do tipo Animais e atribuído a ela um objeto do tipo Animais.

        //Quando utilizamos o comando new Animais(),
        // “mandamos” construir este objeto e atribui-lo à variável de referência.

        Animais animal = new Animais();
        animal.quantidaderabo();
        animal.quantidadepatas();


        Caninos caninos = new Caninos();
        caninos.quantidadepatas();
        caninos.quantidaderabo();
        caninos.latir();
        caninos.mamifero();


        Cachorro cachorro = new Cachorro();
        cachorro.quantidadepatas();
        cachorro.quantidaderabo();
        cachorro.latir();
        cachorro.mamifero();

        Lobo lobo = new Lobo();
        lobo.quantidadepatas();
        lobo.quantidaderabo();
        lobo.latir();
        lobo.mamifero();



        CaoGenerico novo = new CaoGenerico();



        Felinos felinos = new Felinos();
        felinos.quantidadepatas();
        felinos.quantidaderabo();
        felinos.meusom();

        Gatos gato = new Gatos();
        gato.quantidadepatas();
        gato.quantidaderabo();
        gato.meusom();

        Gatosempata gatosempata = new Gatosempata(3);
        gatosempata.quantidadepatas();
        gatosempata.quantidaderabo();
        gatosempata.meusom();



    }
}

