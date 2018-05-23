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

    // Overstyr getColumnName fra AbstractTableModel
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
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
        Ansatt data = ansattListe.get(rowIndex);
        if(columnIndex == 0) {
            return data.getId();
        }
        else if(columnIndex == 1) {
            return data.getNavn();
        }
        else if(columnIndex == 2) {
            return data.getTimeLonn();
        }
        else if(columnIndex == 3) {
            return data.getAvdeling();
        }

        return null;
    }

    // Overstyr setValueAt fra AbstractTableModel
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
    {
        Ansatt data = ansattListe.get(rowIndex);
        if(columnIndex == 0) {
            data.setId((Integer) aValue);
        }
        else if(columnIndex == 1) {
            data.setNavn((String) aValue);
        }
        else if(columnIndex == 2) {
            data.setTimeLonn((Double) aValue);
        }
        else if(columnIndex == 3) {
            data.setAvdeling((Integer) aValue);
        }
    }

    // Overstyr isCellEditable fra AbstractTableModel
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return true;
    }
}