// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.os.Bundle;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1629.CLS548;

public final class CLS1254 implements CLS548 {
    public final int FLD3173;
    public final CLS1625 FLD3174;
    public final Bundle FLD3175;

    public CLS1254(Bundle bundle0, CLS1625 ـˏ0, int v) {
        this.FLD3173 = v;
        this.FLD3175 = bundle0;
        this.FLD3174 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS1625 ـˏ0 = this.FLD3174;
        Bundle bundle0 = this.FLD3175;
        if(this.FLD3173 == 0) {
            try {
                switch(s) {
                    case "not_show_selected": {
                        bundle0.putInt("shareType", 3);
                        break;
                    }
                    case "only_selected": {
                        bundle0.putInt("shareType", 2);
                        break;
                    }
                    case "private": {
                        bundle0.putInt("shareType", 1);
                        ـˏ0.MTH801(8);
                        return;
                    }
                    case "public": {
                        bundle0.putInt("shareType", 0);
                        ـˏ0.MTH801(8);
                        return;
                    }
                    default: {
                        return;
                    }
                }
                ـˏ0.MTH801(0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            switch(s) {
                case "not_show_selected": {
                    bundle0.putInt("shareType", 3);
                    break;
                }
                case "only_selected": {
                    bundle0.putInt("shareType", 2);
                    break;
                }
                case "public": {
                    bundle0.putInt("shareType", 0);
                    ـˏ0.MTH801(8);
                    return;
                }
                default: {
                    return;
                }
            }
            ـˏ0.MTH801(0);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

