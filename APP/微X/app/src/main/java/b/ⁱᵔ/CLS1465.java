// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˑٴ.CLS117;
import b.ﾞˎ.CLS1622;

public final class CLS1465 implements CLS11 {
    public final CLS1622 FLD4351;
    public final Handler.Callback FLD4352;

    public CLS1465(CLS1622 ˑٴ0, CLS117 ˊʿ0) {
        this.FLD4351 = ˑٴ0;
        this.FLD4352 = ˊʿ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            Message message0 = new Message();
            Bundle bundle0 = new Bundle();
            bundle0.putInt("startCode", 0);
            bundle0.putInt("endCode", 0);
            bundle0.putInt("split", Integer.parseInt(this.FLD4351.MTH7285()));
            message0.setData(bundle0);
            Handler.Callback handler$Callback0 = this.FLD4352;
            if(handler$Callback0 != null) {
                try {
                    handler$Callback0.handleMessage(message0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

