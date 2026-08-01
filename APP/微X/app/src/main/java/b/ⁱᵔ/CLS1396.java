// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS576;
import b.ˑٴ.CLS757;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;

public final class CLS1396 implements CLS3 {
    public final int FLD3957;
    public final CLS1626 FLD3958;
    public final String FLD3959;
    public final Activity FLD3960;
    public final ArrayList FLD3961;
    public final CLS335 FLD3962;

    public CLS1396(Activity activity0, String s, ArrayList arrayList0, CLS1626 ـﹳ0, CLS335 ˑٴ0, int v) {
        this.FLD3957 = v;
        this.FLD3960 = activity0;
        this.FLD3959 = s;
        this.FLD3961 = arrayList0;
        this.FLD3958 = ـﹳ0;
        this.FLD3962 = ˑٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        switch(this.FLD3957) {
            case 0: {
                CLS576 ﾞˎ0 = new CLS576(((CLS12)new CLS566(this.FLD3959, this.FLD3961, this.FLD3958, this.FLD3962, 6)), 3);
                CLS31.MTH991(this.FLD3960, ((CLS441)ﾞˎ0));
                return;
            }
            case 1: {
                String s = CLS27.MTH889("add");
                CLS1506 ٴʿ0 = new CLS1506(this.FLD3959, this.FLD3961, this.FLD3958, this.FLD3962, 6);
                CLS523.MTH7165(this.FLD3960, s, "", "", 1, ((CLS16)ٴʿ0));
                return;
            }
            default: {
                CLS757 ـˊ0 = new CLS757(this.FLD3960, this.FLD3962, this.FLD3958, this.FLD3959, this.FLD3961);
                CLS31.MTH971(this.FLD3960, ((CLS12)ـˊ0));
            }
        }
    }
}

