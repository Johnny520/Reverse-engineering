// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import java.util.LinkedHashMap;
import t.ˆٴ.CLS70;
import t.ᵔʾ.CLS297;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS336;
import t.ﾞᐧ.CLS344;

public final class CLS273 implements CLS54 {
    public final Activity FLD431;
    public final LinkedHashMap FLD432;
    public final boolean FLD433;
    public final ListAdapter FLD434;
    public final CLS297 FLD435;

    public CLS273(Activity activity0, CLS70 ﾞٴ0, CLS297 ˈˈ0, LinkedHashMap linkedHashMap0) {
        this.FLD431 = activity0;
        this.FLD434 = ﾞٴ0;
        this.FLD433 = true;
        this.FLD435 = ˈˈ0;
        this.FLD432 = linkedHashMap0;
    }

    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        CLS336 ˊˏ0 = new CLS336(this.FLD431);
        ˊˏ0.MTH2376(this.FLD434);
        ˊˏ0.MTH2375(new CLS27(this.FLD433, this.FLD435, this.FLD434, this.FLD432));
        CLS344 ⁱˉ0 = new CLS344(this.FLD431);
        ⁱˉ0.MTH2482(((CLS145)ˊˏ0));
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), CLS43.MTH1439(3));
    }
}

