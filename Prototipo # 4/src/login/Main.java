/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author JUAN JOSE
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Main {
    public static  String rutaArchivo = "usuarios.txt";
    public static  String rutaArchivo1 = "clientes.txt";
    public static String rutaArchivo2 = "pedidos.txt";
    public static String rutaArchivo3 = "inventario.txt";  
   

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
        
        @Override
        public String toString() {
        return nombreUsuario + "," + contraseña + "," + cargo;
        }
    }
    
    public static class Cliente{
        private String Nombre;
        private String Telefono;
        private String Cedula;
        private String Direccion;
        
        public Cliente (String Nombre,String Telefono , String Cedula, String Direccion){
         this.Nombre = Nombre;
         this.Telefono=Telefono;
         this.Cedula = Cedula;
         this.Direccion =Direccion;
        }
         // Getters y Setters
        public String getNombre() {
            return Nombre;
        }

        public void setNombreUsuario(String nombreCliente) {
            this.Nombre = nombreCliente;
        }

        public String getTelefono() {
            return Telefono;
        }

        public void setTelefono(String Telefono) {
            this.Telefono = Telefono;
        }

        public String getCedula() {
            return Cedula;
        }

        public void setCedula(String a) {
            this.Cedula = a;
        }
        
        public String getDireccion() {
            return Cedula;
        }

        public void setDireccion(String a) {
            this.Direccion = a;
        }
       
        
        @Override
        public String toString() {
        return Nombre + "," + Telefono + "," + Cedula + "," + Direccion;
    }
    
    }
     
    public class ArchivoClientes {

    // Método para escribir un cliente en el archivo
    public static void escribirCliente(Cliente cliente, String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        try {
            // Verificar si el archivo no existe y crearlo
            if (!archivo.exists()) {
                archivo.createNewFile();  // Crear el archivo si no existe
            }

            // Escribir los datos en el archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {  // 'true' para agregar sin sobrescribir
                writer.write(cliente.toString());
                writer.newLine();  // Nueva línea después de cada cliente
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer los clientes desde un archivo
    public static List<Cliente> leerClientes(String rutaArchivo) {
        List<Cliente> clientes = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        // Si el archivo no existe, retornamos una lista vacía
        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return clientes;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");  // Dividir la línea por comas
                if (datos.length == 4) {  // Asegurarse de que haya 4 elementos (nombre, teléfono, cédula, dirección)
                    Cliente cliente = new Cliente(datos[0], datos[1], datos[2], datos[3]);
                    clientes.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}    
        
    public static class Pedido {
    private String nombreProducto;
    private String cedulaCliente;
    private String direccion;

    public Pedido(String nombreProducto, String cedulaCliente, String direccion) {
        this.nombreProducto = nombreProducto;
        this.cedulaCliente = cedulaCliente;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombreProducto + "," + cedulaCliente + "," + direccion;
    }
}

    public static class Inventario {
    private String nombreProducto;
    private int cantidad;

    public Inventario(String nombreProducto, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombreProducto + "," + cantidad;
    }
}

    public class ArchivoPedidos {

    // Método para escribir un pedido en el archivo
    public static void escribirPedido(Pedido pedido, String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        try {
            // Verificar si el archivo no existe y crearlo
            if (!archivo.exists()) {
                archivo.createNewFile();  // Crear el archivo si no existe
            }

            // Escribir los datos en el archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {  // 'true' para agregar sin sobrescribir
                writer.write(pedido.toString());
                writer.newLine();  // Nueva línea después de cada pedido
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer los pedidos desde un archivo
    public static List<Pedido> leerPedidos(String rutaArchivo) {
        List<Pedido> pedidos = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        // Si el archivo no existe, retornamos una lista vacía
        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return pedidos;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");  // Dividir la línea por comas
                if (datos.length == 3) {  // Asegurarse de que haya 3 elementos (nombreProducto, cedulaCliente, direccion)
                    Pedido pedido = new Pedido(datos[0], datos[1], datos[2]);
                    pedidos.add(pedido);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pedidos;
    }
}
    public class ArchivoInventario {

    // Método para escribir un inventario en el archivo
    public static void escribirInventario(Inventario inventario, String rutaArchivo) {
        File archivo = new File(rutaArchivo);

        try {
            // Verificar si el archivo no existe y crearlo
            if (!archivo.exists()) {
                archivo.createNewFile();  // Crear el archivo si no existe
            }

            // Escribir los datos en el archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {  // 'true' para agregar sin sobrescribir
                writer.write(inventario.toString());
                writer.newLine();  // Nueva línea después de cada producto
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer el inventario desde un archivo
    public static List<Inventario> leerInventario(String rutaArchivo) {
        List<Inventario> inventario = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        // Si el archivo no existe, retornamos una lista vacía
        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return inventario;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");  // Dividir la línea por comas
                if (datos.length == 2) {  // Asegurarse de que haya 2 elementos (nombreProducto, cantidad)
                    Inventario item = new Inventario(datos[0], Integer.parseInt(datos[1]));
                    inventario.add(item);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inventario;
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
    
    
    public static class ArchivoUsuarios {      
        // Método para escribir un usuario en el archivo
        public static void escribirUsuario(Usuario usuario, String rutaArchivo) {
            File archivo = new File(rutaArchivo);

            try {
                // Verificar si el archivo no existe y crearlo
                if (!archivo.exists()) {
                    archivo.createNewFile();  // Crear el archivo si no existe
                }

                // Escribir los datos en el archivo
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {  // 'true' para agregar sin sobrescribir
                    writer.write(usuario.toString());
                    writer.newLine();  // Nueva línea después de cada usuario
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Método para leer los usuarios desde un archivo
        public static List<Usuario> leerUsuarios(String rutaArchivo) {
            List<Usuario> usuarios = new ArrayList<>();
            File archivo = new File(rutaArchivo);

            // Si el archivo no existe, retornamos una lista vacía
            if (!archivo.exists()) {
                System.out.println("El archivo no existe.");
                return usuarios;
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(",");  // Dividir la línea por comas
                    if (datos.length == 3) {
                        Usuario usuario = new Usuario(datos[0], datos[1], datos[2]);
                        usuarios.add(usuario);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return usuarios;
        }
   }
    // Método principal para pruebas
    public static void main(String[] args) {
        //String rutaArchivo = "usuarios.txt";

        // Crear un nuevo usuario y escribirlo al archivo
        //Usuario usuario1 = new Usuario("admin", "123", "Administrador");
        //Usuario usuario2 = new Usuario("bode", "123", "Bodeguero");
        //Usuario usuario3 = new Usuario("vend", "123", "Vendedora");
        //ArchivoUsuarios.escribirUsuario(usuario1, rutaArchivo);
        //ArchivoUsuarios.escribirUsuario(usuario2, rutaArchivo);
        //ArchivoUsuarios.escribirUsuario(usuario3, rutaArchivo);

        // Leer los usuarios del archivo
        //List<Usuario> usuarios = ArchivoUsuarios.leerUsuarios(rutaArchivo);

        // Mostrar los usuarios leídos
        //for (Usuario usuario : usuarios) {
          //  System.out.println("Nombre: " + usuario.getNombreUsuario());
            //System.out.println("Contraseña: " + usuario.getContraseña());
            //System.out.println("Cargo: " + usuario.getCargo());
            //System.out.println();
        //}
    //}
     // Crear un nuevo cliente y escribirlo en el archivo
         // Crear un nuevo pedido y escribirlo en el archivo

        // Crear un nuevo pedido y escribirlo en el archivo
                

        // Crear un nuevo producto de inventario y escribirlo en el archivo
        Inventario producto1 = new Inventario("Producto A", 100);
        ArchivoInventario.escribirInventario(producto1, rutaArchivo3);

        // Leer el inventario del archivo
        List<Inventario> inventario = ArchivoInventario.leerInventario(rutaArchivo3);

        // Mostrar el inventario leído
        for (Inventario item : inventario) {
            System.out.println("Nombre del Producto: " + item.getNombreProducto());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println();
        }
    }

    }



