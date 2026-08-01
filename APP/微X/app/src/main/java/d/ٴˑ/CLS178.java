// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import d.יʻ.CLS69;
import d.ᐧˈ.CLS197;
import d.ⁱٴ.CLS121;

public final class CLS178 implements CLS121 {
    public final CLS188 FLD370;
    public final CLS179 FLD371;

    public CLS178(CLS179 ʾﹶ0, CLS188 ᴵʾ0) {
        this.FLD371 = ʾﹶ0;
        this.FLD370 = ᴵʾ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS121
    public final void MTH1171(Object object0) {
        CLS179 ʾﹶ0 = this.FLD371;
        ʾﹶ0.getClass();
        ʾﹶ0.FLD377 = (long)(((Long)object0));
        String s = ʾﹶ0.MTH875();
        this.FLD370.MTH1179(s);
        CLS78 ʾﹶ$ᐧי0 = ʾﹶ0.FLD381;
        if(ʾﹶ$ᐧי0 != null) {
            try {
                long v = ʾﹶ0.FLD377;
                ((CLS197)ʾﹶ$ᐧי0).FLD591.getClass();
                ((CLS197)ʾﹶ$ᐧי0).FLD591.FLD585.MTH741(((int)v), "temp_disable_menu_time");
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
    }
}

