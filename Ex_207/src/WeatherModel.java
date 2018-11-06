
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class WeatherModel extends AbstractTableModel {

    private final ArrayList<Weatherstation> stations = new ArrayList<>();
    private final String[] colNames = {"Place", "Sea Level", "Temperature", "rel. Humidity"};

    @Override
    public int getRowCount() {
        return stations.size();
    }

    public void add(Weatherstation w) {
        int i;
        for (i = 0; i < stations.size(); i++) {
            if (stations.get(i).getPlace() > w.getPlace()) {
                break;
            }
        }
        stations.add(i, w);
        fireTableRowsInserted(i, i);
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return stations.get(rowIndex);
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

}
