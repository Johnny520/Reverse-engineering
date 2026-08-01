// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS950 implements CLS3 {
    public final int FLD1824;
    public final JSONObject FLD1825;
    public final CLS1112 FLD1826;

    public CLS950(CLS1112 ᐧˏ0, JSONObject jSONObject0, int v) {
        this.FLD1824 = v;
        this.FLD1826 = ᐧˏ0;
        this.FLD1825 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        JSONObject jSONObject0 = this.FLD1825;
        CLS1112 ᐧˏ0 = this.FLD1826;
        if(this.FLD1824 == 0) {
            ᐧˏ0.MTH4197(jSONObject0);
            return;
        }
        ᐧˏ0.getClass();
        try {
            jSONObject0.put("t", ᐧˏ0.MTH4201());
            jSONObject0.put("e", (ᐧˏ0.FLD2476.MTH7444() ? 1 : 0));
            ᐧˏ0.MTH4197(jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

