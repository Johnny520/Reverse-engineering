// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ﾞˎ.CLS1622;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public final class CLS1380 implements CLS11 {
    public final ArrayList FLD3896;
    public final CLS1622 FLD3897;
    public final long FLD3898;

    public CLS1380(ArrayList arrayList0, long v, CLS1622 ˑٴ0) {
        this.FLD3896 = arrayList0;
        this.FLD3898 = v;
        this.FLD3897 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            String s = TextUtils.join(" ", this.FLD3896);
            long v = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(s).getTime();
            String s1 = this.FLD3897.MTH7285();
            CLS66.MTH1371(this.FLD3898, v / 1000L, s1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

