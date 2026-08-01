// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS568;
import b.ᵔʾ.CLS1228;
import b.ⁱʾ.CLS1274;
import b.ﾞᐧ.CLS557;
import b.ﾞᐧ.CLS559;

public final class CLS1438 implements CLS12 {
    public final int FLD4250;
    public final String FLD4251;
    public final Activity FLD4252;

    public CLS1438(Activity activity0, String s, int v) {
        this.FLD4250 = v;
        this.FLD4252 = activity0;
        this.FLD4251 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        Activity activity0 = this.FLD4252;
        String s = this.FLD4251;
        if(this.FLD4250 == 0) {
            if(((CLS557)object0) != null) {
                CLS559 ᵔʾ0 = new CLS559(((CLS557)object0));
                CLS31.MTH995(activity0, ((CLS12)new CLS1228(s, ᵔʾ0, activity0, 9)), ((CLS3)new CLS1274(s, ᵔʾ0, 28)), CLS31.MTH1008().getAbsolutePath(), CLS31.MTH1008().getAbsolutePath());
            }
            return;
        }
        if(((CLS557)object0) != null) {
            CLS31.MTH995(activity0, ((CLS12)new CLS568(s, ((CLS557)object0), 14)), ((CLS3)new CLS1274(s, ((CLS557)object0), 29)), CLS31.MTH1008().getAbsolutePath(), CLS31.MTH1008().getAbsolutePath());
        }
    }
}

