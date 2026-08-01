// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1360 implements CLS16 {
    public final int FLD3792;
    public final ArrayList FLD3793;
    public final CLS29 FLD3794;
    public final CLS369 FLD3795;

    public CLS1360(CLS29 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0, int v) {
        this.FLD3792 = v;
        this.FLD3794 = ˎᵢ0;
        this.FLD3793 = arrayList0;
        this.FLD3795 = ﾞᵎ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS369 ﾞᵎ0 = this.FLD3795;
        ArrayList arrayList0 = this.FLD3793;
        CLS29 ˎᵢ0 = this.FLD3794;
        if(this.FLD3792 == 0) {
            if(!TextUtils.isEmpty(s)) {
                HashSet hashSet0 = new HashSet(Arrays.asList(ˎᵢ0.MTH925("wb_fav_list", "").split(";")));
                hashSet0.add(s);
                ˎᵢ0.MTH922(TextUtils.join(";", hashSet0), "wb_fav_list");
                arrayList0.add(s);
                ﾞᵎ0.notifyDataSetChanged();
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            HashSet hashSet1 = new HashSet(Arrays.asList(ˎᵢ0.MTH925("moments_container_list", "").split(";")));
            hashSet1.add(s);
            ˎᵢ0.MTH922(TextUtils.join(";", hashSet1), "moments_container_list");
            arrayList0.add(s);
            ﾞᵎ0.notifyDataSetChanged();
        }
    }
}

