// Decompiled by JEB v5.42.0.202606242140

package c.ˏי;

import android.os.Handler.Callback;
import android.os.Message;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS346;
import c.ﹶˆ.CLS347;

public final class CLS109 implements Handler.Callback {
    public final CLS346 FLD382;
    public final CLS343 FLD383;
    public final CLS347 FLD384;

    public CLS109(CLS343 ˋʼ0, CLS347 ﾞⁱ0, CLS346 ﾞʿ0) {
        this.FLD383 = ˋʼ0;
        this.FLD384 = ﾞⁱ0;
        this.FLD382 = ﾞʿ0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return CLS111.MTH1551(this.FLD383, this.FLD384, this.FLD382, message0);
    }
}

