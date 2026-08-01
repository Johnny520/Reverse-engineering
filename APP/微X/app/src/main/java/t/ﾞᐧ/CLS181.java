// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import t.ᵔʾ.CLS133;

public final class CLS181 implements AdapterView.OnItemSelectedListener {
    public final CLS176 FLD1300;
    public final CLS177 FLD1301;

    public CLS181(CLS177 ᐧˉ0, CLS176 ᐧˉ$ᵔʾ0) {
        this.FLD1301 = ᐧˉ0;
        this.FLD1300 = ᐧˉ$ᵔʾ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        CLS177 ᐧˉ0 = this.FLD1301;
        int v2 = ᐧˉ0.FLD1261 + 1;
        ᐧˉ0.FLD1261 = v2;
        if(v2 > 1) {
            ArrayList arrayList0 = ᐧˉ0.FLD1259;
            if(arrayList0 == null) {
                return;
            }
            try {
                if(arrayList0.isEmpty()) {
                    return;
                }
                String s = (String)arrayList0.get(v);
                ᐧˉ0.FLD1258 = v;
                CLS176 ᐧˉ$ᵔʾ0 = this.FLD1300;
                if(ᐧˉ$ᵔʾ0 != null) {
                    ᐧˉ$ᵔʾ0.MTH2442(s);
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

