// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS404;
import java.util.ArrayList;

public final class CLS685 implements CLS2 {
    public final Activity FLD765;
    public final CLS794 FLD766;

    public CLS685(CLS794 ᴵʽ0, Activity activity0) {
        this.FLD766 = ᴵʽ0;
        this.FLD765 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            boolean z = CLS404.MTH5909(s);
            Activity activity0 = this.FLD765;
            CLS794 ᴵʽ0 = this.FLD766;
            if(z) {
                ᴵʽ0.FLD1147.MTH1630(activity0, s);
                return;
            }
            ᴵʽ0.FLD1147.getClass();
            CLS79.MTH1632(activity0, s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

