// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS412;

public final class CLS646 implements CLS16 {
    public final int FLD623;
    public final String FLD624;
    public final CLS864 FLD625;
    public final String FLD626;

    public CLS646(CLS864 ﹶ0, String s, String s1, int v) {
        this.FLD623 = v;
        this.FLD625 = ﹶ0;
        this.FLD624 = s;
        this.FLD626 = s1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        String s1 = this.FLD626;
        String s2 = this.FLD624;
        CLS864 ﹶ0 = this.FLD625;
        if(this.FLD623 == 0) {
            ﹶ0.FLD1447.MTH3027(0xFFFF00FF);
            ﹶ0.MTH2995(s2, s1);
            int v = TextUtils.isEmpty(s) ? 90000 : Integer.parseInt(s) * 1000;
            CLS21.FLD76.MTH818("setAutoRecallDelay", new Object[]{v});
            CLS412.MTH6004(CLS27.MTH889("enable_autorecallmode"));
            return;
        }
        ﹶ0.FLD1447.MTH3027(0xFFFF0000);
        ﹶ0.MTH2995(s2, s1);
        CLS412.MTH6004(CLS27.MTH889("enable_encryptedmode"));
        if(!TextUtils.isEmpty(s)) {
            ﹶ0.FLD1445.MTH922(s, "encrypted_tag");
        }
    }
}

