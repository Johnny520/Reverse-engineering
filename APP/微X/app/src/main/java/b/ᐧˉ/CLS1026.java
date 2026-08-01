// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import b.ʻˑ.CLS12;

public final class CLS1026 implements CLS12 {
    public final int FLD2115;
    public final String FLD2116;
    public final CLS1173 FLD2117;

    public CLS1026(CLS1173 ᵢᵢ0, String s, int v) {
        this.FLD2115 = v;
        this.FLD2117 = ᵢᵢ0;
        this.FLD2116 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String s = this.FLD2116;
        CLS1173 ᵢᵢ0 = this.FLD2117;
        if(this.FLD2115 == 0) {
            ᵢᵢ0.getClass();
            Integer integer0 = ((ContentValues)object0).getAsInteger("startH");
            Integer integer1 = ((ContentValues)object0).getAsInteger("startM");
            String s1 = CLS182.MTH3475(4101060454002774837L, CLS182.MTH3483(s));
            ᵢᵢ0.FLD2151.MTH922(integer0 + ":" + integer1, s1);
            return;
        }
        ᵢᵢ0.getClass();
        Integer integer2 = ((ContentValues)object0).getAsInteger("endH");
        Integer integer3 = ((ContentValues)object0).getAsInteger("endM");
        String s2 = CLS182.MTH3475(4101059762513040181L, CLS182.MTH3483(s));
        ᵢᵢ0.FLD2151.MTH922(integer2 + ":" + integer3, s2);
    }
}

