// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS288;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS1625;
import java.util.ArrayList;
import java.util.Collections;

public final class CLS735 implements CLS39 {
    public final int FLD911;
    public final int FLD912;
    public final int FLD913;
    public final Object FLD914;

    public CLS735(Object object0, int v, int v1, int v2) {
        this.FLD911 = v2;
        this.FLD914 = object0;
        this.FLD913 = v;
        this.FLD912 = v1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v = this.FLD912;
        int v1 = this.FLD913;
        Object object0 = this.FLD914;
        if(this.FLD911 == 0) {
            ArrayList arrayList0 = ((CLS818)object0).FLD1243;
            int v2 = Math.min(v1, arrayList0.size());
            String s = CLS27.MTH895().MTH925("nearby_friend_req_excl", "");
            String s1 = CLS372.MTH5418("nearby_friendreq_type", "nearby");
            int v3 = ((CLS818)object0).FLD1445.MTH927(0, "friendreq_order");
            if(v3 == 1) {
                Collections.reverse(arrayList0);
            }
            else if(v3 == 2) {
                Collections.shuffle(arrayList0);
            }
            int v4 = 1;
            for(Object object1: arrayList0) {
                ContentValues contentValues0 = (ContentValues)object1;
                String s2 = contentValues0.getAsString("username");
                if(!CLS502.MTH6934(s, new String[]{s2})) {
                    CLS288 ˈˊ0 = CLS288.FLD2989;
                    if(!ˈˊ0.MTH4730(s2) && (v == -1 || v == CLS182.MTH3474(4101420475341394741L, contentValues0))) {
                        CLS85 ـˏ0 = new CLS85(s2, contentValues0.getAsString("nickname"), s1);
                        ـˏ0.FLD329 = true;
                        ـˏ0.FLD330 = CLS83.FLD320;
                        if(contentValues0.containsKey("antispam")) {
                            ـˏ0.FLD339 = contentValues0.getAsString("antispam");
                        }
                        ˈˊ0.MTH4731(ـˏ0);
                        if(v1 != -1) {
                            if(v2 == v4) {
                                break;
                            }
                            ++v4;
                        }
                    }
                }
            }
            CLS412.MTH6014(((CLS140)(((CLS818)object0))).MTH3042(), CLS27.MTH889("start_friend_request"));
            CLS288.FLD2989.MTH4734();
            return;
        }
        ((CLS1625)object0).MTH798("" + (v1 - v));
    }
}

