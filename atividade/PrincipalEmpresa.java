package aula_05_11_2026.atividade;

public class PrincipalEmpresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Escrita Fiscal");
		Empresa empresa = new Empresa("Cofesa", departamento);
		
		System.out.println("Trabalha no: " + empresa.getNome() + "\nAtuando no setor de: " + departamento.getNome());
	}

}
