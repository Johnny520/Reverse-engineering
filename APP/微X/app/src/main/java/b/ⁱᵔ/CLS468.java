// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.Handler.Callback;
import android.os.Message;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS573;

public final class CLS468 implements Handler.Callback {
    public final CLS12 FLD4560;

    public CLS468(CLS573 ⁱʽ0) {
        this.FLD4560 = ⁱʽ0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(message0 != null) {
            String s = message0.getData().getString("result");
            this.FLD4560.MTH791(s);
        }
        return false;
    }
}

