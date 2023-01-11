public class Prova {
    String materia;
    String universidade;
    String semestre;
    String professor;
    boolean realizada = false;

    public void criarProva(String materia, String universidade, String semestre, String professor) {
        this.materia = materia;
        this.universidade = universidade;
        this.semestre = semestre;
        this.professor = professor;
    }

    public void completarProva() {
        this.realizada = true;
    }

}
