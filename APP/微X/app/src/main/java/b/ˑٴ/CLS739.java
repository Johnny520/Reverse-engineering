// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;

public final class CLS739 implements CLS3 {
    public final int FLD929;
    public final CLS12 FLD930;

    public CLS739(CLS12 ᵔʾ0, int v) {
        this.FLD929 = v;
        this.FLD930 = ᵔʾ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS12 ᵔʾ0 = this.FLD930;
        switch(this.FLD929) {
            case 0: {
                ᵔʾ0.MTH791(20000);
                return;
            }
            case 1: {
                ᵔʾ0.MTH791(20001);
                return;
            }
            case 2: {
                CLS21.FLD76.MTH818("FriendReq_import", new Object[]{ᵔʾ0});
                return;
            }
            default: {
                ᵔʾ0.MTH791("");
            }
        }
    }
}

