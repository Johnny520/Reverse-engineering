// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS142;
import t.ⁱʾ.CLS143;

public final class CLS230 implements CLS142 {
    public final JSONObject FLD274;
    public final CLS143 FLD275;

    public CLS230(JSONObject jSONObject0, CLS143 ˆٴ0) {
        this.FLD274 = jSONObject0;
        this.FLD275 = ˆٴ0;
        super();
    }

    @Override  // t.ⁱʾ.CLS142
    public final void MTH2167() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS142
    public final void MTH2168(String s) {
        try {
            this.FLD274.put("p", s);
            this.FLD275.MTH2169();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

