// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.LinearLayout;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS53;
import t.ˆʿ.CLS55.CLS54;
import t.ˆٴ.CLS73;
import t.ᵔʾ.CLS123;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS168;
import t.ﾞᐧ.CLS336;

public final class CLS191 implements CLS53, CLS54 {
    public final int FLD118;
    public final ArrayList FLD119;
    public final Activity FLD120;
    public final CLS216 FLD121;
    public final CLS73 FLD122;
    public final ArrayList FLD123;
    public final CLS143 FLD124;

    public CLS191(CLS216 ˎﾞ0, Activity activity0, ArrayList arrayList0, CLS267 ﾞᐧ0, ArrayList arrayList1, CLS73 ﾞᐧ1, int v) {
        this.FLD118 = v;
        this.FLD121 = ˎﾞ0;
        this.FLD120 = activity0;
        this.FLD119 = arrayList0;
        this.FLD124 = ﾞᐧ0;
        this.FLD123 = arrayList1;
        this.FLD122 = ﾞᐧ1;
        super();
    }

    public CLS191(CLS216 ˎﾞ0, Activity activity0, CLS73 ﾞᐧ0, ArrayList arrayList0, CLS267 ﾞᐧ1, ArrayList arrayList1) {
        this.FLD118 = 1;
        super();
        this.FLD121 = ˎﾞ0;
        this.FLD120 = activity0;
        this.FLD122 = ﾞᐧ0;
        this.FLD119 = arrayList0;
        this.FLD124 = ﾞᐧ1;
        this.FLD123 = arrayList1;
    }

    public CLS191(CLS216 ˎﾞ0, ArrayList arrayList0, CLS143 ˆٴ0, Activity activity0, ArrayList arrayList1, CLS73 ﾞᐧ0, int v) {
        this.FLD118 = v;
        this.FLD121 = ˎﾞ0;
        this.FLD119 = arrayList0;
        this.FLD124 = ˆٴ0;
        this.FLD120 = activity0;
        this.FLD123 = arrayList1;
        this.FLD122 = ﾞᐧ0;
        super();
    }

    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        this.FLD121.getClass();
        CLS336 ˊˏ0 = new CLS336(this.FLD120);
        ˊˏ0.MTH2376(this.FLD122);
        ˊˏ0.MTH2375(new CLS6(this.FLD121, this.FLD119, this.FLD124, 0));
        ˊˏ0.MTH2368(new CLS11(0, this.FLD120, this.FLD122, this.FLD121, this.FLD123, this.FLD119));
        CLS43.MTH1423(linearLayout0, ((CLS145)ˊˏ0), true);
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS53
    public final void MTH1476(CLS168 ˑٴ0) {
        CLS143 ˆٴ0 = this.FLD124;
        CLS216 ˎﾞ0 = this.FLD121;
        switch(this.FLD118) {
            case 0: {
                Activity activity0 = this.FLD120;
                ArrayList arrayList0 = this.FLD119;
                ArrayList arrayList1 = this.FLD123;
                CLS73 ﾞᐧ0 = this.FLD122;
                ˎﾞ0.getClass();
                if(CLS123.FLD912.MTH2000("hasReadStoragePermission", new Object[0])) {
                    ˑٴ0.MTH2390("add_directory", ((CLS143)new CLS222(activity0, arrayList0, ˆٴ0, 0)));
                }
                ˑٴ0.MTH2390("add", ((CLS143)new CLS238(ˎﾞ0, arrayList0, ˆٴ0, 0)));
                ˑٴ0.MTH2390("delete_all", ((CLS143)new CLS259(0, activity0, ﾞᐧ0, ˎﾞ0, arrayList1, arrayList0)));
                return;
            }
            case 2: {
                ˎﾞ0.getClass();
                ˑٴ0.MTH2390("add", ((CLS143)new CLS238(ˎﾞ0, this.FLD119, ˆٴ0, 1)));
                ˑٴ0.MTH2390("delete_all", ((CLS143)new CLS259(1, this.FLD120, this.FLD122, ˎﾞ0, this.FLD123, this.FLD119)));
                return;
            }
            case 3: {
                ˎﾞ0.getClass();
                ˑٴ0.MTH2390("add", ((CLS143)new CLS238(ˎﾞ0, this.FLD119, ˆٴ0, 3)));
                ˑٴ0.MTH2390("delete_all", ((CLS143)new CLS259(3, this.FLD120, this.FLD122, ˎﾞ0, this.FLD123, this.FLD119)));
                return;
            }
            case 4: {
                Activity activity1 = this.FLD120;
                ArrayList arrayList2 = this.FLD119;
                ArrayList arrayList3 = this.FLD123;
                CLS73 ﾞᐧ1 = this.FLD122;
                ˎﾞ0.getClass();
                if(CLS123.FLD912.MTH2000("hasReadStoragePermission", new Object[0])) {
                    ˑٴ0.MTH2390("add_directory", ((CLS143)new CLS222(activity1, arrayList2, ˆٴ0, 1)));
                }
                ˑٴ0.MTH2390("add", ((CLS143)new CLS238(ˎﾞ0, arrayList2, ˆٴ0, 2)));
                ˑٴ0.MTH2390("delete_all", ((CLS143)new CLS259(2, activity1, ﾞᐧ1, ˎﾞ0, arrayList2, arrayList3)));
                return;
            }
            default: {
                ˎﾞ0.getClass();
                ˑٴ0.MTH2390("add", ((CLS143)new CLS238(ˎﾞ0, this.FLD119, ˆٴ0, 4)));
                ˑٴ0.MTH2390("delete_all", ((CLS143)new CLS259(4, this.FLD120, this.FLD122, ˎﾞ0, this.FLD123, this.FLD119)));
            }
        }
    }
}

