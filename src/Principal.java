import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Marighella");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(100);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9.2);
        meuFilme.avalia(8.9);
        meuFilme.avalia(8.7);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Big Bang Theory");
        minhaSerie.setAnoDeLancamento(2012);
        minhaSerie.setDuracaoEmMinutos(20);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(11);
        minhaSerie.setMinutosPorEpisodio(30);
        minhaSerie.setEpisodiosPorTemporada(10);
        System.out.println("Tempo para maratonar a série: " + minhaSerie.getDuracaoEmMinutos() + " horas.");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Che, O Argentino");
        outroFilme.setAnoDeLancamento(2008);
        outroFilme.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        calculadora.inclui(outroFilme);
        System.out.println("Tempo total assistido: " + calculadora.getTempoTotal() + " horas.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio primeiroEp = new Episodio();
        primeiroEp.setNumero(1);
        primeiroEp.setSerie(minhaSerie);
        primeiroEp.setTotalVisualizacoes(101);
        filtro.filtra(primeiroEp);

    }
}
