package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AnsattTableModel extends AbstractTableModel
{
    private final List<Ansatt> ansattListe;

    // Sett kolonnenavn
    private final String[] columnNames = new String[] {
            "Id", "Navn", "Timelønn", "Avdeling"
    };
    // Sett datatyper
    private final Class[] columnClass = new Class[] {
            Integer.class, String.class, Double.class, Integer.class
    };

    public AnsattTableModel(List<Ansatt> ansattListe)
    {
        this.ansattListe = ansattListe;
    }

    // Overstyr getColumnName fra AbstractTableModel
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }

    // Overstyr getColumnClass fra AbstractTableModel
    @Override
    public Class<?> getColumnClass(int columnIndex)
    {
        return columnClass[columnIndex];
    }

    // Overstyr getColumnCount fra AbstractTableModel
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }

    // Overstyr getRowCount fra AbstractTableModel
    @Override
    public int getRowCount()
    {
        return ansattListe.size();
    }

    // Overstyr getValueAt fra AbstractTableModel
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

    // Overstyr setValueAt fra AbstractTableModel
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Ansatt row = ansattListe.get(rowIndex);
        if(0 == columnIndex) {
            row.setId((Integer) aValue);
        }
        else if(1 == columnIndex) {
            row.setNavn((String) aValue);
        }
        else if(2 == columnIndex) {
            row.setTimeLonn((Double) aValue);
        }
        else if(3 == columnIndex) {
            row.setAvdeling((Integer) aValue);
        }
    }

    // Overstyr isCellEditable fra AbstractTableModel
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
}