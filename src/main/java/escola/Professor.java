
package escola;

import java.util.ArrayList;

/**
 *
 * @author matheussantos
 */
public class Professor extends Pessoa {
    String formacaoAcademica;
    double salario;
    
    ArrayList<Disciplina> disciplinas;
    ArrayList<Turma> turmas;
    
    
    void aplicarAvaliacao(){
    
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
