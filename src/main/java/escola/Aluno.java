package escola;

import java.util.Date;

/**
 *
 * @author matheussantos
 */
public class Aluno extends Pessoa{
    
    private Date dataNascimento;
    
    private Turma turma;
    
    void realizarAvaliacao(){    
    }
    
       public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
}
