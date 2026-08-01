// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1510 implements CLS12 {
    public final int FLD4598;
    public final ArrayList FLD4599;

    public CLS1510(int v, ArrayList arrayList0) {
        this.FLD4598 = v;
        this.FLD4599 = arrayList0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        ArrayList arrayList0 = this.FLD4599;
        switch(this.FLD4598) {
            case 0: {
                if(!TextUtils.isEmpty(((String)object0)) && !arrayList0.contains(((String)object0))) {
                    arrayList0.add(((String)object0));
                }
                return;
            }
            case 1: {
                if(!TextUtils.isEmpty(((String)object0))) {
                    arrayList0.remove(((String)object0));
                }
                return;
            }
            default: {
                if(!TextUtils.isEmpty(((String)object0)) && !arrayList0.isEmpty()) {
                    CLS29 ˎᵢ0 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
                    HashSet hashSet0 = new HashSet();
                    hashSet0.addAll(Arrays.asList(ˎᵢ0.MTH925(CLS182.MTH3484(4100832412714193717L, new StringBuilder(), ((String)object0)), "").split(";")));
                    hashSet0.addAll(arrayList0);
                    String s = CLS182.MTH3484(4100832455663866677L, new StringBuilder(), ((String)object0));
                    ˎᵢ0.MTH922(TextUtils.join(";", hashSet0), s);
                }
            }
        }
    }
}

