// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import java.util.HashMap;
import java.util.HashSet;

public class CLS128 {
    public final HashSet FLD613;
    public final HashSet FLD614;
    public final HashMap FLD615;
    public final HashSet FLD616;
    public final HashSet FLD617;

    public CLS128() {
        this.FLD615 = new HashMap();
        this.FLD613 = new HashSet();
        this.FLD616 = new HashSet();
        this.FLD617 = new HashSet();
        this.FLD614 = new HashSet();
    }

    public boolean MTH2464(String s) {
        return this.FLD615.containsKey(s);
    }

    public void MTH2465(String s) {
        this.FLD616.add(s);
    }

    public boolean MTH2466(String s) {
        return this.FLD617.contains(s);
    }

    public String MTH2467(String s) {
        return (String)this.FLD615.get(s);
    }

    public void MTH2468(String s) {
        this.FLD617.add(s);
    }

    public void MTH2469(String s) {
        this.FLD614.add(s);
    }

    public void MTH2470(String s) {
        this.FLD613.add(s);
    }

    public boolean MTH2471(String s) {
        return this.FLD614.contains(s);
    }

    public void MTH2472(String s) {
        this.FLD615.remove(s);
    }

    public void MTH2473(String s, String s1) {
        this.FLD615.put(s, s1);
    }

    public boolean MTH2474(String s) {
        return this.FLD616.contains(s);
    }

    public boolean MTH2475(String s) {
        return this.FLD613.contains(s);
    }
}

