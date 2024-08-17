/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopguarino;

import escola.Disciplina;

/**
 *
 * @author matheussantos
 */
public class OopGuarino {

    public static void main(String[] args) {
        
        Disciplina disciplina1 = new Disciplina();
        
        disciplina1.setNome("Artes");
        disciplina1.setCargaHorario(10);
        
        System.out.println("Nome:"+disciplina1.getNome());
        System.out.println("Carga hoaraia:"+disciplina1.getCargaHorario());
        
    }
}
