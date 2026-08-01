// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ⁱʾ.CLS369;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1364 implements CLS11 {
    public final CLS29 FLD3803;
    public final CLS369 FLD3804;
    public final ArrayList FLD3805;

    public CLS1364(CLS29 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD3803 = ˎᵢ0;
        this.FLD3805 = arrayList0;
        this.FLD3804 = ﾞᵎ0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            CLS29 ˎᵢ0 = this.FLD3803;
            for(Object object0: new HashSet(Arrays.asList(ˎᵢ0.MTH925("wb_fav_list", "").split(";")))) {
                ˎᵢ0.MTH932("wbfav_" + ((String)object0));
            }
            ˎᵢ0.MTH922("", "wb_fav_list");
            this.FLD3805.clear();
            this.FLD3804.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

