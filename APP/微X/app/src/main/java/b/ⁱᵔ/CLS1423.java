// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS1423 implements CLS3 {
    public final int FLD4159;
    public final HashMap FLD4160;
    public final Activity FLD4161;

    public CLS1423(Activity activity0, HashMap hashMap0) {
        this.FLD4159 = 1;
        super();
        this.FLD4161 = activity0;
        this.FLD4160 = hashMap0;
    }

    public CLS1423(HashMap hashMap0, Activity activity0) {
        this.FLD4159 = 0;
        super();
        this.FLD4160 = hashMap0;
        this.FLD4161 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        HashMap hashMap0 = this.FLD4160;
        if(this.FLD4159 == 0) {
            String s = TextUtils.join(",", hashMap0.values());
            String s1 = CLS27.MTH889("send");
            CLS1386 ˆﹶ0 = new CLS1386(s);
            HashSet hashSet0 = new HashSet();
            CLS395.MTH5736(s1, this.FLD4161, ((CLS8)ˆﹶ0), hashSet0, false);
            return;
        }
        Activity activity0 = this.FLD4161;
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.FLD5295 = false;
        CLS1626 ـﹳ1 = new CLS1626(activity0);
        ـﹳ1.FLD5295 = false;
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("set_gps"));
        ـˏ0.MTH7320(new CLS452(hashMap0, ـﹳ0, ـﹳ1, 0));
        CLS1625 ـˏ1 = new CLS1625(activity0);
        ـˏ1.MTH800(CLS27.MTH889("clear"));
        ـˏ1.MTH7320(new CLS452(hashMap0, ـﹳ0, ـﹳ1, 1));
        if(hashMap0 != null) {
            try {
                if(!hashMap0.isEmpty()) {
                    ـﹳ0.MTH800(((String)hashMap0.get("city")));
                    ـﹳ1.MTH800(((String)hashMap0.get("poiName")));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        CLS523.MTH7145(activity0, CLS27.MTH889("fake_gps"), ((CLS17)new CLS1295(activity0, ـﹳ0, ـﹳ1, ـˏ0, ـˏ1, 2)), null);
    }
}

