// Decompiled by JEB v5.42.0.202606242140

package c.יᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import c.ٴˈ.CLS791;

public final class CLS168 implements AdapterView.OnItemClickListener {
    public final CLS791 FLD800;
    public final CLS157 FLD801;
    public final Activity FLD802;

    public CLS168(CLS157 ʻˊ0, CLS791 ˋᵎ0, Activity activity0) {
        this.FLD801 = ʻˊ0;
        this.FLD800 = ˋᵎ0;
        this.FLD802 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.FLD801.MTH2811(this.FLD800, this.FLD802, adapterView0, view0, v, v1);
    }
}

