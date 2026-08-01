// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import android.widget.LinearLayout;
import d.ٴˑ.CLS190;
import d.ⁱٴ.CLS124;
import d.ⁱٴ.CLS125;

public final class CLS166 implements CLS124 {
    public final String FLD247;
    public final CLS190 FLD248;
    public final String FLD249;
    public final int FLD250;

    public CLS166(CLS190 ᵎᐧ0, String s, int v, String s1) {
        this.FLD248 = ᵎᐧ0;
        this.FLD247 = s;
        this.FLD250 = v;
        this.FLD249 = s1;
    }

    @Override  // d.ⁱٴ.CLS124
    public final void MTH1175(Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS190 ᵎᐧ0 = this.FLD248;
        ᵎᐧ0.MTH1181(this.FLD247);
        ᵎᐧ0.MTH1019(this.FLD250);
        String s = this.FLD249;
        if(!TextUtils.isEmpty(s)) {
            ᵎᐧ0.MTH1020(s);
        }
        CLS45.MTH660(linearLayout0, ((CLS125)ᵎᐧ0));
    }
}

