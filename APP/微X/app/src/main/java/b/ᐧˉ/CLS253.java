// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS17;
import b.ˈˈ.CLS78;
import b.ˑٴ.CLS783;
import b.ⁱʾ.CLS350;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;

public final class CLS253 implements AdapterView.OnItemClickListener {
    public final int FLD2628;
    public final Activity FLD2629;
    public final CLS350 FLD2630;
    public final ArrayList FLD2631;

    public CLS253(int v, CLS350 ᐧⁱ0, Activity activity0, ArrayList arrayList0) {
        this.FLD2628 = v;
        this.FLD2630 = ᐧⁱ0;
        this.FLD2629 = activity0;
        this.FLD2631 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD2629;
        if(this.FLD2628 == 1) {
            CLS78 ˊﾞ0 = (CLS78)this.FLD2630.getItem(v);
            CLS523.MTH7160(activity0, "", ((CLS17)new CLS783(activity0, "" + "\n" + "", false)), null);
        }
        CLS412.MTH6013(activity0, "");
        CLS412.MTH6017(activity0, "");
    }
}

