// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS69;
import b.ⁱᵔ.CLS462;
import java.io.File;

public final class CLS687 implements CLS7, CLS39 {
    public final CLS629 FLD769;
    public final Object FLD770;

    public CLS687(CLS629 ʻˋ0, Object object0) {
        this.FLD769 = ʻˋ0;
        this.FLD770 = object0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        this.FLD769.getClass();
        String s = new CLS69(((File)this.FLD770)).MTH1563();
        CLS462.MTH6488(false, ((CLS140)this.FLD769).MTH3042(), s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        int v;
        CLS629 ʻˋ0 = this.FLD769;
        ʻˋ0.getClass();
        try {
            switch(("" + object0).hashCode()) {
                case 0xD7A392C5: {
                    v = ("" + object0).equals("forward") ? 0 : -1;
                    break;
                }
                case 0xA8FB9F3: {
                    v = ("" + object0).equals("mass_send") ? 2 : -1;
                    break;
                }
                case 0x62838E69: {
                    v = ("" + object0).equals("forward_to_moments") ? 1 : -1;
                    break;
                }
                default: {
                    v = -1;
                }
            }
            Object object1 = this.FLD770;
            switch(v) {
                case 0: {
                    ʻˋ0.MTH2039(object1);
                    return;
                }
                case 1: {
                    CLS629.MTH2036(object1);
                    return;
                }
                case 2: {
                    ʻˋ0.MTH2040(object1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

