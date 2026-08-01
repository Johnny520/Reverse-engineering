// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;

public final class CLS809 implements CLS11 {
    public final CLS139 FLD1207;

    public CLS809(CLS139 ﹶʼ0) {
        this.FLD1207 = ﹶʼ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS29 ˎᵢ0 = this.FLD1207.FLD1431;
        ˎᵢ0.getClass();
        try {
            String s = CLS27.MTH881();
            if(!TextUtils.isEmpty(s)) {
                ˎᵢ0.getWritableDatabase().delete("DATA", "ACCOUNT = ?", new String[]{s});
                ˎᵢ0.FLD121.clear();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(ˎᵢ0.FLD124) {
            ˎᵢ0.FLD121.clear();
            return;
        }
        CLS21.FLD76.MTH819("WxDataManagerClear", new Object[0]);
    }
}

