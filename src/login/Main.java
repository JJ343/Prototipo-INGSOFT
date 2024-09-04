/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author JUAN JOSE
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Main {
    
    // Clase interna Usuario
    public static class Usuario {
        private String nombreUsuario;
        private String contraseña;
        private String cargo;

        // Constructor
        public Usuario(String nombreUsuario, String contraseña, String cargo) {
            this.nombreUsuario = nombreUsuario;
            this.contraseña = contraseña;
            this.cargo = cargo;
        }

        // Getters y Setters
        public String getNombreUsuario() {
            return nombreUsuario;
        }

        public void setNombreUsuario(String nombreUsuario) {
            this.nombreUsuario = nombreUsuario;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    }

    public static void ShowPanel (JPanel p, JPanel LOG, int x, int y){
        
        p.setSize(x,y);
       
                     
        LOG.removeAll();
        LOG.revalidate();
        LOG.repaint();
        LOG.add(p);
        LOG.repaint();
    
    }
    
}
