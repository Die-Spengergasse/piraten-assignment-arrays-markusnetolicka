package at.spengergasse;

public class Schiff{
    
    
    private Pirat kapitaen;
    private Pirat pirat2;
    private Pirat pirat3;
    private Pirat pirat4;
    private Pirat pirat5;
    private Pirat pirat6;
    private Pirat [] pirat;
    private char typ;
    
    public Schiff(char typ) {
        setTyp(typ);
    }
    
    public void setTyp(char typ) {
        this.typ = typ;
        Pirat [] pirat = new Pirat[5];
    }
    
    
    public void anheuern(Pirat pirat) {
        
        if(typ == 's') {
            
            // Beim typ s dürfen nur 3 Piraten aufgenommen werden
            if(this.kapitaen == null) {
                this.kapitaen = pirat;
            } else if(this.pirat2 == null) {
                
            } else if(this.pirat3 == null) {
                
            } else {
                // Fehlermeldung
            }
            // ...
            
        } else if(typ == 'b') {
            
            if(this.kapitaen == null) {
                // ...
            }
            
        }
        
    }
    
    
    
}