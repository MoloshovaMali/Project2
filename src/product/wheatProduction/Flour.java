package product.wheatProduction;

import java.time.LocalDate;

public class Flour extends WheatProduction {
    public Flour(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
