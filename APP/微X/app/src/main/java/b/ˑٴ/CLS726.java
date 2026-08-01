// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᵔʾ.CLS1259;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import java.util.ArrayList;

public final class CLS726 implements CLS3 {
    public final int FLD884;
    public final CLS1620 FLD885;
    public final Activity FLD886;
    public final CLS881 FLD887;
    public final ArrayList FLD888;

    public CLS726(CLS881 ﾞˏ0, Activity activity0, ArrayList arrayList0, CLS1620 ˊˏ0, int v) {
        this.FLD884 = v;
        this.FLD887 = ﾞˏ0;
        this.FLD886 = activity0;
        this.FLD888 = arrayList0;
        this.FLD885 = ˊˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1620 ˊˏ0 = this.FLD885;
        ArrayList arrayList0 = this.FLD888;
        CLS881 ﾞˏ0 = this.FLD887;
        if(this.FLD884 == 0) {
            ﾞˏ0.getClass();
            String s = CLS27.MTH889("add");
            String s1 = CLS31.MTH1012("watermark_");
            CLS1259 ⁱᵔ0 = new CLS1259(ﾞˏ0, arrayList0, ˊˏ0, 10);
            CLS523.MTH7165(this.FLD886, s, "", s1, 1, ((CLS16)ⁱᵔ0));
            return;
        }
        ﾞˏ0.getClass();
        CLS778 ᐧʿ0 = new CLS778(ﾞˏ0, arrayList0, ˊˏ0);
        CLS523.MTH7142(this.FLD886, ((CLS11)ᐧʿ0));
    }
}

