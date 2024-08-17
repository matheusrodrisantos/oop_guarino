
package escola;

import java.util.ArrayList;

/**
 *
 * @author matheussantos
 */
public class Turma  {
    
    String sigla;
    int ano;
    
    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;
    ArrayList<Disciplina> disciplinas;
            
            
    void adicionarAluno(){
    
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
