// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ⁱʾ.CLS359;

public final class CLS1047 implements CLS16 {
    public final int FLD2231;
    public final int FLD2232;
    public final CLS359 FLD2233;

    public CLS1047(CLS359 ⁱˉ0, int v, int v1) {
        this.FLD2231 = v1;
        this.FLD2233 = ⁱˉ0;
        this.FLD2232 = v;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v = this.FLD2232;
        CLS359 ⁱˉ0 = this.FLD2233;
        switch(this.FLD2231) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    ⁱˉ0.MTH5239(v, Integer.parseInt(s) - 1);
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    ⁱˉ0.MTH5239(v, Integer.parseInt(s) - 1);
                }
                return;
            }
            case 2: {
                if(!TextUtils.isEmpty(s)) {
                    ⁱˉ0.MTH5239(v, Integer.parseInt(s) - 1);
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    ⁱˉ0.MTH5239(v, Integer.parseInt(s) - 1);
                }
            }
        }
    }
}

