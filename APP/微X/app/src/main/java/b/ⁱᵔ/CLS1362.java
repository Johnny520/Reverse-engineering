// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40;
import b.ᐧˉ.CLS182;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1362 implements CLS12 {
    public final int FLD3797;
    public final String[] FLD3798;

    public CLS1362(String[] arr_s, int v) {
        this.FLD3797 = v;
        this.FLD3798 = arr_s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        String[] arr_s = this.FLD3798;
        if(this.FLD3797 == 0) {
            arr_s[0] = (String)object0;
            return;
        }
        String s = arr_s[0];
        if(!TextUtils.isEmpty(((String)object0)) && !TextUtils.isEmpty(s)) {
            CLS29 ˎᵢ0 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
            HashSet hashSet0 = new HashSet(Arrays.asList(ˎᵢ0.MTH925(CLS182.MTH3484(4100834628917318453L, new StringBuilder(), ((String)object0)), "").split(";")));
            hashSet0.add(s);
            String s1 = CLS182.MTH3484(4100834671866991413L, new StringBuilder(), ((String)object0));
            ˎᵢ0.MTH922(TextUtils.join(";", hashSet0), s1);
        }
    }
}

