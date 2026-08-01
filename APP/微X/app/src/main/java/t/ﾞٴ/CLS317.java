// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.graphics.drawable.BitmapDrawable;
import t.ˊﾞ.CLS102;
import t.ـˏ.CLS115;
import t.ᵔʾ.CLS133;

public final class CLS317 implements CLS115 {
    public final CLS102 FLD1046;
    public final CLS309 FLD1047;

    public CLS317(CLS309 ʽﹶ0, CLS102 יﹳ0) {
        this.FLD1047 = ʽﹶ0;
        this.FLD1046 = יﹳ0;
        super();
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    @Override  // t.ـˏ.CLS115
    public final BitmapDrawable MTH1901() {
        return this.FLD1046.MTH1818("TabLayoutIconEnable", false) ? this.FLD1046.MTH1820(((CLS155)this.FLD1047).MTH2306(), "TabLayoutMeIcon.png", true) : null;
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    @Override  // t.ـˏ.CLS115
    public final String MTH1902() {
        return this.FLD1046.MTH1818("TabLayoutTextEnable", true) ? this.FLD1046.MTH1804("TabLayoutTextMe", CLS133.MTH2099("TabLabelMe")) : null;
    }
}

