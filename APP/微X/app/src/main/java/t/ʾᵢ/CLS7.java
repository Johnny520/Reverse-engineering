// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import t.ˆٴ.CLS73;
import t.ˊﾞ.CLS99;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;

public final class CLS7 implements AdapterView.OnItemLongClickListener {
    public final int FLD90;
    public final ArrayList FLD91;
    public final Activity FLD92;
    public final CLS216 FLD93;
    public final ArrayList FLD94;
    public final CLS144 FLD95;
    public final CLS73 FLD96;

    public CLS7(CLS216 ˎﾞ0, Activity activity0, ArrayList arrayList0, ArrayList arrayList1, CLS73 ﾞᐧ0, CLS144 ˊﾞ0, int v) {
        this.FLD90 = v;
        this.FLD93 = ˎﾞ0;
        this.FLD92 = activity0;
        this.FLD94 = arrayList0;
        this.FLD91 = arrayList1;
        this.FLD96 = ﾞᐧ0;
        this.FLD95 = ˊﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS144 ˊﾞ0 = this.FLD95;
        CLS216 ˎﾞ0 = this.FLD93;
        if(this.FLD90 == 0) {
            ˎﾞ0.getClass();
            CLS99 ˆٴ0 = new CLS99(this.FLD92);
            ˆٴ0.MTH1765("delete", ((CLS143)new CLS246(ˎﾞ0, this.FLD92, this.FLD94, v, this.FLD91, this.FLD96, 1)));
            ˆٴ0.MTH1765("move_to", ((CLS143)new CLS185(this.FLD92, ˊﾞ0, v, 1)));
            ˆٴ0.MTH1766();
            return true;
        }
        ˎﾞ0.getClass();
        CLS99 ˆٴ1 = new CLS99(this.FLD92);
        ˆٴ1.MTH1765("delete", ((CLS143)new CLS246(ˎﾞ0, this.FLD92, this.FLD94, v, this.FLD91, this.FLD96, 0)));
        ˆٴ1.MTH1765("move_to", ((CLS143)new CLS185(this.FLD92, ˊﾞ0, v, 0)));
        ˆٴ1.MTH1766();
        return true;
    }
}

