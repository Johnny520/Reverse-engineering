// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS71;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS456 implements AdapterView.OnItemLongClickListener {
    public final int FLD4461;
    public final ArrayList FLD4462;
    public final Activity FLD4463;
    public final CLS369 FLD4464;
    public final CLS29 FLD4465;

    public CLS456(int v, Activity activity0, CLS369 ﾞᵎ0, CLS29 ˎᵢ0, ArrayList arrayList0) {
        this.FLD4461 = v;
        this.FLD4464 = ﾞᵎ0;
        this.FLD4463 = activity0;
        this.FLD4465 = ˎᵢ0;
        this.FLD4462 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS369 ﾞᵎ0 = this.FLD4464;
        switch(this.FLD4461) {
            case 0: {
                Object object0 = ﾞᵎ0.getItem(v);
                CLS71 ˆٴ1 = new CLS71(this.FLD4463, null);
                ˆٴ1.MTH1572("delete", ((CLS3)new CLS1469(this.FLD4463, this.FLD4465, ((String)object0), this.FLD4462, ﾞᵎ0, 0)));
                ˆٴ1.MTH1572("modify", ((CLS3)new CLS1571(this.FLD4463, this.FLD4465, ((String)object0), this.FLD4462, ﾞᵎ0, v)));
                ˆٴ1.MTH1573();
                return true;
            }
            case 1: {
                String s1 = (String)ﾞᵎ0.getItem(v);
                CLS71 ˆٴ2 = new CLS71(this.FLD4463, null);
                ˆٴ2.MTH1572("delete", ((CLS3)new CLS1469(this.FLD4463, this.FLD4465, s1, this.FLD4462, ﾞᵎ0, 1)));
                ˆٴ2.MTH1572("modify", ((CLS3)new CLS1469(this.FLD4463, s1, this.FLD4465, this.FLD4462, ﾞᵎ0, 2)));
                ˆٴ2.MTH1573();
                return true;
            }
            default: {
                String s = (String)ﾞᵎ0.getItem(v);
                CLS71 ˆٴ0 = new CLS71(this.FLD4463, null);
                ˆٴ0.MTH1572("delete", ((CLS3)new CLS1469(this.FLD4463, this.FLD4465, s, this.FLD4462, ﾞᵎ0, 4)));
                ˆٴ0.MTH1572("modify", ((CLS3)new CLS1469(this.FLD4463, s, this.FLD4465, this.FLD4462, ﾞᵎ0, 5)));
                ˆٴ0.MTH1573();
                return true;
            }
        }
    }
}

