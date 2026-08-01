// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import b.ʾᵢ.CLS27;

public final class CLS542 implements AdapterView.OnItemSelectedListener {
    public final CLS533 FLD5325;
    public final CLS534 FLD5326;

    public CLS542(CLS534 ˈˈ0, CLS533 ˈˈ$ᵔʾ0) {
        this.FLD5326 = ˈˈ0;
        this.FLD5325 = ˈˈ$ᵔʾ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        try {
            CLS534 ˈˈ0 = this.FLD5326;
            int v2 = ˈˈ0.FLD5197 + 1;
            ˈˈ0.FLD5197 = v2;
            if(v2 <= 1 || (ˈˈ0.FLD5195 == null || ˈˈ0.FLD5195.isEmpty())) {
                return;
            }
            String s = (String)ˈˈ0.FLD5195.get(v);
            ˈˈ0.FLD5194 = v;
            CLS533 ˈˈ$ᵔʾ0 = this.FLD5325;
            if(ˈˈ$ᵔʾ0 != null) {
                ˈˈ$ᵔʾ0.MTH7225(v, s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

