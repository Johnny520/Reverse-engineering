// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.widget.LinearLayout;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS165;
import t.ﾞᐧ.CLS337;

public final class CLS275 implements CLS144 {
    public final Activity FLD443;
    public final boolean FLD444;
    public final String FLD445;

    public CLS275(Activity activity0, String s) {
        this.FLD443 = activity0;
        this.FLD445 = s;
        this.FLD444 = false;
    }

    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        Activity activity0 = this.FLD443;
        CLS337 ˎᵢ0 = new CLS337(activity0);
        String s = this.FLD445;
        ˎᵢ0.MTH2172(s);
        ˎᵢ0.FLD1165 = false;
        CLS43.MTH1423(linearLayout0, ((CLS145)ˎᵢ0), true);
        if(this.FLD444) {
            ˎᵢ0.MTH2387(new CLS165(activity0, s));
        }
    }
}

