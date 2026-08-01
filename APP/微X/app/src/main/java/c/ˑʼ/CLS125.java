// Decompiled by JEB v5.42.0.202606242140

package c.ˑʼ;

import android.app.Activity;
import c.ˈⁱ.CLS95;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS110;
import c.ـˉ.CLS204;
import c.ـˉ.CLS258;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CLS125 {
    public final LinkedHashMap FLD601;
    public boolean FLD602;
    public final WeakReference FLD603;
    public final HashMap FLD604;
    public final String FLD605;

    public CLS125(Activity activity0) {
        this(activity0, null);
    }

    public CLS125(Activity activity0, String s) {
        this.FLD603 = new WeakReference(activity0);
        this.FLD605 = s;
        this.FLD601 = new LinkedHashMap();
        this.FLD604 = new HashMap();
    }

    public CLS125 MTH2414(String s, CLS107 ˆٴ0) {
        return this.MTH2417(CLS95.MTH1980(s, s), s, ˆٴ0);
    }

    private void MTH2415(Object object0) {
        try {
            CLS107 ˆٴ0 = (CLS107)this.FLD604.get(((String)object0));
            if(ˆٴ0 != null) {
                ˆٴ0.MTH2281();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public CLS125 MTH2417(String s, String s1, CLS107 ˆٴ0) {
        this.FLD601.put(s, s1);
        this.FLD604.put(s1, ˆٴ0);
        return this;
    }

    public void MTH2418() {
        if(this.MTH2419()) {
            return;
        }
        boolean z = this.FLD602;
        Object object0 = this.FLD603.get();
        CLS631 ˆٴ0 = new CLS631(this);
        CLS258.MTH3755(z, ((Activity)object0), this.FLD605, this.FLD601, true, ((CLS110)ˆٴ0));
    }

    public boolean MTH2419() {
        return this.FLD604.isEmpty();
    }
}

