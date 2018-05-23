package controller;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Ansatt;

public class AnsattTableModel extends AbstractTableModel
{
    private final List<Ansatt> ansattListe;

    private final String[] columnNames = new String[] {
            "Id", "Navn", "Timelønn", "Avdeling"
    };
    private final Class[] columnClass = new Class[] {
            Integer.class, String.class, Double.class, Integer.class
    };

    public AnsattTableModel(List<Ansatt> ansattListe)
    {
        this.ansattListe = ansattListe;
    }

    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    @Override
    public int getRowCount()
    {
        return ansattListe.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Ansatt row = ansattListe.get(rowIndex);
        if(0 == columnIndex) {
            return row.getId();
        }
        else if(1 == columnIndex) {
            return row.getNavn();
        }
        else if(2 == columnIndex) {
            return row.getTimeLonn();
        }
        else if(3 == columnIndex) {
            return row.getAvdeling();
        }
        return null;
    }
}