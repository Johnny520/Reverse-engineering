// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.LinearLayout;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS336;

public final class CLS268 implements CLS54 {
    public final CLS144 FLD405;
    public final int FLD406;
    public final ArrayList FLD407;
    public final Activity FLD408;
    public final CLS216 FLD409;
    public final CLS73 FLD410;
    public final ArrayList FLD411;
    public final CLS143 FLD412;

    public CLS268(CLS216 ˎﾞ0, Activity activity0, CLS73 ﾞᐧ0, ArrayList arrayList0, CLS199 ˊˏ0, ArrayList arrayList1, CLS239 ᐧי0, int v) {
        this.FLD406 = v;
        this.FLD409 = ˎﾞ0;
        this.FLD408 = activity0;
        this.FLD410 = ﾞᐧ0;
        this.FLD407 = arrayList0;
        this.FLD412 = ˊˏ0;
        this.FLD411 = arrayList1;
        this.FLD405 = ᐧי0;
        super();
    }

    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        CLS143 ˆٴ0 = this.FLD412;
        CLS216 ˎﾞ0 = this.FLD409;
        if(this.FLD406 == 0) {
            ˎﾞ0.getClass();
            CLS336 ˊˏ0 = new CLS336(this.FLD408);
            ˊˏ0.MTH2376(this.FLD410);
            ˊˏ0.MTH2369();
            ˊˏ0.MTH2375(new CLS6(ˎﾞ0, this.FLD407, ˆٴ0, 2));
            ˊˏ0.MTH2368(new CLS7(ˎﾞ0, this.FLD408, this.FLD411, this.FLD407, this.FLD410, this.FLD405, 0));
            CLS43.MTH1423(linearLayout0, ((CLS145)ˊˏ0), true);
            return;
        }
        ˎﾞ0.getClass();
        CLS336 ˊˏ1 = new CLS336(this.FLD408);
        ˊˏ1.MTH2376(this.FLD410);
        ˊˏ1.MTH2369();
        ˊˏ1.MTH2375(new CLS6(ˎﾞ0, this.FLD407, ˆٴ0, 3));
        ˊˏ1.MTH2368(new CLS7(ˎﾞ0, this.FLD408, this.FLD411, this.FLD407, this.FLD410, this.FLD405, 1));
        CLS43.MTH1423(linearLayout0, ((CLS145)ˊˏ1), true);
    }
}

