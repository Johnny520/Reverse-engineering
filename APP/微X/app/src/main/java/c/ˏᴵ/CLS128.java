// Decompiled by JEB v5.42.0.202606242140

package c.ˏᴵ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import c.ᴵˉ.CLS594;

public final class CLS128 implements AdapterView.OnItemClickListener {
    public final Activity FLD554;
    public final CLS126 FLD555;
    public final CLS594 FLD556;

    public CLS128(CLS126 ᵎˑ0, CLS594 ʾᐧ0, Activity activity0) {
        this.FLD555 = ᵎˑ0;
        this.FLD556 = ʾᐧ0;
        this.FLD554 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.FLD555.MTH1946(this.FLD556, this.FLD554, adapterView0, view0, v, v1);
    }
}

