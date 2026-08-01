// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱˉ.CLS370;

public final class CLS1557 implements CLS8 {
    public final String FLD4848;

    public CLS1557(String s) {
        this.FLD4848 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        long v = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? 0x38E93AF92B3CD335L : 4100873287917949749L;
        CLS21.FLD76.MTH818(CLS370.MTH5289(v), new Object[]{this.FLD4848, object0});
    }
}

