// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.app.Dialog;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS182;
import d.ᐧˈ.CLS205;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS125;
import java.util.LinkedHashMap;

public final class CLS148 implements CLS8 {
    public final CLS120 FLD143;
    public final LinkedHashMap FLD144;
    public final String FLD145;
    public final boolean FLD146;
    public final CLS120 FLD147;
    public final Activity FLD148;
    public final ListAdapter FLD149;
    public final boolean FLD150;
    public final Dialog[] FLD151;

    public CLS148(Activity activity0, String s, CLS110 ٴˑ0, Dialog[] arr_dialog, CLS205 ⁱٴ0, LinkedHashMap linkedHashMap0) {
        this.FLD148 = activity0;
        this.FLD145 = s;
        this.FLD150 = true;
        this.FLD149 = ٴˑ0;
        this.FLD146 = false;
        this.FLD151 = arr_dialog;
        this.FLD147 = ⁱٴ0;
        this.FLD144 = linkedHashMap0;
        this.FLD143 = null;
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        CLS181 ˆـ0 = new CLS181(this.FLD148);
        ˆـ0.MTH1179(this.FLD145);
        ˆـ0.FLD403.setScrollbarFadingEnabled(this.FLD150);
        ˆـ0.MTH894(this.FLD149);
        ˆـ0.MTH893(new CLS42(this.FLD146, this.FLD151, this.FLD147, this.FLD149, this.FLD144));
        CLS14 ʽˉ0 = new CLS14(this.FLD143, this.FLD149, this.FLD144);
        ˆـ0.FLD395 = ʽˉ0;
        ˆـ0.FLD403.setOnItemLongClickListener(ʽˉ0);
        CLS182 ˆᐧ0 = new CLS182(this.FLD148);
        ˆᐧ0.MTH907(((CLS125)ˆـ0));
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(3));
    }
}

