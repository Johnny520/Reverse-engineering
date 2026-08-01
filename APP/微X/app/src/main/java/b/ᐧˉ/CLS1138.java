// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˈˈ.CLS91;
import b.ⁱᵔ.CLS523;

public final class CLS1138 implements CLS11 {
    public final int FLD2572;
    public final CLS210 FLD2573;
    public final Activity FLD2574;

    public CLS1138(int v, Activity activity0, CLS210 ˋʼ0) {
        this.FLD2573 = ˋʼ0;
        this.FLD2572 = v;
        this.FLD2574 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
        CLS210 ˋʼ0 = this.FLD2573;
        if(!TextUtils.isEmpty(ˋʼ0.FLD2008)) {
            ˋʼ0.FLD2002.MTH1252(ˋʼ0.FLD2008);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        public final class CLS1137 implements CLS11 {
            public final CLS91 FLD2570;
            public final CLS1138 FLD2571;

            public CLS1137(CLS91 ᵔʾ0) {
                this.FLD2570 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS210.MTH3746(CLS1138.this.FLD2573, this.FLD2570);
            }
        }

        CLS210 ˋʼ0 = this.FLD2573;
        ˋʼ0.FLD2004 = ˋʼ0.FLD2007.MTH7285();
        ˋʼ0.FLD2005 = ˋʼ0.FLD2012.MTH7444();
        int v = this.FLD2572;
        if(v == -1) {
            if(TextUtils.isEmpty(ˋʼ0.FLD2004)) {
                return;
            }
            String s = ˋʼ0.FLD2004;
            String s1 = ˋʼ0.FLD1998;
            CLS91 ᵔʾ0 = new CLS91(((int)ˋʼ0.FLD2012.MTH7444()), "", s, s1);
            ᵔʾ0.MTH1740(ˋʼ0.FLD2018);
            CLS210.MTH3747(ˋʼ0, ᵔʾ0);
            return;
        }
        CLS91 ᵔʾ1 = (CLS91)ˋʼ0.FLD2010.get(v);
        if(TextUtils.isEmpty(ˋʼ0.FLD2004)) {
            CLS1137 ᴵˑ$ˆٴ0 = new CLS1137(this, ᵔʾ1);
            CLS523.MTH7142(this.FLD2574, ((CLS11)ᴵˑ$ˆٴ0));
            return;
        }
        CLS210.MTH3748(ˋʼ0, ᵔʾ1);
    }
}

