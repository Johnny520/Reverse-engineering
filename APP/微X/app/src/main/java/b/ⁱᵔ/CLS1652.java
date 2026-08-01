// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS573;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1652 implements CLS563 {
    public final CLS12 FLD5099;
    public final String FLD5100;
    public final String[] FLD5101;
    public final CLS29 FLD5102;

    public CLS1652(CLS573 ⁱʽ0, String[] arr_s, String s, CLS29 ˎᵢ0) {
        this.FLD5099 = ⁱʽ0;
        this.FLD5101 = arr_s;
        this.FLD5100 = s;
        this.FLD5102 = ˎᵢ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS29 ˎᵢ0 = this.FLD5102;
        String s = this.FLD5100;
        String s1 = this.FLD5101[0];
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        CLS12 ᵔʾ0 = this.FLD5099;
        if(ᵔʾ0 != null) {
            ᵔʾ0.MTH791(s1);
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(ˎᵢ0.MTH925("momentscontainer_" + s1, ""))));
                hashSet0.add(s);
                ˎᵢ0.MTH922(TextUtils.join(";", hashSet0), "momentscontainer_" + s1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS563
    public final void MTH775() {
        this.FLD5099.MTH791("");
    }
}

