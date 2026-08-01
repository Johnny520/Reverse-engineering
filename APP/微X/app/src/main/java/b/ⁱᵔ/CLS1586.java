// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1626;

public final class CLS1586 implements CLS3 {
    public final int FLD4975;
    public final CLS363 FLD4976;
    public final Activity FLD4977;
    public final CLS1626 FLD4978;

    public CLS1586(Activity activity0, CLS363 ﾞٴ0, CLS1626 ـﹳ0, int v) {
        this.FLD4975 = v;
        this.FLD4977 = activity0;
        this.FLD4976 = ﾞٴ0;
        this.FLD4978 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS1626 ـﹳ0 = this.FLD4978;
        CLS363 ﾞٴ0 = this.FLD4976;
        switch(this.FLD4975) {
            case 0: {
                String s1 = CLS27.MTH889("custom_select_desc");
                CLS1550 ᵎᐧ1 = new CLS1550(ﾞٴ0, ـﹳ0, 0);
                CLS523.MTH7165(this.FLD4977, s1, "", "", 1, ((CLS16)ᵎᐧ1));
                return;
            }
            case 1: {
                String s2 = CLS27.MTH889("random");
                CLS1550 ᵎᐧ2 = new CLS1550(ﾞٴ0, ـﹳ0, 1);
                CLS523.MTH7165(this.FLD4977, s2, "", "0", 2, ((CLS16)ᵎᐧ2));
                return;
            }
            case 2: {
                String s3 = CLS27.MTH889("custom_select_desc");
                CLS1550 ᵎᐧ3 = new CLS1550(ﾞٴ0, ـﹳ0, 2);
                CLS523.MTH7165(this.FLD4977, s3, "", "", 1, ((CLS16)ᵎᐧ3));
                return;
            }
            default: {
                String s = CLS27.MTH889("random");
                CLS1550 ᵎᐧ0 = new CLS1550(ﾞٴ0, ـﹳ0, 3);
                CLS523.MTH7165(this.FLD4977, s, "", "0", 2, ((CLS16)ᵎᐧ0));
            }
        }
    }
}

