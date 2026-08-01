// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS408;
import b.ⁱᵔ.CLS500;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.lang.ref.WeakReference;
import java.util.HashSet;

public abstract class CLS219 {
    public final HashSet FLD2149;
    public final HashSet FLD2150;
    public final CLS29 FLD2151;
    public WeakReference FLD2152;
    public final CLS500 FLD2153;
    public final CLS408 FLD2154;
    public final String FLD2155;
    public final String FLD2156;
    public String FLD2157;

    public CLS219(String s, String s1) {
        this.FLD2156 = s;
        this.FLD2155 = s1;
        this.FLD2149 = new HashSet();
        this.FLD2150 = new HashSet();
        this.FLD2151 = CLS27.MTH895();
        this.FLD2154 = (CLS408)CLS40.FLD157.MTH1118(CLS408.class);
        this.FLD2153 = CLS500.FLD4928;
    }

    public abstract void MTH3874(boolean arg1, boolean arg2, String arg3);

    public final void MTH3875() {
        this.FLD2150.clear();
    }

    public final void MTH3876(Activity activity0) {
        this.FLD2152 = new WeakReference(activity0);
    }

    public final CLS1625 MTH3877(boolean z, boolean z1) {
        CLS1625 ـˏ0 = new CLS1625(this.MTH3883());
        if(z) {
            this.FLD2149.add(ـˏ0);
        }
        if(z1) {
            this.FLD2150.add(ـˏ0);
        }
        return ـˏ0;
    }

    public abstract void MTH3878(LinearLayout arg1, boolean arg2, boolean arg3, boolean arg4);

    public final CLS1635 MTH3879(boolean z, boolean z1) {
        CLS1635 ﾞᵎ0 = new CLS1635(this.MTH3883());
        if(z) {
            this.FLD2149.add(ﾞᵎ0);
        }
        if(z1) {
            this.FLD2150.add(ﾞᵎ0);
        }
        return ﾞᵎ0;
    }

    public final CLS1622 MTH3880(boolean z, boolean z1) {
        CLS1622 ˑٴ0 = new CLS1622(this.MTH3883());
        if(z) {
            this.FLD2149.add(ˑٴ0);
        }
        if(z1) {
            this.FLD2150.add(ˑٴ0);
        }
        return ˑٴ0;
    }

    public final CLS1626 MTH3881(boolean z, boolean z1) {
        CLS1626 ـﹳ0 = new CLS1626(this.MTH3883());
        if(z) {
            this.FLD2149.add(ـﹳ0);
        }
        if(z1) {
            this.FLD2150.add(ـﹳ0);
        }
        return ـﹳ0;
    }

    public final void MTH3882(String s) {
        for(Object object0: this.FLD2150) {
            CLS18 ﾞᐧ0 = (CLS18)object0;
            if(ﾞᐧ0.getText().equals(s)) {
                ﾞᐧ0.MTH799();
                return;
            }
            if(false) {
                break;
            }
        }
    }

    public final Activity MTH3883() {
        return (Activity)this.FLD2152.get();
    }
}

