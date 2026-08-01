// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ˑٴ.CLS766;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;

public final class CLS1358 implements CLS3 {
    public final int FLD3784;
    public final String FLD3785;
    public final ArrayList FLD3786;
    public final String FLD3787;
    public final CLS29 FLD3788;
    public final Activity FLD3789;
    public final CLS369 FLD3790;

    public CLS1358(Activity activity0, ArrayList arrayList0, CLS29 ˎᵢ0, String s, String s1, CLS369 ﾞᵎ0) {
        this.FLD3784 = 0;
        super();
        this.FLD3789 = activity0;
        this.FLD3786 = arrayList0;
        this.FLD3788 = ˎᵢ0;
        this.FLD3787 = s;
        this.FLD3785 = s1;
        this.FLD3790 = ﾞᵎ0;
    }

    public CLS1358(String s, ArrayList arrayList0, CLS29 ˎᵢ0, String s1, CLS369 ﾞᵎ0, Activity activity0) {
        this.FLD3784 = 1;
        super();
        this.FLD3787 = s;
        this.FLD3786 = arrayList0;
        this.FLD3788 = ˎᵢ0;
        this.FLD3785 = s1;
        this.FLD3790 = ﾞᵎ0;
        this.FLD3789 = activity0;
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD3789;
        if(this.FLD3784 == 0) {
            CLS523.MTH7142(activity0, ((CLS11)new CLS1374(this.FLD3790, this.FLD3788, this.FLD3787, this.FLD3785, this.FLD3786)));
            return;
        }
        CLS31.MTH991(activity0, ((CLS441)new CLS766(this.FLD3790, this.FLD3788, this.FLD3787, this.FLD3785, this.FLD3786)));
    }
}

