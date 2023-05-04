public class Cafetera {
    public int agua;
    public int crema;
    public int cafe;
    public int vasos;

    public Cafetera() {
    }

    public Cafetera(int agua, int crema, int cafe, int vasos) {
        this.agua = agua;
        this.crema = crema;
        this.cafe = cafe;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", crema=" + crema +
                ", cafe=" + cafe +
                ", vasos=" + vasos +
                '}';
    }

    public boolean americano(int cantidad) {
        boolean americano = false;
        if (agua >= 180 * cantidad && cafe >= 15 * cantidad && vasos >= 1 * cantidad) {
            agua -= 180 * cantidad;
            cafe -= 15 * cantidad;
            vasos -= 1 * cantidad;
            System.out.println("\ten proceso...");
            System.out.println("\t" + cantidad + "CAFE AMERICANO LISTO");
            americano = true;
        }  else {
            if (vasos < 1*cantidad)
                System.out.println("\tRECARGAR VASOS");
            if (agua < 180*cantidad)
                System.out.println("\tQUEDA POCA AGUA, RECARGAR");
            if (cafe < 15*cantidad)
                System.out.println("\tQUEDA POCO CAFE, RECARGAR");

        }
        return americano;
    }
    public boolean expreso(int cantidad){
        boolean expreso = false;
        if (agua >= 120 * cantidad && cafe >= 20 * cantidad && vasos >= 1 * cantidad){
            agua -= 120 * cantidad;
            cafe -= 20 * cantidad;
            vasos -= 1 * cantidad;
            System.out.println("\ten proceso...");
            System.out.println("\t" + cantidad + " CAFE EXPRESO LISTO");
            expreso = true;
        }else {
            if (vasos < 1 * cantidad)
                System.out.println("\tRECARCAR VASOS");
            if (agua < 120 * cantidad)
                System.out.println("\tQUEDA POCA AGUA, RECARGAR");
            if (cafe < 20 * cantidad)
                System.out.println("\tQUEDA POCO CAFE, RECARGAR");
        }
        return expreso;
    }

    public boolean capuchino(int cantidad){
        boolean capuchino = false;
        if (agua >= 100 * cantidad && cafe >= 14 * cantidad && vasos >= 1 * cantidad && crema >= 70 * cantidad){
            agua -= 100 * cantidad;
            cafe -= 14 * cantidad;
            crema -= 70 * cantidad;
            vasos -= 1 * cantidad;
            System.out.println("\tPreparando...");
            System.out.println("\t" + cantidad + "CAFE CAPUCHINO LISTO");
            capuchino = true;
        }else {
            if (vasos < 1 * cantidad)
                System.out.println("\tRECARGAR VASOS");
            if (agua < 100 * cantidad)
                System.out.println("\tQUEDA POCA AGUA, RECARGAR");
            if (cafe < 14 * cantidad)
                System.out.println("\tQUEDA POCO CAFE, RECARGAR");
            if (crema < 70 * cantidad)
                System.out.println("\tQUEDA POCA CREMA, RECARGAR");
        }
        return capuchino;
    }

    public void stock (){
        System.out.println("\tagua disponible: " + agua + "ml"
                + "\n\tCafe disponible: " + cafe + "gm"
                + "\n\tCrema disponible:" + crema + "ml"
                + "\n\tVosos disponibles: " + vasos );
    }
}





