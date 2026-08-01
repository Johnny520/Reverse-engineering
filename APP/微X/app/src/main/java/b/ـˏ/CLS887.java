// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.text.TextUtils;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;

public class CLS887 implements CLS169 {
    public String FLD1597;
    public int FLD1598;

    public CLS887() {
        this.FLD1598 = -1;
    }

    public CLS887(String s) {
        this.FLD1598 = -1;
        this.FLD1597 = s;
    }

    @Override  // b.ـˏ.CLS169
    public int MTH3228() {
        return 1;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    @Override  // b.ـˏ.CLS169
    public void MTH3230(String s) {
        if(TextUtils.isEmpty(this.FLD1597)) {
            return;
        }
        CLS466.MTH6542(s, this.FLD1597);
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return !TextUtils.isEmpty(this.FLD1597);
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1598;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1598 = v;
    }
}

