public abstract class Usuario {
    protected String email;
    protected String senha;
    
    public Aluno(String email, String senha, String ra, String nome, String curso) {
      super(email, senha);
      this.ra = ra;
      this.nome = nome;
      this.curso = curso;
    }
    
    public abstract void realizarLogin();
}

public class Aluno extends Usuario {
    private String ra;
    private String nome;
    private String curso;
    
    public Aluno(String email, String senha, String ra) {
        super(email, senha);
        this.ra = ra;
    }
    
    @Override
    public void realizarLogin() {
      System.out.println("Login realizado para o aluno " + nome);
    }
    
    public void alterarDados(String novoEmail, String novaSenha, String novoNome, String novoCurso) {
      this.email = novoEmail;
      this.senha = novaSenha;
      this.nome = novoNome;
      this.curso = novoCurso;
    }

    public void consultarDados() {
      System.out.println("RA: " + ra);
      System.out.println("Nome: " + nome);
      System.out.println("Curso: " + curso);
    } 

    public void realizarAvaliacao(Aluno alunoAvaliado, String avaliacao) {
      System.out.println("Avaliação realizada para o aluno " + alunoAvaliado.getNome() + ": " + avaliacao);
    }
    
    public String getNome() {
      return nome;
    }
}

public class Professor extends Usuario {
    private String nome;
    private String disciplina;

    public Professor(String email, String senha, String nome, String disciplina) {
      super(email, senha);
      this.nome = nome;
      this.disciplina = disciplina;
    }
    
    @Override
    public void realizarLogin() {
      System.out.println("Login realizado para o professor " + nome);
    }

    public void alterarDados(String novoEmail, String novaSenha, String novoNome, String novaDisciplina) {
      this.email = novoEmail;
      this.senha = novaSenha;
      this.nome = novoNome;
      this.disciplina = novaDisciplina;
    }

    public void consultarDados() {
      System.out.println("Nome: " + nome);
      System.out.println("Disciplina: " + disciplina);
    }

    public void avaliarAlunos(Aluno aluno, String avaliacao) {
      System.out.println("Aluno " + aluno.getNome() + " avaliado: " + avaliacao);
    }

    public void criarConteudoDidatico(String conteudo) {
      System.out.println("Conteúdo didático criado: " + conteudo);
    }

    public String getNome() {
      return nome;
    }
    
}

public class Fornecedor extends Usuario {
    private String nomeEmpresa;
    private String tipoServico;

    public Fornecedor(String email, String senha, String nomeEmpresa, String tipoServico) {
      super(email, senha);
      this.nomeEmpresa = nomeEmpresa;
      this.tipoServico = tipoServico;
    }

    public static Fornecedor realizarCadastro(String email, String senha, String nomeEmpresa, String tipoServico) {
      return new Fornecedor(email, senha, nomeEmpresa, tipoServico); 
    }
    
    @Override
    public void realizarLogin() {
      System.out.println("Login realizado para o fornecedor " + nomeEmpresa);
    }

    public void alterarDados(String novoEmail, String novaSenha, String novoNomeEmpresa, String novoTipoServico) {
      this.email = novoEmail;
      this.senha = novaSenha;
      this.nomeEmpresa = novoNomeEmpresa;
      this.tipoServico = novoTipoServico;
    }

    public void consultarDados() {
      System.out.println("Nome da Empresa: " + nomeEmpresa);
      System.out.println("Tipo de Serviço: " + tipoServico);
    }

    public void fornecerProdutosServicos(String produtosServicos) {
      System.out.println("Produtos/Serviços fornecidos: " + produtosServicos);
    }

    public String getNomeEmpresa() {
      return nomeEmpresa;
    }
  
}

public class PessoaJuridica extends Usuario {
    private String nomeEmpresa;
    private String cnpj;

    public PessoaJuridica(String email, String senha, String nomeEmpresa, String cnpj) {
        super(email, senha);
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }
    
    @Override
    public void realizarLogin() {
      System.out.println("Login realizado para a pessoa jurídica " + nomeEmpresa);
    }
    
    public void alterarDados(String novoEmail, String novaSenha, String novoNomeEmpresa, String novoCnpj) {
      this.email = novoEmail;
      this.senha = novaSenha;
      this.nomeEmpresa = novoNomeEmpresa;
      this.cnpj = novoCnpj;
    }


    public void consultarDados() {
      System.out.println("Nome da Empresa: " + nomeEmpresa);
      System.out.println("CNPJ: " + cnpj);
    }

    public String getNomeEmpresa() {
      return nomeEmpresa;
    }
}

public class PessoaFisica extends Usuario {
    private String nome;
    private String cpf;

    public PessoaFisica(String email, String senha, String nome, String cpf) {
      super(email, senha);
      this.nome = nome;
      this.cpf = cpf;
    }

    public static PessoaFisica realizarCadastro(String email, String senha, String nome, String cpf) {
      return new PessoaFisica(email, senha, nome, cpf);
    }

    @Override
    public void realizarLogin() {
      System.out.println("Login realizado para a pessoa física " + nome);
    }
    
    public void alterarDados(String novoEmail, String novaSenha, String novoNome, String novoCpf) {
      this.email = novoEmail;
      this.senha = novaSenha;
      this.nome = novoNome;
      this.cpf = novoCpf;
    }

    public void consultarDados() {
      System.out.println("Nome: " + nome);
      System.out.println("CPF: " + cpf);
    }

    public String getNome() {
      return nome;
    }
}

public class Main {
    public static void main(String[] args) {
      Aluno aluno = new Aluno("email@aluno.com", "senha123", "123456789");
      aluno.realizarLogin();
        
      // Realizar outras operações com o aluno, como alterarDados, consultarDados...
    }
}


/*
  realizar login utilizando verificação

  import java.util.HashMap;

  public class Usuario {
    protected String email;
    protected String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public boolean realizarLogin(String emailDigitado, String senhaDigitada) {
        // Simula uma base de dados com os usuários e suas senhas
        HashMap<String, String> usuariosRegistrados = new HashMap<>();
        usuariosRegistrados.put("usuario1@gmail.com", "senha123");
        usuariosRegistrados.put("usuario2@gmail.com", "senha456");

        if (usuariosRegistrados.containsKey(emailDigitado) && usuariosRegistrados.get(emailDigitado).equals(senhaDigitada)) {
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Email ou senha incorretos. Tente novamente.");
            return false;
        }
    } 
}
*/