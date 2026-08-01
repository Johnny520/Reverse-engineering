// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;

public final class CLS265 implements AdapterView.OnItemLongClickListener {
    public final Activity FLD1186;
    public final CLS218 FLD1187;

    public CLS265(CLS218 ˑٴ0, Activity activity0) {
        this.FLD1187 = ˑٴ0;
        this.FLD1186 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        return this.FLD1187.MTH3416(this.FLD1186, adapterView0, view0, v, v1);
    }
}

