package at.spengergasse;

public class Pirat {
    
    private String name;
    private int gesundheit;  // 0 - 100 
    private boolean holzbein;
    
    
    public Pirat() {
        name = name;
        gesundheit = gesundheit;
        holzbein = holzbein;
    }
    
    
    public void kielholen() {
        if (gesundheit < 0){
            throw new IllegalArgumentException("Gesundheit unter 0 Prozent");
        }
        if (holzbein){
         this.gesundheit -= 95;
        }else {
            this.gesundheit -= 90;
        }
        if (gesundheit <= 0){
            System.out.println("Pirat "+ name + "stieg in Davy Jone's Kiste");
        }
        // Gesundheit darf nicht unter 0 kommen
        // Pruefung hat er holzbein, dann 95 sonst 90
        
        // Einfache Variante mit Zwischenergebnis
        
        // Pruefen ob aktuelleGesundheit <= 0 -> dann gesundheit 0 und Meldung

        int gesundheit = 0;
        
        // ...
        
    }
    
    public int getGesundheit() {
        return gesundheit;
    }
    public void setGesundheit(int gesundheit){
        if(gesundheit == 0 || gesundheit == 100){
            this.gesundheit = gesundheit;
        }else {
            throw new IllegalArgumentException("Yo-ho-ho - Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent");
        }

    }
    public String getName(){return name;}
    public void setName(String name){
        if (name == null)
            throw new IllegalArgumentException("Arrgh! Keinen Namen fuer den alten Seebaeren uebergeben!");
        this.name = name;
    }
    public void trinken(char getraenk){
        if(getraenk =='w'){
            gesundheit -= 10;
        } else if (getraenk == 'g') {
            gesundheit -= 10;
        } else if(getraenk == 'r'){
            gesundheit += 20;
        }
        if(gesundheit < 0 || gesundheit > 100)
            throw new IllegalArgumentException("Arrgh! Falsche Werte!");
        if (gesundheit == 0) {
            System.out.println("Haudegen "+ name + "ging über die Planken!");
        }
        if (gesundheit == 100){
            System.out.println("Haudegen "+ name + "erfreut sich über voller Gesundheit!");
        }
    }
    public String toString() {
        return "Aye - Trunkenbold " + name + " meldet sich an Board! " + gesundheit + ", " + holzbein;
    }
    public void print(){
        System.out.println(toString());
    }
    
}