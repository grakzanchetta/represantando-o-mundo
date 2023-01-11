import java.util.Date;

public class Usuario {
    int idade;
    String name;
    private String email;
    private String senha;
    boolean logado;
    Date ultimoAcesso;
    Prova provaFeita = new Prova();

    public void logarUsuario() {
        this.logado = true;
        this.ultimoAcesso = new Date();
    }

    public void deslogarUsuario() {
        this.logado = false;
    }

    public void criarUsuario(String email, String senha, int idade, String name) {
        this.idade = idade;
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }
}
