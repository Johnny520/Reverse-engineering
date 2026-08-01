// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS40;
import b.ᵔʾ.CLS288;
import b.ⁱᵔ.CLS412;

public final class CLS720 implements CLS3 {
    public final int FLD870;

    public CLS720(int v) {
        this.FLD870 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        switch(this.FLD870) {
            case 0: {
                CLS21.FLD76.MTH831("core", "showSettingsDialog", new Object[0]);
                return;
            }
            case 1: {
                CLS288.FLD2989.FLD2979 = null;
                return;
            }
            case 2: {
                CLS21.FLD76.MTH818("nearbyFriendReq_import", new Object[0]);
                return;
            }
            case 3: {
                CLS21.FLD76.MTH831("core", "showSettingsDialog", new Object[0]);
                return;
            }
            default: {
                CLS412.MTH6001(CLS40.FLD157.FLD154);
            }
        }
    }
}

