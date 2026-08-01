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
import b.ﾞˎ.CLS1624;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS510 implements View.OnClickListener {
    public final int FLD5039;
    public final String FLD5040;
    public final CLS1266 FLD5041;
    public final ArrayList FLD5042;
    public final Activity FLD5043;
    public final CLS29 FLD5044;

    public CLS510(ArrayList arrayList0, CLS29 ˎᵢ0, CLS1266 ʾᵢ0, Activity activity0, String s) {
        this.FLD5039 = 0;
        super();
        this.FLD5042 = arrayList0;
        this.FLD5044 = ˎᵢ0;
        this.FLD5041 = ʾᵢ0;
        this.FLD5043 = activity0;
        this.FLD5040 = s;
    }

    public CLS510(ArrayList arrayList0, CLS1266 ʾᵢ0, Activity activity0, String s, CLS29 ˎᵢ0) {
        this.FLD5039 = 1;
        super();
        this.FLD5042 = arrayList0;
        this.FLD5041 = ʾᵢ0;
        this.FLD5043 = activity0;
        this.FLD5040 = s;
        this.FLD5044 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD5040;
        CLS1266 ʾᵢ0 = this.FLD5041;
        CLS29 ˎᵢ0 = this.FLD5044;
        ArrayList arrayList0 = this.FLD5042;
        if(this.FLD5039 == 0) {
            Activity activity0 = this.FLD5043;
            if(!arrayList0.isEmpty()) {
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925("chatroom_friend_req_excl", ""))));
                HashSet hashSet1 = new HashSet();
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!hashSet0.contains("")) {
                        hashSet1.add("");
                    }
                }
                ((CLS363)ʾᵢ0).MTH5264(arrayList0);
                CLS1624 יﹳ0 = new CLS1624(activity0);
                יﹳ0.MTH7305(new CLS493(ʾᵢ0, activity0, s, 1));
                CLS387.MTH5584(false, activity0, arrayList0, ((CLS2)new CLS1302(arrayList0, ˎᵢ0)), null, TextUtils.join(",", hashSet1), -1, יﹳ0, ((CLS363)ʾᵢ0));
            }
            return;
        }
        Activity activity1 = this.FLD5043;
        if(!arrayList0.isEmpty()) {
            ((CLS363)ʾᵢ0).MTH5264(arrayList0);
            CLS1624 יﹳ1 = new CLS1624(activity1);
            יﹳ1.MTH7305(new CLS493(ʾᵢ0, activity1, s, 0));
            CLS387.MTH5584(false, activity1, arrayList0, ((CLS2)new CLS1314(ˎᵢ0)), null, ˎᵢ0.MTH925("chatroom_friend_req_excl", ""), -1, יﹳ1, ((CLS363)ʾᵢ0));
        }
    }
}

