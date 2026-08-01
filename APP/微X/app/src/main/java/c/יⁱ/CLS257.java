// Decompiled by JEB v5.42.0.202606242140

package c.יⁱ;

import android.app.Activity;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS144;
import c.ˏᵎ.CLS185;
import c.ﹶˆ.CLS344;
import c.ﹶˆ.CLS345;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CLS257 {
    public final HashMap FLD1015;
    public boolean FLD1016;
    public final String FLD1017;
    public final WeakReference FLD1018;
    public final LinkedHashMap FLD1019;

    public CLS257(Activity activity0) {
        this(activity0, null);
    }

    public CLS257(Activity activity0, String s) {
        this.FLD1018 = new WeakReference(activity0);
        this.FLD1017 = s;
        this.FLD1019 = new LinkedHashMap();
        this.FLD1015 = new HashMap();
    }

    public CLS257 MTH3377(String s, String s1, CLS345 ⁱˋ0) {
        this.FLD1019.put(s, s1);
        this.FLD1015.put(s1, ⁱˋ0);
        return this;
    }

    private void MTH3378(Object object0) {
        try {
            CLS345 ⁱˋ0 = (CLS345)this.FLD1015.get(((String)object0));
            if(ⁱˋ0 != null) {
                ⁱˋ0.MTH4829();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public boolean MTH3379() {
        return this.FLD1015.isEmpty();
    }

    public void MTH3380() {
        if(this.MTH3379()) {
            return;
        }
        boolean z = this.FLD1016;
        Object object0 = this.FLD1018.get();
        CLS581 ⁱˋ0 = new CLS581(this);
        CLS144.MTH2203(z, ((Activity)object0), this.FLD1017, this.FLD1019, true, ((CLS344)ⁱˋ0));
    }

    public CLS257 MTH3382(String s, CLS345 ⁱˋ0) {
        return this.MTH3377(CLS98.MTH1314(s, s), s, ⁱˋ0);
    }
}

