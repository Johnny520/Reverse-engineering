// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class CLS1643 extends CLS606 {
    public CLS1643() {
        this.FLD501 = 7;
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final void MTH1930(Activity activity0) {
        String s = this.FLD474.isEmpty() ? "" : ((String)this.FLD474.get(0));
        CLS523.MTH7165(activity0, CLS27.MTH889("mass_announce"), "", s, 1, ((CLS16)new CLS1229(16, this)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final String MTH1934() {
        return CLS27.MTH889("mass_announce");
    }

    @Override  // b.ˈˊ.CLS606
    public final void MTH1936() {
        ArrayList arrayList0 = this.FLD474;
        if(arrayList0.isEmpty()) {
            return;
        }
        ArrayList arrayList1 = this.FLD470;
        if(arrayList1 != null && !arrayList1.isEmpty()) {
            String s = (String)arrayList0.get(0);
            if(TextUtils.isEmpty(s)) {
                return;
            }
            for(Object object0: arrayList1) {
                CLS66.MTH1376(((String)object0), s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˈˊ.CLS606
    public final void MTH1938(Activity activity0) {
        public final class CLS609 implements CLS2 {
            public final CLS1643 FLD486;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1643.this.FLD470.clear();
                List list0 = Arrays.asList(CLS502.MTH6941(s));
                CLS1643.this.FLD470.addAll(list0);
            }
        }

        HashSet hashSet0 = new HashSet();
        String s = CLS27.MTH904();
        CLS371.FLD3470.MTH5310(s, hashSet0);
        CLS387.MTH5585(false, activity0, CLS372.MTH5414(hashSet0), ((CLS2)new CLS609(this)), TextUtils.join(",", this.FLD470), -1);
    }
}

