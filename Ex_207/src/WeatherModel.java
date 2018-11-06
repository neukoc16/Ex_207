
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class WeatherModel extends AbstractTableModel {

    private ArrayList<Weatherstation> stations = new ArrayList<>();
    private String[] colNames = {"Place", "Sea Level", "Temperature", "rel. Humidity"};

    @Override
    public int getRowCount() {

    }

    @Override
    public int getColumnCount() {

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

}
