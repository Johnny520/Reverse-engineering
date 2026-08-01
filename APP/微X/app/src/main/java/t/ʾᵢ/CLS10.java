// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import t.ˆʿ.CLS52;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS135;
import t.ᵔʾ.CLS137;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS338;

public abstract class CLS10 {
    public final CLS135 FLD135;
    public final HashSet FLD136;
    public WeakReference FLD137;
    public final String FLD138;
    public final String FLD139;
    public final HashSet FLD140;

    public CLS10(String s, String s1) {
        this.FLD139 = s;
        this.FLD138 = s1;
        this.FLD136 = new HashSet();
        this.FLD140 = new HashSet();
        this.FLD135 = CLS133.MTH2103();
        CLS52 ⁱʾ0 = (CLS52)CLS137.FLD972.MTH2143(CLS52.class);
    }

    public final CLS338 MTH1044(boolean z, boolean z1) {
        CLS338 יᐧ0 = new CLS338(this.MTH1048());
        if(z) {
            this.FLD136.add(יᐧ0);
        }
        if(z1) {
            this.FLD140.add(יᐧ0);
        }
        return יᐧ0;
    }

    public abstract void MTH1045(boolean arg1, boolean arg2, String arg3);

    public abstract void MTH1046(LinearLayout arg1, boolean arg2, boolean arg3);

    public final CLS332 MTH1047(boolean z, boolean z1) {
        CLS332 ʻᵎ0 = new CLS332(this.MTH1048());
        if(z) {
            this.FLD136.add(ʻᵎ0);
        }
        if(z1) {
            this.FLD140.add(ʻᵎ0);
        }
        return ʻᵎ0;
    }

    public final Activity MTH1048() {
        return (Activity)this.FLD137.get();
    }
}

