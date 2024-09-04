/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author JUAN JOSE
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JPanel");
        JPanel panel = new JPanel();
        
        // Crear componentes
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton toggleButton = new JButton("Remover/Reagregar");
        
        // Agregar componentes al panel
        panel.add(button1);
        panel.add(button2);

        // Acción para remover y volver a agregar
        toggleButton.addActionListener(new ActionListener() {
            private boolean removed = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (removed) {
                    // Volver a agregar los componentes
                    panel.add(button1);
                    panel.add(button2);
                } else {
                    // Remover todos los componentes
                    panel.removeAll();
                }

                removed = !removed;

                // Actualizar la interfaz
                panel.revalidate();
                panel.repaint();
            }
        });

        // Añadir el botón de acción al frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(toggleButton, BorderLayout.SOUTH);

        // Configuración del frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
