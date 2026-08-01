// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS79;
import b.ᵔʾ.CLS1227;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1040 implements CLS3 {
    public final Object FLD2207;
    public final int FLD2208;
    public final int FLD2209;
    public final String FLD2210;
    public final Activity FLD2211;
    public final ArrayList FLD2212;
    public final Object FLD2213;
    public final Object FLD2214;

    public CLS1040(Activity activity0, String s, HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0, int v, CLS369 ﾞᵎ0) {
        this.FLD2208 = 1;
        super();
        this.FLD2211 = activity0;
        this.FLD2210 = s;
        this.FLD2214 = hashMap0;
        this.FLD2213 = ˎᵢ0;
        this.FLD2212 = arrayList0;
        this.FLD2209 = v;
        this.FLD2207 = ﾞᵎ0;
    }

    public CLS1040(CLS1019 ˎʻ0, Activity activity0, String s, int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD2208 = 0;
        super();
        this.FLD2214 = ˎʻ0;
        this.FLD2211 = activity0;
        this.FLD2210 = s;
        this.FLD2209 = v;
        this.FLD2212 = arrayList0;
        this.FLD2213 = arrayList1;
        this.FLD2207 = arrayList2;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Object object0 = this.FLD2207;
        Object object1 = this.FLD2213;
        Object object2 = this.FLD2214;
        if(this.FLD2208 == 0) {
            ((CLS1019)object2).getClass();
            String s = CLS27.MTH889("add_wxid");
            CLS1227 ʽי0 = new CLS1227(((CLS1019)object2), this.FLD2210, this.FLD2209, this.FLD2212, ((ArrayList)object1), ((ArrayList)object0));
            CLS523.MTH7165(this.FLD2211, s, "", "", 1, ((CLS16)ʽי0));
            return;
        }
        String s1 = CLS27.MTH889("modify");
        CLS1227 ʽי1 = new CLS1227(((HashMap)object2), this.FLD2210, ((CLS79)object1), this.FLD2212, this.FLD2209, ((CLS369)object0), 9);
        CLS523.MTH7165(this.FLD2211, s1, "", this.FLD2210, 1, ((CLS16)ʽי1));
    }
}

