// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import c.ˋﹳ.CLS110;
import java.util.LinkedHashMap;

public final class CLS752 implements CLS195 {
    public final ListAdapter FLD1041;
    public final LinkedHashMap FLD1042;
    public final Activity FLD1043;
    public final boolean FLD1044;
    public final CLS110 FLD1045;

    public CLS752(Activity activity0, ListAdapter listAdapter0, boolean z, CLS110 ٴⁱ0, LinkedHashMap linkedHashMap0) {
        this.FLD1043 = activity0;
        this.FLD1041 = listAdapter0;
        this.FLD1044 = z;
        this.FLD1045 = ٴⁱ0;
        this.FLD1042 = linkedHashMap0;
    }

    @Override  // c.ـˉ.CLS197$CLS195
    public final void MTH3176(LinearLayout linearLayout0) {
        CLS258.MTH3812(this.FLD1043, this.FLD1041, this.FLD1044, this.FLD1045, this.FLD1042, linearLayout0);
    }
}

