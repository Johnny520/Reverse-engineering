// Decompiled by JEB v5.42.0.202606242140

package c.יᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import c.ٴˈ.CLS791;

public final class CLS165 implements AdapterView.OnItemClickListener {
    public final CLS791 FLD769;
    public final CLS169 FLD770;
    public final Activity FLD771;

    public CLS165(CLS169 ⁱʽ0, CLS791 ˋᵎ0, Activity activity0) {
        this.FLD770 = ⁱʽ0;
        this.FLD769 = ˋᵎ0;
        this.FLD771 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.FLD770.MTH2960(this.FLD769, this.FLD771, adapterView0, view0, v, v1);
    }
}

