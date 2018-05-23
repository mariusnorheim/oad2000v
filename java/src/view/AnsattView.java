package view;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import controller.AnsattTableModel;
import model.Ansatt;

public class AnsattView extends JFrame
{
    public AnsattView()
    {
        // Lag ett datasett
        Ansatt row1 = new Ansatt(1, "John", 340.0, 1);
        Ansatt row2 = new Ansatt(2, "Rambo", 245.0, 2);
        Ansatt row3 = new Ansatt(3, "Zorro", 270.0, 2);

        List<Ansatt> ansattListe = new ArrayList<Ansatt>();
        ansattListe.add(row1);
        ansattListe.add(row2);
        ansattListe.add(row3);

        // Lag modellen
        AnsattTableModel model = new AnsattTableModel(ansattListe);

        // Lag tabellen og legg til vinduet
        JTable table = new JTable(model);
        this.add(new JScrollPane(table));

        this.setTitle("Editable Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnsattView();
            }
        });
    }
}