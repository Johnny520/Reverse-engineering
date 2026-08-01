// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import d.יʻ.CLS69;
import java.util.ArrayList;

public final class CLS84 implements AdapterView.OnItemSelectedListener {
    public final CLS83 FLD427;
    public final CLS81 FLD428;

    public CLS84(CLS83 ˈˈ0, CLS81 ˈˈ$יʻ0) {
        this.FLD427 = ˈˈ0;
        this.FLD428 = ˈˈ$יʻ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        CLS83 ˈˈ0 = this.FLD427;
        int v2 = ˈˈ0.FLD425 + 1;
        ˈˈ0.FLD425 = v2;
        if(v2 > 1) {
            ArrayList arrayList0 = ˈˈ0.FLD426;
            if(arrayList0 == null) {
                return;
            }
            try {
                if(arrayList0.isEmpty()) {
                    return;
                }
                String s = (String)arrayList0.get(v);
                CLS81 ˈˈ$יʻ0 = this.FLD428;
                if(ˈˈ$יʻ0 != null) {
                    ˈˈ$יʻ0.MTH921(s);
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView0) {
    }
}

