package product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class ServiceProductImpl implements Service {
    private final List<Product> list = new ArrayList<>();
    private final List<Product> list1 = new ArrayList<>();
    Manager manager = new Manager();
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    @Override
    public void addProduct(List<Product> products) {
        products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> s.getDate().minusMonths(1).isAfter(LocalDate.now())).forEach(System.out::println);
        list.addAll(products);

    }

    @Override
    public void uppDateProducts(List<Product>list1) {
     List<Product>products=list1.stream().filter(r->r.getDate().isBefore(LocalDate.now())).toList();
        System.out.println(ANSI_RED+"Expired products"+ANSI_RESET);
        list1.forEach(System.out::println);
        list1.removeIf(p->p.getDate().isBefore(LocalDate.now()));
        List<Product>productList=list1.stream().filter(x->x.getCompanyName().equals("TOIBOSS")||x.getCompanyName().equals("NUR")||x.getCompanyName().equals("MILKA")
        ).filter(o->!o.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.out.println(ANSI_BLUE+"DISCOUNT"
        +ANSI_RESET);
         productList.forEach(System.out::println);

    }

    @Override
    public void checkToManager(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Write ->login" + ANSI_RESET);
        String login = scanner.nextLine();
        System.out.println(ANSI_YELLOW+"Write -> password");
        String password=scanner.nextLine();
        if(login.equals(manager.getLogin())&&password.equals(manager.getPassword())) {
            System.out.println(ANSI_GREEN+"WELCOME >"+ login+ANSI_GREEN);
            addProduct(products);
            uppDateProducts(products);
        }else {
            throw new MyExceptioon("YOU AREN'T A MANAGER");
        }


    }
}
