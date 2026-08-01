// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.widget.LinearLayout;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS74;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;

public final class CLS152 implements CLS124 {
    public final String FLD172;
    public final Activity FLD173;
    public final boolean FLD174;

    public CLS152(Activity activity0, String s, boolean z) {
        this.FLD173 = activity0;
        this.FLD172 = s;
        this.FLD174 = z;
    }

    @Override  // d.ⁱٴ.CLS124
    public final void MTH1175(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        Activity activity0 = this.FLD173;
        CLS188 ᴵʾ0 = new CLS188(activity0);
        String s = this.FLD172;
        ᴵʾ0.MTH1181(s);
        ᴵʾ0.FLD531 = false;
        CLS45.MTH660(linearLayout0, ((CLS125)ᴵʾ0));
        if(this.FLD174) {
            ᴵʾ0.MTH1000(new CLS74(activity0, s, 2));
        }
    }
}

