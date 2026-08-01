// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS350;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1624;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1116 implements CLS16, CLS379 {
    public final CLS1019 FLD2495;
    public final Activity FLD2496;

    public CLS1116(CLS1019 ˎʻ0, Activity activity0) {
        this.FLD2495 = ˎʻ0;
        this.FLD2496 = activity0;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Activity activity0 = this.FLD2496;
        CLS1019 ˎʻ0 = this.FLD2495;
        ˎʻ0.getClass();
        if(!TextUtils.isEmpty(s)) {
            CLS1013 ˎʻ$ᐧⁱ0 = new CLS1013(s);
            CLS387.MTH5585(true, activity0, ˎʻ0.FLD2086, ((CLS2)ˎʻ$ᐧⁱ0), null, -1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1019 ˎʻ0 = this.FLD2495;
        ˎʻ0.getClass();
        ArrayList arrayList0 = new ArrayList(ˎʻ0.FLD2087);
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS66.MTH1433("", ˎʻ0.FLD2157)) {
                hashSet0.add(ˊﾞ0);
            }
        }
        Activity activity0 = this.FLD2496;
        CLS350 ᐧⁱ0 = new CLS350(activity0, arrayList0);
        if(!hashSet0.isEmpty()) {
            ᐧⁱ0.FLD3394 = "#F5DB25";
            ᐧⁱ0.FLD3393 = hashSet0;
        }
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.MTH7311();
        יﹳ0.FLD5274 = new CLS1134(ᐧⁱ0, 0);
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(ᐧⁱ0);
        יﹳ0.FLD5276 = false;
        יﹳ0.MTH7301(new CLS211(ˎʻ0, ᐧⁱ0, 0));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

