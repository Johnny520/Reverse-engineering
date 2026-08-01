// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1258;
import b.ⁱᵔ.CLS1557;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387.CLS1319;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS523;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class CLS856 implements CLS3 {
    public final int FLD1353;
    public final String FLD1354;
    public final Activity FLD1355;

    public CLS856(Activity activity0, String s) {
        this.FLD1353 = 4;
        super();
        this.FLD1354 = s;
        this.FLD1355 = activity0;
    }

    public CLS856(Activity activity0, String s, int v) {
        this.FLD1353 = v;
        this.FLD1355 = activity0;
        this.FLD1354 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD1355;
        String s = this.FLD1354;
        switch(this.FLD1353) {
            case 0: {
                CLS403.MTH5871(activity0, s);
                return;
            }
            case 1: {
                CLS395.MTH5736(CLS27.MTH889("send"), activity0, ((CLS8)new CLS1557(s)), new HashSet(), false);
                return;
            }
            case 2: {
                CLS523.MTH7142(activity0, ((CLS11)new CLS1319(s)));
                return;
            }
            case 3: {
                CLS523.MTH7165(activity0, CLS27.MTH889("modify"), "", s, 1, ((CLS16)new CLS1258(15, s)));
                return;
            }
            default: {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object0: CLS371.FLD3470.MTH5373()) {
                    String s1 = (String)object0;
                    if(!s1.equals(s)) {
                        linkedHashMap0.put(s1, s1);
                    }
                }
                CLS523.MTH7136(false, activity0, CLS27.MTH889("contact_tags"), "", linkedHashMap0, true, ((CLS7)new CLS1258(14, s)), null, null, true);
            }
        }
    }
}

