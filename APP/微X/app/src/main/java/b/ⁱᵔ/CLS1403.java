// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS31;
import b.ˈˈ.CLS79;
import b.ˑٴ.CLS766;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS1403 implements CLS3 {
    public final int FLD3990;
    public final CLS79 FLD3991;
    public final HashMap FLD3992;
    public final Activity FLD3993;
    public final String FLD3994;
    public final CLS369 FLD3995;
    public final ArrayList FLD3996;

    public CLS1403(Activity activity0, HashMap hashMap0, String s, CLS79 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD3990 = 1;
        super();
        this.FLD3993 = activity0;
        this.FLD3992 = hashMap0;
        this.FLD3994 = s;
        this.FLD3991 = ˎᵢ0;
        this.FLD3996 = arrayList0;
        this.FLD3995 = ﾞᵎ0;
    }

    public CLS1403(CLS79 ˎᵢ0, String s, HashMap hashMap0, ArrayList arrayList0, CLS369 ﾞᵎ0, Activity activity0) {
        this.FLD3990 = 0;
        super();
        this.FLD3991 = ˎᵢ0;
        this.FLD3994 = s;
        this.FLD3992 = hashMap0;
        this.FLD3996 = arrayList0;
        this.FLD3995 = ﾞᵎ0;
        this.FLD3993 = activity0;
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD3993;
        if(this.FLD3990 == 0) {
            CLS31.MTH991(activity0, ((CLS441)new CLS766(16, this.FLD3991, this.FLD3994, this.FLD3992, this.FLD3995, this.FLD3996)));
            return;
        }
        CLS523.MTH7142(activity0, ((CLS11)new CLS1375(this.FLD3995, this.FLD3991, this.FLD3994, this.FLD3996, this.FLD3992)));
    }
}

