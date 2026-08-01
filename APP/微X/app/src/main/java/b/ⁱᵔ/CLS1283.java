// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.Bundle;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˑٴ.CLS650;

public final class CLS1283 implements CLS12 {
    public final int FLD3508;
    public final CLS12 FLD3509;

    public CLS1283(CLS12 ᵔʾ0, int v) {
        this.FLD3508 = v;
        this.FLD3509 = ᵔʾ0;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS12 ᵔʾ0 = this.FLD3509;
        if(this.FLD3508 == 0) {
            String s = ((Bundle)object0).getString("vidUrl");
            if(!TextUtils.isEmpty(s)) {
                CLS650 ʽᴵ0 = new CLS650(1, ᵔʾ0, s);
                CLS40.FLD157.MTH1124(((CLS39)ʽᴵ0));
            }
            return;
        }
        ᵔʾ0.MTH791(Boolean.valueOf(!TextUtils.isEmpty(((String)object0))));
    }
}

