// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ˆʿ.CLS54;
import b.ᐧˉ.CLS1049;
import b.ⁱʾ.CLS326;
import java.util.ArrayList;

public final class CLS1505 implements CLS3 {
    public final int FLD4571;
    public final CLS326 FLD4572;
    public final CLS54 FLD4573;
    public final Activity FLD4574;
    public final ArrayList FLD4575;

    public CLS1505(Activity activity0, CLS54 ᐧˉ0, ArrayList arrayList0, CLS326 ˉᐧ0) {
        this.FLD4571 = 1;
        super();
        this.FLD4574 = activity0;
        this.FLD4573 = ᐧˉ0;
        this.FLD4575 = arrayList0;
        this.FLD4572 = ˉᐧ0;
    }

    public CLS1505(Activity activity0, ArrayList arrayList0, CLS54 ᐧˉ0, CLS326 ˉᐧ0) {
        this.FLD4571 = 0;
        super();
        this.FLD4574 = activity0;
        this.FLD4575 = arrayList0;
        this.FLD4573 = ᐧˉ0;
        this.FLD4572 = ˉᐧ0;
    }

    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD4574;
        CLS326 ˉᐧ0 = this.FLD4572;
        CLS54 ᐧˉ0 = this.FLD4573;
        ArrayList arrayList0 = this.FLD4575;
        if(this.FLD4571 == 0) {
            CLS476.MTH6646(activity0, new CLS1049(arrayList0, ᐧˉ0, ˉᐧ0, 19));
            return;
        }
        CLS523.MTH7142(activity0, ((CLS11)new CLS1294(ˉᐧ0, ᐧˉ0, arrayList0)));
    }
}

