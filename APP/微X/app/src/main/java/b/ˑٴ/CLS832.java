// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ـˏ.CLS169;
import b.ـˏ.CLS889;
import b.ٴـ.CLS896.CLS170;
import b.ᵔʾ.CLS1255;
import java.io.File;

public final class CLS832 implements CLS12 {
    public final int FLD1282;
    public final CLS770 FLD1283;

    public CLS832(CLS770 ٴʿ0, int v) {
        this.FLD1282 = v;
        this.FLD1283 = ٴʿ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS770 ٴʿ0 = this.FLD1283;
        switch(this.FLD1282) {
            case 0: {
                ٴʿ0.getClass();
                try {
                    if(!ٴʿ0.FLD1447.FLD1407.MTH5947("fake_amount")) {
                        String s = ٴʿ0.FLD1445.MTH925("fake_amount_d", "0.0");
                        if(!TextUtils.isEmpty(s)) {
                            Object[] arr_object = {Double.valueOf(s)};
                            CLS166.MTH3195(object0, "setText", new Object[]{String.format((CLS66.MTH1476() + "%.2f"), arr_object)});
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ٴʿ0.getClass();
                if(CLS31.MTH1015(((File)object0))) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS889(((File)object0))), ٴʿ0.FLD1447.FLD1434);
                    ٴʿ0.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
                return;
            }
            default: {
                ٴʿ0.getClass();
                CLS1255 ᵢﹶ0 = new CLS1255(ٴʿ0, object0, 25);
                CLS40.FLD157.MTH1116(((CLS39)ᵢﹶ0));
            }
        }
    }
}

