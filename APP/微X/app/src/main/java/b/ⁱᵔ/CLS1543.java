// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1543 implements CLS3 {
    public final int FLD4792;
    public final String FLD4793;
    public final Activity FLD4794;
    public final HashMap FLD4795;
    public final CLS1620 FLD4796;

    public CLS1543(int v, Activity activity0, CLS1620 ˊˏ0, String s, HashMap hashMap0) {
        this.FLD4792 = v;
        this.FLD4795 = hashMap0;
        this.FLD4794 = activity0;
        this.FLD4796 = ˊˏ0;
        this.FLD4793 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        HashMap hashMap0 = this.FLD4795;
        if(this.FLD4792 == 0) {
            Activity activity0 = this.FLD4794;
            CLS1620 ˊˏ0 = this.FLD4796;
            String s = this.FLD4793;
            if(!hashMap0.isEmpty()) {
                CLS523.MTH7163(false, activity0, CLS27.MTH889("delete_tag"), new ArrayList(hashMap0.keySet()), ((CLS7)new CLS1540(1, activity0, ˊˏ0, s, hashMap0)));
            }
            return;
        }
        Activity activity1 = this.FLD4794;
        CLS1620 ˊˏ1 = this.FLD4796;
        String s1 = this.FLD4793;
        if(!hashMap0.isEmpty()) {
            CLS523.MTH7163(false, activity1, CLS27.MTH889("rename_tag"), new ArrayList(hashMap0.keySet()), ((CLS7)new CLS1540(0, activity1, ˊˏ1, s1, hashMap0)));
        }
    }
}

