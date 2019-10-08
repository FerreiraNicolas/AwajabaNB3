/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awa.awajaba.métier;

import java.time.LocalDate;

/**
 *
 * @author etudiant
 */


class Repas{
	
	private int numero;
	private LocalDate date;
	
        
        Repas(int numero, LocalDate date){
		this.numero= numero;
		this.date= date;
	}

        public int getNumero(){
		return this.numero;
	}
	public void setNumero(int num){
		this.numero=num;
	}
    
}
