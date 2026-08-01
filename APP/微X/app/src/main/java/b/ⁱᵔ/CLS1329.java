// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import java.util.ArrayList;

public final class CLS1329 implements CLS411 {
    public final ArrayList FLD3683;
    public final boolean FLD3684;
    public final ArrayList FLD3685;
    public final boolean FLD3686;
    public final String FLD3687;
    public final Activity FLD3688;

    public CLS1329(ArrayList arrayList0, boolean z, ArrayList arrayList1, String s, boolean z1, Activity activity0) {
        this.FLD3683 = arrayList0;
        this.FLD3686 = z;
        this.FLD3685 = arrayList1;
        this.FLD3687 = s;
        this.FLD3684 = z1;
        this.FLD3688 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS412$CLS411
    public final void MTH5992(int v) {
        try {
            ArrayList arrayList0 = this.FLD3683;
            ArrayList arrayList1 = this.FLD3685;
            String s = this.FLD3687;
            Activity activity0 = this.FLD3688;
            if(v < arrayList0.size()) {
                CLS78 ˊﾞ0 = (CLS78)arrayList0.get(v);
                if(CLS426.MTH6126("")) {
                    CLS66.MTH1436("", s);
                }
                else {
                    CLS66.MTH1507("");
                    if(this.FLD3686) {
                        arrayList1.add(ˊﾞ0);
                    }
                }
                if(!this.FLD3684) {
                    CLS412.MTH6014(activity0, String.format(CLS27.MTH889("delete_contact"), ""));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

