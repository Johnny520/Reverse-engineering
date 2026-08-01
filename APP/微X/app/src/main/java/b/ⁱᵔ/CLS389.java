// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS71;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS389 implements AdapterView.OnItemLongClickListener {
    public final int FLD3658;
    public final CLS369 FLD3659;
    public final Activity FLD3660;
    public final ArrayList FLD3661;

    public CLS389(Activity activity0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0) {
        this.FLD3658 = v;
        this.FLD3660 = activity0;
        this.FLD3659 = ﾞᵎ0;
        this.FLD3661 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        ArrayList arrayList0 = this.FLD3661;
        CLS369 ﾞᵎ0 = this.FLD3659;
        Activity activity0 = this.FLD3660;
        if(this.FLD3658 == 0) {
            try {
                CLS71 ˆٴ0 = new CLS71(activity0, null);
                ˆٴ0.MTH1572("modify", ((CLS3)new CLS1591(ﾞᵎ0, v, activity0, arrayList0)));
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS1591(activity0, arrayList0, v, ﾞᵎ0)));
                ˆٴ0.MTH1573();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return true;
        }
        CLS523.MTH7142(activity0, ((CLS11)new CLS1498(v, ﾞᵎ0, arrayList0)));
        return true;
    }
}

