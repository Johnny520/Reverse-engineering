// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˊﾞ.CLS612;
import b.ﾞˎ.CLS1620;
import java.util.HashMap;

public final class CLS1540 implements CLS7 {
    public final int FLD4781;
    public final String FLD4782;
    public final HashMap FLD4783;
    public final Activity FLD4784;
    public final CLS1620 FLD4785;

    public CLS1540(int v, Activity activity0, CLS1620 ˊˏ0, String s, HashMap hashMap0) {
        this.FLD4781 = v;
        this.FLD4784 = activity0;
        this.FLD4783 = hashMap0;
        this.FLD4785 = ˊˏ0;
        this.FLD4782 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        if(this.FLD4781 == 0) {
            String s = CLS27.MTH889("rename_tag");
            CLS612 ᵔʾ0 = new CLS612(this.FLD4783, ((String)object0), this.FLD4785, this.FLD4782, 28);
            CLS523.MTH7165(this.FLD4784, s, "", "", 1, ((CLS16)ᵔʾ0));
            return;
        }
        CLS1499 ـٴ0 = new CLS1499(this.FLD4783, ((String)object0), this.FLD4785, this.FLD4782);
        CLS523.MTH7142(this.FLD4784, ((CLS11)ـٴ0));
    }
}

