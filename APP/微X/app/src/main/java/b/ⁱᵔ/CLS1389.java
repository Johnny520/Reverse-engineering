// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1389 implements CLS11 {
    public final CLS29 FLD3933;
    public final ArrayList FLD3934;
    public final String FLD3935;
    public final CLS369 FLD3936;

    public CLS1389(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD3933 = ˎᵢ0;
        this.FLD3935 = s;
        this.FLD3934 = arrayList0;
        this.FLD3936 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            HashSet hashSet0 = new HashSet(Arrays.asList(this.FLD3933.MTH925("wb_fav_list", "").split(";")));
            hashSet0.remove(this.FLD3935);
            String s = TextUtils.join(";", hashSet0);
            this.FLD3933.MTH922(s, "wb_fav_list");
            this.FLD3933.MTH932("wbfav_" + this.FLD3935);
            this.FLD3934.remove(this.FLD3935);
            this.FLD3936.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

