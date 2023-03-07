package product.dairyProduction;

import java.time.LocalDate;

public class Milk extends DairyProduction{
    public Milk(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
