// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import t.ᵔʾ.CLS132.CLS131;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS298;

public final class CLS291 implements CLS136 {
    public final int FLD760;
    public final CLS102 FLD761;

    public CLS291(CLS102 יﹳ0, int v) {
        this.FLD760 = v;
        this.FLD761 = יﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS137$CLS136
    public final void run() {
        CLS102 יﹳ0 = this.FLD761;
        switch(this.FLD760) {
            case 0: {
                CLS131 ⁱʽ$ˆٴ1 = יﹳ0.FLD766;
                if(ⁱʽ$ˆٴ1 == null) {
                    יﹳ0.FLD766 = CLS132.MTH2085(new String[]{יﹳ0.FLD773, "images"});
                    CLS291 ˑٴ0 = new CLS291(יﹳ0, 1);
                    CLS137.FLD972.MTH2146(((CLS136)ˑٴ0), 2000L);
                }
                else {
                    CLS298 יᐧ1 = new CLS298(ⁱʽ$ˆٴ1, 0);
                    CLS137.FLD972.MTH2146(((CLS136)יᐧ1), 2000L);
                }
                CLS131 ⁱʽ$ˆٴ2 = יﹳ0.FLD765;
                if(ⁱʽ$ˆٴ2 == null) {
                    יﹳ0.FLD765 = CLS132.MTH2085(new String[]{יﹳ0.FLD773, "icons"});
                    CLS291 ˑٴ1 = new CLS291(יﹳ0, 2);
                    CLS137.FLD972.MTH2146(((CLS136)ˑٴ1), 2000L);
                    return;
                }
                CLS298 יᐧ2 = new CLS298(ⁱʽ$ˆٴ2, 0);
                CLS137.FLD972.MTH2146(((CLS136)יᐧ2), 2000L);
                return;
            }
            case 1: {
                CLS131 ⁱʽ$ˆٴ3 = יﹳ0.FLD766;
                ⁱʽ$ˆٴ3.getClass();
                CLS298 יᐧ3 = new CLS298(ⁱʽ$ˆٴ3, 1);
                CLS137.FLD972.MTH2141(((CLS136)יᐧ3));
                return;
            }
            default: {
                CLS131 ⁱʽ$ˆٴ0 = יﹳ0.FLD765;
                ⁱʽ$ˆٴ0.getClass();
                CLS298 יᐧ0 = new CLS298(ⁱʽ$ˆٴ0, 1);
                CLS137.FLD972.MTH2141(((CLS136)יᐧ0));
            }
        }
    }
}

