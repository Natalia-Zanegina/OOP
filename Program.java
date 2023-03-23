package Homework1;

public class Program {
    public static void main(String[] args){
        Object[] goods = {
            new food("steak", 500, 2, "loafs", 4),
            new drinks("juice", 200, 2, "bottles", 2),
            new hygiene("napkin", 50, 10, "pack", 10),
            new babyProducts("shampoo", 75, 1, "bottle", 1, true),
            new milk("Vesyolaya korova", 100, 2, "pack", 1, 3.2, 0),
            new lemonade("Tarkhun", 70, 1, "bottle", 1),
            new bread("baguette", 87, 2, "loafs", 2, "wheat"),
            new eggs("Eggs from country-side", 200, 2, "pack", 30, 6),
            new masks("Safe breath", 100, 2, "pack", 30),
            new toiletPaper("Soft", 50, 2, "pack", 8, 3),
            new diaper("Pampers", 1000, 2, "pack", 0, true, 2, 5, 8, "pants"),
            new nipple("Malysh", 150, 1, "piece", 0, true)
        };
    

    for (Object item: goods) {
        System.out.println(item);
    };
}
}
