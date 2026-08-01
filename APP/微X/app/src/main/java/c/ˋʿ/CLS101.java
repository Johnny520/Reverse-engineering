// Decompiled by JEB v5.42.0.202606242140

package c.ˋʿ;

import android.os.Handler.Callback;
import android.os.Message;
import c.ˋﹳ.CLS106;
import c.ˋﹳ.CLS109;
import c.ˋﹳ.CLS111;

public final class CLS101 implements Handler.Callback {
    public final CLS106 FLD518;
    public final CLS111 FLD519;
    public final CLS109 FLD520;

    public CLS101(CLS111 ᴵⁱ0, CLS106 ʻᵢ0, CLS109 ٴˑ0) {
        this.FLD519 = ᴵⁱ0;
        this.FLD518 = ʻᵢ0;
        this.FLD520 = ٴˑ0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return CLS102.MTH2182(this.FLD519, this.FLD518, this.FLD520, message0);
    }
}

