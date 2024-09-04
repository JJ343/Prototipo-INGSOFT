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
import login.Main.Usuario;

public class BaseDeDatos {
    // Lista global de usuarios
    public static List<Usuario> usuarios = new ArrayList<>();

    // Método para agregar un usuario (opcional)
    public static void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public static void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios en la lista.");
        } else {
            System.out.println("Lista de usuarios:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

   
}
