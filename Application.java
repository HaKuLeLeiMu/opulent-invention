public class Application {
    public static void main(String[] args) {
        Information i1 = new Information("HeNan", 25, "sunny");
        Information i2 = new Information("ShangHai", 11, "rainy");
        Information i3 = new Information("Xinjiang", 45, "sunny");
        Information i4 = new Information("ShenZhen", 22, "cloudy");
        Information i5 = new Information("GuangXi", 15, "rainy");

        WeatherSystem ws = new WeatherSystem();

        TempDisplay td = new TempDisplay(ws);
        WeatherDisplay wd = new WeatherDisplay(ws);
        AllDisplay ad = new AllDisplay(ws);

        ws.addInformation(i1);
        ws.addInformation(i2);
        ws.addInformation(i3);
        ws.addInformation(i4);
        ws.addInformation(i5);

        System.out.println("====================================");
        td.display();
        System.out.println("====================================");
        wd.display();
        System.out.println("====================================");
        ad.display();
    }
}
