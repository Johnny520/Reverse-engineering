// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS868;
import b.ﾞˎ.CLS1629;

public final class CLS1578 implements CLS11 {
    public final CLS1629 FLD4938;
    public final CLS11 FLD4939;

    public CLS1578(CLS1629 ⁱˉ0, CLS868 ﹶˏ0) {
        this.FLD4938 = ⁱˉ0;
        this.FLD4939 = ﹶˏ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS27.MTH895().MTH922(Boolean.valueOf(this.FLD4938.MTH7371("radio_front")), "sight_front_camera_enable");
        CLS11 ᐧⁱ0 = this.FLD4939;
        if(ᐧⁱ0 != null) {
            ᐧⁱ0.MTH790();
        }
    }
}

