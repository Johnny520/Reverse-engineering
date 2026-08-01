// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS363;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class CLS1289 implements CLS379 {
    public final String FLD3537;
    public final ArrayList FLD3538;
    public final CLS1624 FLD3539;
    public final int FLD3540;
    public final Activity FLD3541;
    public final CLS363 FLD3542;
    public final CLS1626 FLD3543;
    public final CLS1620 FLD3544;
    public final CLS1623 FLD3545;

    public CLS1289(CLS1624 יﹳ0, CLS363 ﾞٴ0, Activity activity0, CLS1626 ـﹳ0, int v, CLS1623 יᐧ0, CLS1620 ˊˏ0, String s, ArrayList arrayList0) {
        this.FLD3539 = יﹳ0;
        this.FLD3542 = ﾞٴ0;
        this.FLD3541 = activity0;
        this.FLD3543 = ـﹳ0;
        this.FLD3540 = v;
        this.FLD3545 = יᐧ0;
        this.FLD3544 = ˊˏ0;
        this.FLD3537 = s;
        this.FLD3538 = arrayList0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS363 ﾞٴ0 = this.FLD3542;
        this.FLD3539.FLD5274 = new CLS1426(ﾞٴ0, 2);
        this.FLD3539.MTH7302();
        this.FLD3539.MTH7311();
        this.FLD3539.MTH7303(ﾞٴ0);
        this.FLD3539.FLD5276 = false;
        CLS1635 ﾞᵎ0 = new CLS1635(this.FLD3541);
        ﾞᵎ0.FLD5426 = true;
        ﾞᵎ0.MTH800(CLS27.MTH889("select_all"));
        CLS1626 ـﹳ0 = this.FLD3543;
        ﾞᵎ0.MTH7438(new CLS381(ﾞٴ0, ـﹳ0, 1));
        CLS513 ﹶˑ0 = new CLS513(this.FLD3540, ﾞٴ0, ـﹳ0, 1);
        this.FLD3539.MTH7301(ﹶˑ0);
        CLS182.MTH3498(this.FLD3545, new Object[]{ﾞᵎ0, this.FLD3544, ـﹳ0, this.FLD3539}, 3, linearLayout0, this.FLD3545);
        String s = this.FLD3537;
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = CLS502.MTH6941(s);
            HashSet hashSet0 = new HashSet();
            Collections.addAll(hashSet0, arr_s);
            for(int v = 0; v < this.FLD3538.size(); ++v) {
                if(hashSet0.contains("")) {
                    ﾞٴ0.MTH5262(v, true);
                }
            }
            ArrayList arrayList0 = new ArrayList(ﾞٴ0.MTH5261());
            for(Object object0: ﾞٴ0.FLD3447) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!arrayList0.contains(ˊﾞ0)) {
                    arrayList0.add(ˊﾞ0);
                }
            }
            ﾞٴ0.MTH5264(arrayList0);
            ـﹳ0.MTH7325(String.valueOf(ﾞٴ0.MTH5258()));
        }
    }
}

