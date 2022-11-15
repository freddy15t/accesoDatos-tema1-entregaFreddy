package main.clase.ordenadores;
public class OrdenadorTestFreddy {
    
    public static void main(String[] args) {
        Portatiles p = new Portatiles(12489, 16, "RTX2080", 649.99, 500.90);
        System.out.println(p.toString());
        p.getCaracteristica();
        System.out.println(p.toString());
        System.out.println("\n");


        Sobremesa s = new Sobremesa(57698, 16, "NVIDIA", 799.90, "Torre");
        System.out.println(s.toString());
        s.getCaracteristica();
        System.out.println(s.toString());


        
}
}
