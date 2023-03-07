package product.dairyProduction;

import product.Product;

import java.time.LocalDate;

public abstract class DairyProduction extends Product {
    public DairyProduction(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
