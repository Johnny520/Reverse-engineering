// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS73;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS336;
import t.ﾞᐧ.CLS344;

public final class CLS266 implements CLS54 {
    public final ArrayList FLD393;
    public final int FLD394;
    public final CLS73 FLD395;
    public final Activity FLD396;
    public final CLS216 FLD397;
    public final String FLD398;
    public final CLS143 FLD399;
    public final ArrayList FLD400;

    public CLS266(CLS216 ˎﾞ0, Activity activity0, String s, CLS73 ﾞᐧ0, ArrayList arrayList0, CLS267 ﾞᐧ1, ArrayList arrayList1) {
        this.FLD394 = 1;
        super();
        this.FLD397 = ˎﾞ0;
        this.FLD396 = activity0;
        this.FLD398 = s;
        this.FLD395 = ﾞᐧ0;
        this.FLD400 = arrayList0;
        this.FLD399 = ﾞᐧ1;
        this.FLD393 = arrayList1;
    }

    public CLS266(CLS216 ˎﾞ0, String s, Activity activity0, CLS73 ﾞᐧ0, ArrayList arrayList0, CLS267 ﾞᐧ1, ArrayList arrayList1) {
        this.FLD394 = 0;
        super();
        this.FLD397 = ˎﾞ0;
        this.FLD398 = s;
        this.FLD396 = activity0;
        this.FLD395 = ﾞᐧ0;
        this.FLD400 = arrayList0;
        this.FLD399 = ﾞᐧ1;
        this.FLD393 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        CLS143 ˆٴ0 = this.FLD399;
        String s = this.FLD398;
        CLS216 ˎﾞ0 = this.FLD397;
        if(this.FLD394 == 0) {
            ˎﾞ0.getClass();
            String s1 = "rnd_bg" + CLS114.MTH1900((TextUtils.isEmpty(s) ? 0xFFFFE6B82B3CF2B7L : 0xFFFFE6AF2B3CF2B7L));
            CLS344 ⁱˉ0 = new CLS344(this.FLD396);
            CLS332 ʻᵎ0 = new CLS332(this.FLD396);
            ʻᵎ0.MTH2172(CLS133.MTH2099("enable"));
            ʻᵎ0.MTH2328(CLS133.MTH2103().MTH2131(s1 + s, false));
            ʻᵎ0.MTH2327(new CLS12(ˎﾞ0, s1, s));
            ⁱˉ0.MTH2482(((CLS145)ʻᵎ0));
            CLS336 ˊˏ0 = new CLS336(this.FLD396);
            ˊˏ0.MTH2376(this.FLD395);
            ˊˏ0.MTH2369();
            ˊˏ0.MTH2375(new CLS6(ˎﾞ0, this.FLD400, ˆٴ0, 1));
            ˊˏ0.MTH2368(new CLS11(1, this.FLD396, this.FLD395, ˎﾞ0, this.FLD393, this.FLD400));
            ⁱˉ0.MTH2482(((CLS145)ˊˏ0));
            CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), CLS43.MTH1439(10));
            return;
        }
        ˎﾞ0.getClass();
        CLS344 ⁱˉ1 = new CLS344(this.FLD396);
        CLS332 ʻᵎ1 = new CLS332(this.FLD396);
        CLS15.MTH1073(0xFFFFE60B2B3CF2B7L, ʻᵎ1);
        ʻᵎ1.MTH2328(ˎﾞ0.FLD236.MTH1818(s + "Enable", false));
        ʻᵎ1.MTH2327(new CLS5(ˎﾞ0, s));
        ⁱˉ1.MTH2482(((CLS145)ʻᵎ1));
        CLS336 ˊˏ1 = new CLS336(this.FLD396);
        ˊˏ1.MTH2376(this.FLD395);
        ˊˏ1.MTH2369();
        ˊˏ1.MTH2375(new CLS6(ˎﾞ0, this.FLD400, ˆٴ0, 4));
        ˊˏ1.MTH2368(new CLS11(2, this.FLD396, this.FLD395, ˎﾞ0, this.FLD393, this.FLD400));
        ⁱˉ1.MTH2482(((CLS145)ˊˏ1));
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ1), CLS43.MTH1439(10));
    }
}

