// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;

public final class CLS195 implements AdapterView.OnItemLongClickListener {
    public final CLS189 FLD822;
    public final Activity FLD823;

    public CLS195(CLS189 יᵎ0, Activity activity0) {
        this.FLD822 = יᵎ0;
        this.FLD823 = activity0;
    }

    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        return this.FLD822.MTH2784(this.FLD823, adapterView0, view0, v, v1);
    }
}

