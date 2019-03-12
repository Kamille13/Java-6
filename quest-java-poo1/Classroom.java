public class Classroom{

        public static void main(String[] args){

            Wilder cédric = new Wilder("Cédric", true);
            Wilder anaclet = new Wilder("Anaclet",false);
            Wilder jérémy = new Wilder("Jérémy",true);  

            System.out.println(cédric.whoAmI());
            System.out.println(anaclet.whoAmI());
            System.out.println(jérémy.whoAmI());
        }

        
}