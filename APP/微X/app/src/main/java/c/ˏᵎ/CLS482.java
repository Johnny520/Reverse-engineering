// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import c.ﹶˆ.CLS344;
import java.util.LinkedHashMap;

public final class CLS482 implements CLS136 {
    public final boolean FLD563;
    public final LinkedHashMap FLD564;
    public final CLS344 FLD565;
    public final Activity FLD566;
    public final ListAdapter FLD567;

    public CLS482(Activity activity0, ListAdapter listAdapter0, boolean z, CLS344 ᵔʼ0, LinkedHashMap linkedHashMap0) {
        this.FLD566 = activity0;
        this.FLD567 = listAdapter0;
        this.FLD563 = z;
        this.FLD565 = ᵔʼ0;
        this.FLD564 = linkedHashMap0;
    }

    @Override  // c.ˏᵎ.CLS137$CLS136
    public final void MTH2028(LinearLayout linearLayout0) {
        CLS144.MTH2193(this.FLD566, this.FLD567, this.FLD563, this.FLD565, this.FLD564, linearLayout0);
    }
}

