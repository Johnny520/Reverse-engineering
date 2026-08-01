// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ⁱʾ.CLS1266;

public final class CLS493 implements AdapterView.OnItemLongClickListener {
    public final int FLD4841;
    public final Activity FLD4842;
    public final CLS1266 FLD4843;
    public final String FLD4844;

    public CLS493(CLS1266 ʾᵢ0, Activity activity0, String s, int v) {
        this.FLD4841 = v;
        this.FLD4843 = ʾᵢ0;
        this.FLD4842 = activity0;
        this.FLD4844 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s = this.FLD4844;
        Activity activity0 = this.FLD4842;
        if(this.FLD4841 == 0) {
            CLS372.MTH5401(activity0, s, "");
            return true;
        }
        CLS372.MTH5401(activity0, s, "");
        return true;
    }
}

