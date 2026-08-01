// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ˈˈ.CLS91;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;

public final class CLS988 implements CLS11 {
    public final CLS1622 FLD1961;
    public final CLS210 FLD1962;
    public final int FLD1963;
    public final CLS1622 FLD1964;
    public final Activity FLD1965;

    public CLS988(int v, Activity activity0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS210 ˋʼ0) {
        this.FLD1962 = ˋʼ0;
        this.FLD1961 = ˑٴ0;
        this.FLD1964 = ˑٴ1;
        this.FLD1963 = v;
        this.FLD1965 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        public final class CLS987 implements CLS11 {
            public final CLS91 FLD1959;
            public final CLS988 FLD1960;

            public CLS987(CLS91 ᵔʾ0) {
                this.FLD1959 = ᵔʾ0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS210.MTH3746(CLS988.this.FLD1962, this.FLD1959);
            }
        }

        CLS1622 ˑٴ0 = this.FLD1961;
        CLS1622 ˑٴ1 = this.FLD1964;
        CLS210 ˋʼ0 = this.FLD1962;
        ˋʼ0.FLD2004 = ˑٴ0.MTH7285() + "|" + ˑٴ1.MTH7285();
        ˋʼ0.FLD2005 = ˋʼ0.FLD2012.MTH7444();
        int v = this.FLD1963;
        if(v == -1) {
            if(TextUtils.isEmpty(ˑٴ0.MTH7285()) && TextUtils.isEmpty(ˑٴ1.MTH7285())) {
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
        if(TextUtils.isEmpty(ˑٴ0.MTH7285()) && TextUtils.isEmpty(ˑٴ1.MTH7285())) {
            CLS987 ˊʿ$ˆٴ0 = new CLS987(this, ᵔʾ1);
            CLS523.MTH7142(this.FLD1965, ((CLS11)ˊʿ$ˆٴ0));
            return;
        }
        CLS210.MTH3748(ˋʼ0, ᵔʾ1);
    }
}

