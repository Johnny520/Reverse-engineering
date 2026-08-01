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

public final class CLS1500 implements CLS11 {
    public final CLS29 FLD4537;
    public final ArrayList FLD4538;
    public final String FLD4539;
    public final CLS369 FLD4540;

    public CLS1500(CLS369 ﾞᵎ0, CLS29 ˎᵢ0, String s, ArrayList arrayList0) {
        this.FLD4537 = ˎᵢ0;
        this.FLD4539 = s;
        this.FLD4538 = arrayList0;
        this.FLD4540 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            HashSet hashSet0 = new HashSet(Arrays.asList(this.FLD4537.MTH925("moments_container_list", "").split(";")));
            hashSet0.remove(this.FLD4539);
            String s = TextUtils.join(";", hashSet0);
            this.FLD4537.MTH922(s, "moments_container_list");
            this.FLD4537.MTH932("momentscontainer_" + this.FLD4539);
            this.FLD4538.remove(this.FLD4539);
            this.FLD4540.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

