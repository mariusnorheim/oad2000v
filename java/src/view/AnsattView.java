package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import model.*;

public class AnsattView extends JFrame
{
    public AnsattView()
    {
        // Lag ett datasett for visning
        Ansatt rad1 = new Ansatt(1, "Arne Brimi", 340.0, 1);
        Ansatt rad2 = new Ansatt(2, "Bjørn Dæhlie", 390.0, 2);
        Ansatt rad3 = new Ansatt(3, "Arne Hjeltnes", 325.0, 1);
        Ansatt rad4 = new Ansatt(4, "Vegard Ulvang", 387.5, 2);

        List<Ansatt> ansattListe = new ArrayList<Ansatt>();
        ansattListe.add(rad1);
        ansattListe.add(rad2);
        ansattListe.add(rad3);
        ansattListe.add(rad4);

        // Fyll ut modellen med datasettet
        AnsattTableModel model = new AnsattTableModel(ansattListe);

        // Lag tabellen og legg til vinduet
        JTable table = new JTable(model);
        this.add(new JScrollPane(table));

        this.setTitle("Ansatte - AbstractTableModel eksempel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    // Entry point
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