// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;

public final class CLS844 implements CLS3 {
    public final int FLD1322;
    public final CLS794 FLD1323;

    public CLS844(CLS794 ᴵʽ0, int v) {
        this.FLD1322 = v;
        this.FLD1323 = ᴵʽ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS794 ᴵʽ0 = this.FLD1323;
        if(this.FLD1322 == 0) {
            ᴵʽ0.getClass();
            try {
                Object object0 = CLS166.MTH3194(ᴵʽ0.FLD1149, CLS27.MTH897("ConvBoxClass1_adapterField"));
                if(object0 != null) {
                    CLS166.MTH3195(object0, "notifyDataSetChanged", new Object[0]);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ᴵʽ0.getClass();
        try {
            Object object1 = CLS166.MTH3194(ᴵʽ0.FLD1149, CLS27.MTH897("ConvBoxClass1_adapterField"));
            if(object1 != null) {
                CLS166.MTH3195(object1, "notifyDataSetChanged", new Object[0]);
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

