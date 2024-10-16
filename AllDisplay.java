import java.util.ArrayList;

public class AllDisplay implements Observer, DisplayElement {
    ArrayList<Information> infor;

    public AllDisplay(WeatherSystem ws) {
        infor = new ArrayList<Information>();
        ws.registerObserver(this);
    }

    private int searchIndex(String name) {
        for (int i = 0; i < infor.size(); i++) {
            if (infor.get(i).getAddress().equals(name))
                return i;
        }
        return -1;
    }

    @Override
    public void display() {
        int index = infor.size();
        if (index <= 0) {
            System.out.println("no data");
            return;
        }
        for (int i = 0; i < index; i++)
            System.out.println(infor.get(i).getAddress() + ": " +
                    infor.get(i).getTemp() + " "
                    + infor.get(i).getWeather());
    }

    @Override
    public void display(String name) {
        for (int i = 0; i < infor.size(); i++) {
            if (infor.get(i).getAddress().equals(name))
                System.out.println(infor.get(i).getAddress() + ": " +
                    infor.get(i).getTemp() + " "
                    + infor.get(i).getWeather());
            else
                System.out.println("-1");
        }
    }

    @Override
    public void update(ArrayList<Information> infor) {
        this.infor = infor;
    }
}