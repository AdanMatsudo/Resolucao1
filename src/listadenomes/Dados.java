/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadenomes;

import java.util.ArrayList;

/**
 *
 * @author Matsudo
 */
public class Dados {
    
    ArrayList<Nomes> nomes = new ArrayList();
    
    public void cadastraNome(Nomes nome){
        nomes.add(nome);
    }
    public void listaNomes(){
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(" " + nomes.get(i).getNome());
        }
    }

}
