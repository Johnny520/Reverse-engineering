// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS366;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1526 implements CLS11 {
    public final CLS366 FLD4683;
    public final String FLD4684;
    public final ArrayList FLD4685;
    public final int FLD4686;
    public final CLS29 FLD4687;

    public CLS1526(CLS366 ﾞᐧ0, int v, ArrayList arrayList0, CLS29 ˎᵢ0, String s) {
        this.FLD4683 = ﾞᐧ0;
        this.FLD4686 = v;
        this.FLD4685 = arrayList0;
        this.FLD4687 = ˎᵢ0;
        this.FLD4684 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS366 ﾞᐧ0 = this.FLD4683;
            CLS78 ˊﾞ0 = (CLS78)ﾞᐧ0.getItem(this.FLD4686);
            this.FLD4685.remove(ˊﾞ0);
            HashSet hashSet0 = new HashSet();
            Iterator iterator0 = this.FLD4685.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                hashSet0.add("");
            }
            String s = TextUtils.join(";", hashSet0);
            this.FLD4687.MTH922(s, "momentscontainer_" + this.FLD4684);
            ﾞᐧ0.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

