// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS363;
import java.util.Iterator;

public final class CLS1646 implements CLS563 {
    public final CLS2 FLD3779;
    public final CLS363 FLD3780;

    public CLS1646(CLS363 ﾞٴ0, CLS2 ˆʿ0) {
        this.FLD3779 = ˆʿ0;
        this.FLD3780 = ﾞٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
        CLS2 ˆʿ0 = this.FLD3779;
        if(ˆʿ0 != null) {
            ˆʿ0.MTH772();
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS363 ﾞٴ0 = this.FLD3780;
            boolean[] arr_z = ﾞٴ0.FLD3446;
            boolean z = false;
            int v = 0;
            while(v < arr_z.length) {
                if(arr_z[v]) {
                    z = true;
                    if(true) {
                        break;
                    }
                }
                else {
                    ++v;
                }
            }
            CLS2 ˆʿ0 = this.FLD3779;
            if(!z) {
                if(ˆʿ0 != null) {
                    ˆʿ0.MTH773(null, null, null);
                }
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            StringBuilder stringBuilder1 = new StringBuilder();
            Iterator iterator0 = ﾞٴ0.MTH5261().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                stringBuilder0.append("");
                stringBuilder0.append(",");
                stringBuilder1.append("");
                stringBuilder1.append(",");
            }
            stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf(","));
            stringBuilder1.deleteCharAt(stringBuilder1.lastIndexOf(","));
            if(ˆʿ0 != null) {
                ˆʿ0.MTH773(stringBuilder0.toString(), stringBuilder1.toString(), ﾞٴ0.MTH5261());
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ʻˑ.CLS563
    public final void MTH775() {
        CLS2 ˆʿ0 = this.FLD3779;
        if(ˆʿ0 != null) {
            ˆʿ0.MTH773(null, null, null);
        }
    }
}

