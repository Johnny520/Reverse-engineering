// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.Bundle;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS568;

public final class CLS1490 implements CLS11 {
    public final CLS12 FLD4466;

    public CLS1490(CLS568 יᐧ0) {
        this.FLD4466 = יᐧ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        if(CLS409.FLD3999 != 0L && CLS409.FLD4001 != 0L && !TextUtils.isEmpty(CLS409.FLD3998)) {
            Bundle bundle0 = new Bundle();
            bundle0.putLong("start", CLS409.FLD3999);
            bundle0.putLong("end", CLS409.FLD4001);
            bundle0.putString("talker", CLS409.FLD4000);
            bundle0.putString("members", CLS409.FLD3998);
            this.FLD4466.MTH791(bundle0);
        }
    }
}

