// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS412;

public final class CLS747 implements CLS3 {
    public final int FLD957;
    public final String FLD958;
    public final CLS805 FLD959;

    public CLS747(CLS805 ᵎ0, String s, int v) {
        this.FLD957 = v;
        this.FLD959 = ᵎ0;
        this.FLD958 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        String s = this.FLD958;
        CLS805 ᵎ0 = this.FLD959;
        switch(this.FLD957) {
            case 0: {
                CLS412.MTH6013(((CLS140)ᵎ0.FLD1197).MTH3042(), CLS27.MTH889("start_download"));
                CLS644 ʽ1 = new CLS644(ᵎ0, s, 1);
                CLS40.FLD157.MTH1124(((CLS39)ʽ1));
                return;
            }
            case 1: {
                CLS412.MTH6013(((CLS140)ᵎ0.FLD1197).MTH3042(), CLS27.MTH889("start_download"));
                CLS644 ʽ2 = new CLS644(ᵎ0, s, 3);
                CLS40.FLD157.MTH1124(((CLS39)ʽ2));
                return;
            }
            case 2: {
                CLS412.MTH6013(((CLS140)ᵎ0.FLD1197).MTH3042(), CLS27.MTH889("start_download"));
                CLS644 ʽ3 = new CLS644(ᵎ0, s, 2);
                CLS40.FLD157.MTH1124(((CLS39)ʽ3));
                return;
            }
            default: {
                CLS412.MTH6013(((CLS140)ᵎ0.FLD1197).MTH3042(), CLS27.MTH889("start_download"));
                CLS644 ʽ0 = new CLS644(ᵎ0, s, 0);
                CLS40.FLD157.MTH1124(((CLS39)ʽ0));
            }
        }
    }
}

