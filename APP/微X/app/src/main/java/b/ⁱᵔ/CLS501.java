// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ⁱʾ.CLS1266;

public final class CLS501 implements AdapterView.OnItemLongClickListener {
    public final int FLD4944;
    public final Activity FLD4945;
    public final CLS1266 FLD4946;

    public CLS501(CLS1266 ʾᵢ0, Activity activity0, int v) {
        this.FLD4944 = v;
        this.FLD4946 = ʾᵢ0;
        this.FLD4945 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Activity activity0 = this.FLD4945;
        switch(this.FLD4944) {
            case 0: {
                CLS372.MTH5416(activity0, "");
                return true;
            }
            case 1: {
                CLS372.MTH5416(activity0, "");
                return true;
            }
            default: {
                CLS372.MTH5416(activity0, "");
                return true;
            }
        }
    }
}

