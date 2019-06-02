public class Debug {

    public static String toString(Object value) {
    Object obj = value;


       // pour les types de base (Int / String / Char / Float )
       // tout ce qui a pour class chiffre et lettre
       //ou on est passer par le new....
        if(obj.getClass().getCanonicalName()!= null){
            if(obj.getClass().getCanonicalName()=="java.lang.Object")
            {




               o return "{"+obj.toString()+"}";
            }
            // retourne la valeur car c'est un type de base qui a toString
            return obj.toString();

        }

        // tableau etc....
        else {
        return null;
        }
    }
}
