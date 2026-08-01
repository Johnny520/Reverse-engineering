// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ˈˊ.CLS99;
import java.util.ArrayList;

public final class CLS970 implements CLS11 {
    public final ArrayList FLD1896;
    public final ArrayList FLD1897;
    public final CLS99 FLD1898;
    public final CLS3 FLD1899;

    public CLS970(ArrayList arrayList0, CLS99 ﾞᵎ0, ArrayList arrayList1, CLS3 ˆٴ0) {
        this.FLD1896 = arrayList0;
        this.FLD1898 = ﾞᵎ0;
        this.FLD1897 = arrayList1;
        this.FLD1899 = ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        ArrayList arrayList0 = this.FLD1896;
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS99 ﾞᵎ0 = this.FLD1898;
        if(ﾞᵎ0.FLD489) {
            for(Object object0: arrayList0) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(((String)object0));
                stringBuilder0.append(" ");
                stringBuilder0.append(((String)this.FLD1897.get(0)));
                String s = stringBuilder0.toString();
                if(!TextUtils.isEmpty(s)) {
                    ﾞᵎ0.FLD496.add(s);
                }
            }
        }
        CLS3 ˆٴ0 = this.FLD1899;
        if(ˆٴ0 != null) {
            ˆٴ0.MTH774();
        }
    }
}

