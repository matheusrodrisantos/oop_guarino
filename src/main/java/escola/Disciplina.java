
package escola;

import java.util.ArrayList;

/**
 *
 * @author matheussantos
 */
public class Disciplina {
    private String nome;
    private int cargaHorario;
    
    ArrayList<Professor> professores;
    ArrayList<Turma> turmas;
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        if(cargaHorario>=0)
            this.cargaHorario = cargaHorario;
    }        
}
