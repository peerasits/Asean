package th.ac.su.cp.asean.model;

//model
public class WordItem {
    public final int imageResId;
    public final String country;
    public final String capital;

    public WordItem(int imageResId, String country,String capital) {
        this.imageResId = imageResId;
        this.country = country;
        this.capital = capital;
    }
}
