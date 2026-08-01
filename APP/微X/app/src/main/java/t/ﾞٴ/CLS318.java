// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import t.ˆʿ.CLS43;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;

public final class CLS318 implements CLS136 {
    public final int FLD1050;
    public final CLS123 FLD1051;

    public CLS318(CLS123 ʾᵢ0, int v) {
        this.FLD1050 = v;
        this.FLD1051 = ʾᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS123 ʾᵢ0 = this.FLD1051;
        switch(this.FLD1050) {
            case 0: {
                ʾᵢ0.MTH1999("dismissThemesSettings", new Object[0]);
                ʾᵢ0.MTH2004("core", "recreate_launcherui", new Object[0]);
                return;
            }
            case 1: {
                try {
                    if(CLS43.FLD494 != null && CLS43.FLD494.isShowing()) {
                        CLS43.FLD494.dismiss();
                    }
                }
                catch(Throwable unused_ex) {
                }
                ʾᵢ0.MTH1999("dismissThemesSettings", new Object[0]);
                ʾᵢ0.MTH2004("core", "recreate_launcherui", new Object[0]);
                CLS318 יᐧ0 = new CLS318(ʾᵢ0, 2);
                CLS137.FLD972.MTH2139(((CLS136)יᐧ0), 1000L);
                return;
            }
            default: {
                ʾᵢ0.MTH1999("showThemesSettings", new Object[0]);
            }
        }
    }
}

