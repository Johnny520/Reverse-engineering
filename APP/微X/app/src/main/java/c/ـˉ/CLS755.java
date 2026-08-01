// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.app.AlertDialog;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;

public final class CLS755 implements CLS112 {
    public final String FLD1060;
    public final CLS111 FLD1061;
    public final Activity FLD1062;
    public final String FLD1063;
    public final int FLD1064;
    public final AlertDialog[] FLD1065;

    public CLS755(Activity activity0, String s, String s1, AlertDialog[] arr_alertDialog, CLS111 ᴵⁱ0, int v) {
        this.FLD1062 = activity0;
        this.FLD1060 = s;
        this.FLD1063 = s1;
        this.FLD1065 = arr_alertDialog;
        this.FLD1061 = ᴵⁱ0;
        this.FLD1064 = v;
    }

    @Override  // c.ˋﹳ.CLS112
    public final void MTH2288(Object[] arr_object) {
        CLS232.MTH3552(this.FLD1062, this.FLD1060, this.FLD1063, this.FLD1065, this.FLD1061, this.FLD1064, arr_object);
    }
}

