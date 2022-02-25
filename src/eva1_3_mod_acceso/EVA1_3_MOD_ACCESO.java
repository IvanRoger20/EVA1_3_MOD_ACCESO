/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author IvanTron
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();
        per1.setId("012131231");
        per1.setNombre("Jorge");
        per1.setEdad(20);
        System.out.println("Nombre: " + per1.getNombre());
        
        Persona per2 = new Persona();
        per2.setId("912384"); 
        per2.setNombre("Juan");
        per2.setEdad(21);
        System.out.println(per2.getId()+ ", " + per2.getNombre()+ ", " + per2.getEdad());
    }
    
}

class Persona {
    private String id;
    private String nombre;
    private int edad;
    
    public String getId() {   
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setId(String valor) {
        id = valor;
    }
    
    public void setNombre(String valor) {
        nombre = valor;
    }
    
    public void setEdad (int valor) {
        edad = valor;
    }
}
