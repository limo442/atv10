/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alunocmc
 */
public class Pokedex {

    /**
     * @author rafhael banuls lopes - 11211101240@alunos.umc.br / gabriel
     * paulosi de freitas - 11211102827@alunos.umc.br
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eevee e = new eevee();
        jolteon j = new jolteon();
        umbreon u = new umbreon();
        vaporeon v = new vaporeon();
        flareon f = new flareon();
        espeon es = new espeon();
        leafeon l = new leafeon();
        glaceon g = new glaceon ();
        sylveon s = new sylveon();
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = j;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = u;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = v;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = u;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = es;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = l;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
        //Aponta pokemon
        e = g;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
        
         //Aponta pokemon
        e = s;
        
        System.out.println("ataque: " + e.ataque());
        System.out.println("especial: " + e.especial());
        System.out.println("defesa: " + e.defesa());
        System.out.println("-----------------------");
    }
    
}
