	package br.com.alura.sticker.application;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

	public static void main(String[] args) throws Exception {

<<<<<<< HEAD
=======
        //Essa api tem a função de buscar imagens e transforma-las em figurinhas
        
>>>>>>> master
        // fazer uma conex�o HTTP e buscar os top 250 filmes mais legais

        // String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";
         String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
         ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

        // String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

		//String url = "https://alura-api-conteudo.herokuapp.com/linguagens";
		//ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();
		
        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        // exibir e manipular os dados para gerar figurinhas muito legais
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 1; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
            String nomeArquivo = "saida/" + conteudo.titulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.titulo());
            System.out.println();
        }
    }
}