// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ⁱʾ.CLS335;

public final class CLS1261 implements CLS16 {
    public final int FLD3218;
    public final int FLD3219;
    public final CLS335 FLD3220;

    public CLS1261(CLS335 ˑٴ0, int v, int v1) {
        this.FLD3218 = v1;
        this.FLD3220 = ˑٴ0;
        this.FLD3219 = v;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v = this.FLD3219;
        CLS335 ˑٴ0 = this.FLD3220;
        switch(this.FLD3218) {
            case 0: {
                if(!TextUtils.isEmpty(s)) {
                    ˑٴ0.MTH5107(v, Integer.parseInt(s) - 1);
                    ˑٴ0.notifyDataSetChanged();
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s)) {
                    ˑٴ0.MTH5107(v, Integer.parseInt(s) - 1);
                    ˑٴ0.notifyDataSetChanged();
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(s)) {
                    ˑٴ0.MTH5107(v, Integer.parseInt(s) - 1);
                    ˑٴ0.notifyDataSetChanged();
                }
            }
        }
    }
}

