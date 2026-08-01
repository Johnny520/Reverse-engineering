// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;

public final class CLS246 implements CLS143 {
    public final int FLD328;
    public final int FLD329;
    public final Activity FLD330;
    public final CLS216 FLD331;
    public final ArrayList FLD332;
    public final CLS73 FLD333;
    public final ArrayList FLD334;

    public CLS246(CLS216 ˎﾞ0, Activity activity0, ArrayList arrayList0, int v, ArrayList arrayList1, CLS73 ﾞᐧ0, int v1) {
        this.FLD328 = v1;
        this.FLD331 = ˎﾞ0;
        this.FLD330 = activity0;
        this.FLD332 = arrayList0;
        this.FLD329 = v;
        this.FLD334 = arrayList1;
        this.FLD333 = ﾞᐧ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS73 ﾞᐧ0 = this.FLD333;
        ArrayList arrayList0 = this.FLD334;
        int v = this.FLD329;
        ArrayList arrayList1 = this.FLD332;
        Activity activity0 = this.FLD330;
        CLS216 ˎﾞ0 = this.FLD331;
        if(this.FLD328 == 0) {
            ˎﾞ0.getClass();
            CLS43.MTH1416(activity0, ((CLS141)new CLS217(arrayList1, v, arrayList0, ﾞᐧ0)));
            return;
        }
        ˎﾞ0.getClass();
        CLS43.MTH1416(activity0, ((CLS141)new CLS228(arrayList1, v, arrayList0, ﾞᐧ0)));
    }
}

