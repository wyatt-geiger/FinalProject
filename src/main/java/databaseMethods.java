public class databaseMethods {

    private int dexNum;
    private String pokeName;
    private String type1;
    private String type2;

    databaseMethods(int dex, String pN, String t1, String t2) {
        dexNum = dex;
        pokeName = pN;
        type1 = t1;
        type2 = t2;
    }

    public int getDexNum() {return dexNum;}

    public void setDexNum(int dexNum) {this.dexNum = dexNum;}

    public String getPokeName() {return pokeName;}

    public void getPokeName(String pokeName) {this.pokeName = pokeName;}

}
