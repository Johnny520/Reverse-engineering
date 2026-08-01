// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS29;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1503 implements CLS16 {
    public final int FLD4555;
    public final CLS369 FLD4556;
    public final CLS29 FLD4557;
    public final ArrayList FLD4558;
    public final String FLD4559;

    public CLS1503(int v, CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD4555 = v;
        this.FLD4557 = ˎᵢ0;
        this.FLD4559 = s;
        this.FLD4558 = arrayList0;
        this.FLD4556 = ﾞᵎ0;
        super();
    }

    public CLS1503(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD4555 = 1;
        super();
        this.FLD4558 = arrayList0;
        this.FLD4557 = ˎᵢ0;
        this.FLD4559 = s;
        this.FLD4556 = ﾞᵎ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS369 ﾞᵎ0 = this.FLD4556;
        ArrayList arrayList0 = this.FLD4558;
        String s1 = this.FLD4559;
        CLS29 ˎᵢ0 = this.FLD4557;
        switch(this.FLD4555) {
            case 0: {
                HashSet hashSet1 = new HashSet(Arrays.asList(ˎᵢ0.MTH925("wb_fav_list", "").split(";")));
                hashSet1.remove(s1);
                hashSet1.add(s);
                ˎᵢ0.MTH922(TextUtils.join(";", hashSet1), "wb_fav_list");
                String s3 = CLS182.MTH3484(4100833241642881845L, new StringBuilder(), s);
                ˎᵢ0.MTH922(ˎᵢ0.MTH939("", CLS182.MTH3484(4100833271707652917L, new StringBuilder(), s1)), s3);
                ˎᵢ0.MTH932("wbfav_" + s1);
                arrayList0.remove(s1);
                arrayList0.add(s);
                ﾞᵎ0.notifyDataSetChanged();
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(s) && !arrayList0.contains(s)) {
                    arrayList0.add(s);
                    ˎᵢ0.MTH922(TextUtils.join(",", arrayList0), s1);
                    ﾞᵎ0.notifyDataSetChanged();
                }
                return;
            }
            default: {
                HashSet hashSet0 = new HashSet(Arrays.asList(ˎᵢ0.MTH925("moments_container_list", "").split(";")));
                hashSet0.remove(s1);
                hashSet0.add(s);
                ˎᵢ0.MTH922(TextUtils.join(";", hashSet0), "moments_container_list");
                String s2 = CLS182.MTH3484(4101242457536910133L, new StringBuilder(), s);
                ˎᵢ0.MTH922(ˎᵢ0.MTH939("", CLS182.MTH3484(0x38EA8A5B2B3CD335L, new StringBuilder(), s1)), s2);
                ˎᵢ0.MTH932("momentscontainer_" + s1);
                arrayList0.remove(s1);
                arrayList0.add(s);
                ﾞᵎ0.notifyDataSetChanged();
            }
        }
    }
}

