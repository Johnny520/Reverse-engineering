// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ᐧˉ.CLS1049;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1400 implements CLS3 {
    public final int FLD3979;
    public final CLS369 FLD3980;
    public final ArrayList FLD3981;
    public final Activity FLD3982;
    public final HashSet FLD3983;

    public CLS1400(Activity activity0, ArrayList arrayList0, HashSet hashSet0, CLS369 ﾞᵎ0) {
        this.FLD3979 = 1;
        super();
        this.FLD3982 = activity0;
        this.FLD3981 = arrayList0;
        this.FLD3983 = hashSet0;
        this.FLD3980 = ﾞᵎ0;
    }

    public CLS1400(Activity activity0, HashSet hashSet0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD3979 = 0;
        super();
        this.FLD3982 = activity0;
        this.FLD3983 = hashSet0;
        this.FLD3981 = arrayList0;
        this.FLD3980 = ﾞᵎ0;
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD3982;
        CLS369 ﾞᵎ0 = this.FLD3980;
        ArrayList arrayList0 = this.FLD3981;
        HashSet hashSet0 = this.FLD3983;
        if(this.FLD3979 == 0) {
            CLS476.MTH6646(activity0, new CLS1049(hashSet0, arrayList0, ﾞᵎ0, 17));
            return;
        }
        CLS523.MTH7142(activity0, ((CLS11)new CLS1569(arrayList0, hashSet0, ﾞᵎ0)));
    }
}

