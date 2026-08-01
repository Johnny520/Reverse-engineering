// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ᵔʾ.CLS1257;

public final class CLS1602 implements CLS3 {
    public final int FLD5068;
    public final boolean FLD5069;
    public final CLS29 FLD5070;
    public final Activity FLD5071;
    public final String FLD5072;

    public CLS1602(Activity activity0, CLS29 ˎᵢ0, String s, boolean z, int v) {
        this.FLD5068 = v;
        this.FLD5071 = activity0;
        this.FLD5070 = ˎᵢ0;
        this.FLD5072 = s;
        this.FLD5069 = z;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        boolean z = this.FLD5069;
        String s = this.FLD5072;
        CLS29 ˎᵢ0 = this.FLD5070;
        if(this.FLD5068 == 0) {
            CLS1401 ˉʾ0 = new CLS1401(this.FLD5071, ˎᵢ0, s, z);
            CLS523.MTH7142(this.FLD5071, ((CLS11)ˉʾ0));
            return;
        }
        String s1 = CLS27.MTH889("modify");
        String s2 = ˎᵢ0.MTH925(s, "");
        CLS1257 ⁱˉ0 = new CLS1257(ˎᵢ0, s, z, this.FLD5071);
        CLS523.MTH7165(this.FLD5071, s1, "", s2, 1, ((CLS16)ⁱˉ0));
    }
}

