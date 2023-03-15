import product.MyExceptioon;
import product.Product;
import product.ServiceProductImpl;
import product.dairyProduction.Kefir;
import product.dairyProduction.Milk;
import product.dairyProduction.SourCream;
import product.meatProduction.Fish;
import product.meatProduction.LambMeat;
import product.meatProduction.Sausage;
import product.wheatProduction.Bread;
import product.wheatProduction.Flour;
import product.wheatProduction.Pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceProductImpl serviceProduct=new ServiceProductImpl();
        List<Product> list=new ArrayList<>();
        list.add(new Fish(1,"FISH","TOIBOSS", LocalDate.of(2023,3,10)));
        list.add(new Fish(2,"FISH2","TOISS", LocalDate.of(2023,4,20)));
        list.add(new Fish(3,"FISH3","TOIBOSS", LocalDate.of(2023,4,13)));
        list.add(new LambMeat(9,"LAMB.MEAT","TOIBOSS",LocalDate.of(2023,3,7)));
        list.add(new LambMeat(4,"LAMB.MEAT2","TOIBOSS",LocalDate.of(2023,7,2)));
        list.add(new LambMeat(5,"LAMB.MEAT3","TOIBOSS",LocalDate.of(2023,4,3)));
        list.add(new Sausage(3,"SAUSAGE","TOIBOSS",LocalDate.of(2022,3,2)));
        list.add(new Sausage(3,"SAUSAGE2","TOIBOSS",LocalDate.of(2023,4,1)));
        list.add(new Sausage(3,"SAUSAGE3","TOIBOSS",LocalDate.of(2023,5,2)));

        list.add(new Kefir(9,"KEFIR","MILKA",LocalDate.of(2020,2,1)));
        list.add(new Kefir(99,"KEFIR2","MILKA",LocalDate.of(2023,2,3)));
        list.add(new Milk(3,"MILK",",MILKA",LocalDate.of(2023,1,1)));
        list.add(new Milk(1,"MILK2","MILKA",LocalDate.of(2023,1,1)));
        list.add(new SourCream(23,"SOURCREAM","MILKA",LocalDate.of(2022,3,4)));

        list.add(new Bread(8,"BREAD","NUR",LocalDate.of(2023,6,7)));
        list.add(new Bread(8,"BREAD2","NUR",LocalDate.of(2023,6,7)));
        list.add(new Pasta(4,"PASTA","NUR",LocalDate.of(2021,2,2)));
        list.add(new Pasta(4,"PASTA","NUR",LocalDate.of(2021,3,2)));
        list.add(new Flour(2,"FLOUR","NUR",LocalDate.of(2023,5,5)));
        serviceProduct.addProduct(list);
        serviceProduct.uppDateProducts(list);
        Scanner scanner=new Scanner(System.in);
        try{
            serviceProduct.checkToManager(list);
        }catch (MyExceptioon e){
            System.out.println(e.getMessage());
        }
    }
}