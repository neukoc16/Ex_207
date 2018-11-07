
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MyTableCellRenderer implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Weatherstation w = (Weatherstation) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        switch (column) {
            case 0:
                label.setText(w.getPlace());
                break;
            case 1:
                label.setText("" + w.getSealevel());
                break;
            case 2:
                label.setText("" + w.getTemperature());
                break;
            case 3:
                label.setText("" + w.getHumidity());
                break;
            default:
                label.setText("???");
        }
        if (w.getTemperature() > 25 && w.getHumidity() < 20) {
            label.setBackground(Color.yellow);
        } else if (w.getTemperature() < 0 && w.getHumidity() < 30) {
            label.setBackground(Color.blue);
        } else if (w.getTemperature() >= 0 && w.getTemperature() <= 25 && w.getHumidity() >= 50) {
            label.setBackground(Color.green);
        }
        
        return label;
    }
    
}
