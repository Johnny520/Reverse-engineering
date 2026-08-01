// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS1266;
import b.ⁱʾ.CLS363;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1624;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS394 implements View.OnClickListener {
    public final int FLD3694;
    public final CLS29 FLD3695;
    public final CLS1266 FLD3696;
    public final Activity FLD3697;
    public final ArrayList FLD3698;
    public final boolean FLD3699;

    public CLS394(Activity activity0, CLS1266 ʾᵢ0, ArrayList arrayList0, CLS29 ˎᵢ0, boolean z) {
        this.FLD3694 = 1;
        super();
        this.FLD3697 = activity0;
        this.FLD3696 = ʾᵢ0;
        this.FLD3698 = arrayList0;
        this.FLD3695 = ˎᵢ0;
        this.FLD3699 = z;
    }

    public CLS394(CLS29 ˎᵢ0, boolean z, ArrayList arrayList0, Activity activity0, CLS1266 ʾᵢ0) {
        this.FLD3694 = 0;
        super();
        this.FLD3695 = ˎᵢ0;
        this.FLD3699 = z;
        this.FLD3698 = arrayList0;
        this.FLD3697 = activity0;
        this.FLD3696 = ʾᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS29 ˎᵢ0 = this.FLD3695;
        boolean z = this.FLD3699;
        if(this.FLD3694 == 0) {
            Activity activity0 = this.FLD3697;
            CLS1266 ʾᵢ0 = this.FLD3696;
            HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925(CLS370.MTH5289((z ? 0x38EAF34B2B3CD335L : 4101358009337041717L)), ""))));
            HashSet hashSet1 = new HashSet();
            ArrayList arrayList0 = this.FLD3698;
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!hashSet0.contains("")) {
                    hashSet1.add("");
                }
            }
            CLS1624 יﹳ0 = new CLS1624(activity0);
            יﹳ0.MTH7305(new CLS501(ʾᵢ0, activity0, 0));
            CLS387.MTH5584(false, activity0, arrayList0, ((CLS2)new CLS1299(arrayList0, ˎᵢ0, z)), null, TextUtils.join(",", hashSet1), -1, יﹳ0, ((CLS363)ʾᵢ0));
            return;
        }
        CLS1624 יﹳ1 = new CLS1624(this.FLD3697);
        יﹳ1.MTH7305(new CLS501(this.FLD3696, this.FLD3697, 1));
        CLS1300 ʾʼ$ˆʿ0 = new CLS1300(ˎᵢ0, z);
        CLS387.MTH5584(false, this.FLD3697, this.FLD3698, ((CLS2)ʾʼ$ˆʿ0), null, ˎᵢ0.MTH925(CLS370.MTH5289((z ? 0x38EAF2A42B3CD335L : 4101357292077503285L)), ""), -1, יﹳ1, ((CLS363)this.FLD3696));
    }
}

