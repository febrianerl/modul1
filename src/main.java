import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listkonsumsi = new ArrayList<>();

        Konsumsi<makanan, minuman> breakfast = new Konsumsi<>();
        Konsumsi<makanan, minuman> lunch = new Konsumsi<>();
        makanan roti = new makanan();
        roti.setNamaHidangan("roti tawar");
        minuman susu = new minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setKonsumsi(roti, susu);
        listkonsumsi.add(breakfast);

        makanan nasi=new makanan();
        nasi.setNamaHidangan("nasi putih");
        minuman air = new minuman();
        air.setNamaHidangan("air putih");
        lunch.setKonsumsi(nasi, air);
        listkonsumsi.add(lunch);

        System.out.println("menu konsumsi");
        for (Konsumsi<makanan,minuman> Konsumsi : listkonsumsi){
            makanan makanan=Konsumsi.getM();
            minuman minuman=Konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
}
