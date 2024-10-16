import java.util.ArrayList;

public class TempDisplay implements Observer, DisplayElement {
    ArrayList<Information> infor;

    public TempDisplay(WeatherSystem ws) {
        infor = new ArrayList<Information>();
        ws.registerObserver(this);
    }

    @Override
    public void display() {
        int index = infor.size();
        if (index <= 0) {
            System.out.println("no data");
            return;
        }
        for (int i = 0; i < index; i++)
            System.out.println(infor.get(i).getAddress() + ":   " + infor.get(i).getTemp());
    }

    @Override
    public void update(ArrayList<Information> infor) {
        this.infor = infor;
    }

    @Override
    public void display(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}