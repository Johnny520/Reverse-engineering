// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.widget.LinearLayout;
import org.json.JSONObject;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS64.CLS62;
import t.ˆٴ.CLS64;
import t.ˈˊ.CLS88.CLS87;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS174.CLS173;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS333.CLS161;
import t.ﾞᐧ.CLS333;
import t.ﾞᐧ.CLS336.CLS166;

public final class CLS297 implements CLS54, CLS87, CLS136, CLS166, CLS173, CLS176 {
    public final int FLD914;
    public final Object FLD915;

    public CLS297(Object object0, int v) {
        this.FLD914 = v;
        this.FLD915 = object0;
        super();
    }

    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        Object object0 = this.FLD915;
        if(this.FLD914 == 0) {
            CLS143 ˆٴ0 = (CLS143)object0;
            if(ˆٴ0 != null) {
                try {
                    ˆٴ0.MTH2169();
                    return;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            return;
        }
        ((LinearLayout)object0).setBackgroundColor(CLS46.MTH1448());
    }

    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        CLS161 ʽﹶ$ˆٴ0 = ((CLS333)this.FLD915).FLD1117;
        if(ʽﹶ$ˆٴ0 != null) {
            ʽﹶ$ˆٴ0.MTH2332(linearLayout0);
        }
    }

    public final void MTH2020(String s) {
        ((CLS64)this.FLD915).getClass();
        new CLS62(((CLS64)this.FLD915)).filter(s);
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞᐧ.CLS177$CLS176
    public final void MTH2442(String s) {
        JSONObject jSONObject0 = (JSONObject)this.FLD915;
        try {
            jSONObject0.put("n", s);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

