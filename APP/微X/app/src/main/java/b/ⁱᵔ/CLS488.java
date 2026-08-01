// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ⁱʾ.CLS338;

public final class CLS488 implements AdapterView.OnItemClickListener {
    public final int FLD4797;
    public final CLS338 FLD4798;

    public CLS488(CLS338 יᐧ0, int v) {
        this.FLD4797 = v;
        this.FLD4798 = יᐧ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS338 יᐧ0 = this.FLD4798;
        switch(this.FLD4797) {
            case 0: {
                יᐧ0.MTH5127(v);
                return;
            }
            case 1: {
                יᐧ0.MTH5127(v);
                return;
            }
            default: {
                יᐧ0.MTH5127(v);
            }
        }
    }
}

