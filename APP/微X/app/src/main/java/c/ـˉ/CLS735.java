// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.graphics.Bitmap;
import android.os.Handler.Callback;
import c.יᴵ.CLS144.CLS142;

public final class CLS735 implements CLS142 {
    public final Handler.Callback FLD987;
    public final Bitmap FLD988;

    public CLS735(Bitmap bitmap0, Handler.Callback handler$Callback0) {
        this.FLD988 = bitmap0;
        this.FLD987 = handler$Callback0;
    }

    @Override  // c.יᴵ.CLS144$CLS142
    public final void run() {
        CLS264.MTH4118(this.FLD988, this.FLD987);
    }
}

