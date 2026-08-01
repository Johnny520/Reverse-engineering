// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ⁱˉ.CLS370;

public final class CLS1288 implements CLS8 {
    public final CLS425 FLD3536;

    public CLS1288(CLS425 ˊﹳ0) {
        this.FLD3536 = ˊﹳ0;
        super();
    }

    @Override  // b.ʻˑ.CLS8
    public final void MTH785() {
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS8
    public final void MTH786(Object object0) {
        long v = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? 4100872364499981109L : 4100872424629523253L;
        CLS21.FLD76.MTH818(CLS370.MTH5289(v), new Object[]{TextUtils.join(",", this.FLD3536.FLD4096.MTH5051()), object0});
    }
}

