// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import java.util.HashMap;
import t.ʾᵢ.CLS216;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS127.CLS126;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS330 extends CLS155 {
    public final HashMap FLD1083;

    public CLS330(CLS150 ʻˑ0) {
        super(ʻˑ0);
        this.FLD1083 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // t.ﾞٴ.CLS155
    public final void MTH2307(CLS123 ʾᵢ0) {
        ʾᵢ0.MTH2002("settings.config", ((CLS138)new CLS313(this, 0)));
        ʾᵢ0.MTH2009("settings.keywords", ((CLS126)new CLS325(((CLS155)this), 0)));
        ʾᵢ0.MTH2002("showThemesSettings", ((CLS138)new CLS313(this, 1)));
        ʾᵢ0.MTH2002("dismissThemesSettings", ((CLS138)new CLS313(this, 2)));
        ʾᵢ0.MTH2009("settings.options", ((CLS126)new CLS320(0)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // t.ﾞٴ.CLS155
    public final void MTH2308() {
        CLS216 ˎﾞ0 = new CLS216(CLS133.MTH2099("themes_settings"), "themes_settings");
        this.FLD1083.put("themes_settings", ˎﾞ0);
    }
}

