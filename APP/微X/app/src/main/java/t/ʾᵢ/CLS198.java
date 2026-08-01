// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;

public final class CLS198 implements CLS136 {
    public final int FLD165;
    public final String FLD166;
    public final CLS216 FLD167;

    public CLS198(CLS216 ˎﾞ0, String s, int v) {
        this.FLD165 = v;
        this.FLD167 = ˎﾞ0;
        this.FLD166 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        String s = this.FLD166;
        CLS216 ˎﾞ0 = this.FLD167;
        if(this.FLD165 == 0) {
            CLS123.FLD912.MTH2010("core", "cloneModuleFile", new Object[]{10, ˎﾞ0.FLD236.FLD773, s});
            CLS117.FLD842.MTH1908();
            CLS198 ˊʼ0 = new CLS198(ˎﾞ0, s, 1);
            CLS137.FLD972.MTH2145(((CLS136)ˊʼ0));
            return;
        }
        ˎﾞ0.FLD235.MTH2365(s);
    }
}

