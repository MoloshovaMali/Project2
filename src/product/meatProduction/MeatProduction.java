package product.meatProduction;

import product.Product;

import java.time.LocalDate;

public abstract class MeatProduction extends Product {
    public MeatProduction(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
