package aula_05_11_2026.atividade;

public class PrincipalLivro {

	public static void main(String[] args) {
		Autor autor = new Autor("Rogerio Ceni");
		Livro livro = new Livro("'Como quebrar coco no murro.''", autor);
		
		System.out.println(autor.getNome() + " foi autor do ilustrissimo livro " + livro.getTitulo());
	}

}
