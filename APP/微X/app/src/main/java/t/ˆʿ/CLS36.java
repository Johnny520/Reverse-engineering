// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import t.ʾᵢ.CLS216;
import t.ʾᵢ.CLS249;
import t.ˆٴ.CLS64;
import t.ˊﾞ.CLS107;
import t.ⁱʾ.CLS148;

public final class CLS36 implements AdapterView.OnItemClickListener {
    public final boolean FLD467;
    public final CLS64 FLD468;
    public final int[] FLD469;
    public final Dialog[] FLD470;
    public final CLS148 FLD471;

    public CLS36(boolean z, Dialog[] arr_dialog, int[] arr_v, CLS148 ﾞᐧ0, CLS64 ˆٴ0) {
        this.FLD467 = z;
        this.FLD470 = arr_dialog;
        this.FLD469 = arr_v;
        this.FLD471 = ﾞᐧ0;
        this.FLD468 = ˆٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        String s;
        Activity activity0;
        CLS216 ˎﾞ0;
        if(this.FLD467) {
            this.FLD470[0].dismiss();
        }
        this.FLD469[0] = v;
        CLS148 ﾞᐧ0 = this.FLD471;
        if(v != -1) {
            CLS107 ᵔʾ0 = (CLS107)this.FLD468.getItem(v);
            new ArrayList().add(ᵔʾ0);
            if(ﾞᐧ0 != null) {
                s = ᵔʾ0.FLD799;
                new String("");
                ˎﾞ0 = ((CLS249)ﾞᐧ0).FLD340;
                activity0 = ((CLS249)ﾞᐧ0).FLD339;
                ˎﾞ0.MTH1134(activity0, s);
            }
        }
        else if(ﾞᐧ0 != null) {
            ˎﾞ0 = ((CLS249)ﾞᐧ0).FLD340;
            activity0 = ((CLS249)ﾞᐧ0).FLD339;
            s = null;
            ˎﾞ0.MTH1134(activity0, s);
        }
    }
}

