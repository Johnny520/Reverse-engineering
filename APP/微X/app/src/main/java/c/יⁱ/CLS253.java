// Decompiled by JEB v5.42.0.202606242140

package c.יⁱ;

import java.util.HashMap;
import java.util.HashSet;

public class CLS253 {
    public final HashSet FLD996;
    public final HashSet FLD997;
    public final HashSet FLD998;
    public final HashMap FLD999;
    public final HashSet FLD1000;

    public CLS253() {
        this.FLD999 = new HashMap();
        this.FLD1000 = new HashSet();
        this.FLD996 = new HashSet();
        this.FLD998 = new HashSet();
        this.FLD997 = new HashSet();
    }

    public boolean MTH3306(String s) {
        return this.FLD997.contains(s);
    }

    public void MTH3307(String s) {
        this.FLD997.add(s);
    }

    public void MTH3308(String s) {
        this.FLD996.add(s);
    }

    public boolean MTH3309(String s) {
        return this.FLD998.contains(s);
    }

    public boolean MTH3310(String s) {
        return this.FLD1000.contains(s);
    }

    public void MTH3311(String s) {
        this.FLD998.add(s);
    }

    public boolean MTH3312(String s) {
        return this.FLD996.contains(s);
    }

    public void MTH3313(String s, String s1) {
        this.FLD999.put(s, s1);
    }

    public void MTH3314(String s) {
        this.FLD1000.add(s);
    }

    public String MTH3315(String s) {
        return (String)this.FLD999.get(s);
    }

    public void MTH3316(String s) {
        this.FLD999.remove(s);
    }

    public boolean MTH3317(String s) {
        return this.FLD999.containsKey(s);
    }
}

