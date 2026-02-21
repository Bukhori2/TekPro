public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        Restaurant.nextId();

        System.out.println("Menu Makanan:");
        menu.tampilMenuMakanan();

        menu.pesanMakanan("Pizza", 2);
        menu.pesanMakanan("Spaghetti", 21);
    }
}
