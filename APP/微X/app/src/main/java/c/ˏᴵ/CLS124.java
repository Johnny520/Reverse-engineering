// Decompiled by JEB v5.42.0.202606242140

package c.ˏᴵ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import c.ᴵˉ.CLS594;

public final class CLS124 implements AdapterView.OnItemClickListener {
    public final Activity FLD523;
    public final CLS119 FLD524;
    public final CLS594 FLD525;

    public CLS124(CLS119 ʻᵔ0, CLS594 ʾᐧ0, Activity activity0) {
        this.FLD524 = ʻᵔ0;
        this.FLD525 = ʾᐧ0;
        this.FLD523 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.FLD524.MTH1771(this.FLD525, this.FLD523, adapterView0, view0, v, v1);
    }
}

