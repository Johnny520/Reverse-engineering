// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS182;
import d.ⁱٴ.CLS120;
import d.ⁱٴ.CLS125;
import java.util.LinkedHashMap;

public final class CLS146 implements CLS8 {
    public final ListAdapter FLD130;
    public final LinkedHashMap FLD131;
    public final Activity FLD132;
    public final CLS120 FLD133;
    public final boolean FLD134;

    public CLS146(Activity activity0, BaseAdapter baseAdapter0, boolean z, CLS120 ˑʽ0, LinkedHashMap linkedHashMap0) {
        this.FLD132 = activity0;
        this.FLD130 = baseAdapter0;
        this.FLD134 = z;
        this.FLD133 = ˑʽ0;
        this.FLD131 = linkedHashMap0;
    }

    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        CLS181 ˆـ0 = new CLS181(this.FLD132);
        ˆـ0.MTH894(this.FLD130);
        ˆـ0.MTH893(new CLS41(this.FLD134, this.FLD133, this.FLD130, this.FLD131));
        CLS182 ˆᐧ0 = new CLS182(this.FLD132);
        ˆᐧ0.MTH907(((CLS125)ˆـ0));
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(3));
    }
}

