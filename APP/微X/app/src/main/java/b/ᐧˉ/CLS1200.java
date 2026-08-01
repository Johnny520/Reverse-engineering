// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS1405;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;

public final class CLS1200 implements CLS2 {
    public final Activity FLD2809;

    public CLS1200(Activity activity0) {
        this.FLD2809 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            String s2 = CLS27.MTH889("rename_contacts");
            CLS1622 ˑٴ0 = new CLS1622(this.FLD2809);
            CLS1635 ﾞᵎ0 = new CLS1635(this.FLD2809);
            CLS1279 ʻᐧ0 = new CLS1279(ˑٴ0, this.FLD2809, ﾞᵎ0, 0);
            CLS1405 ˉˎ0 = new CLS1405(ˑٴ0, arrayList0, ﾞᵎ0);
            CLS523.MTH7160(this.FLD2809, s2, ((CLS17)ʻᐧ0), ((CLS11)ˉˎ0));
        }
    }
}

