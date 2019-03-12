public class Wilder{

    private String firstname;
    private boolean aware;

    public Wilder(String firstnameValue, boolean awareValue){
        this.firstname = firstnameValue;
        this.aware = awareValue;

    }
    
    public String getFirstname() {
        return this.firstname;
    }
    public boolean isAware() {
        return this.aware;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setAware(boolean aware) {
        this.aware = aware;
    }
    public String whoAmI() {

        if (this.isAware()) {
            return "Je m'appelle " + this.getFirstname() + " et suis aware";}
        else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";}
      
    }
}