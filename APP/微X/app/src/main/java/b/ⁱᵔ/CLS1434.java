// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS11;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import org.json.JSONObject;

public final class CLS1434 implements CLS11 {
    public final CLS69 FLD4236;
    public final CLS8 FLD4237;
    public final CLS1622 FLD4238;
    public final CLS1620 FLD4239;
    public final CLS1622 FLD4240;

    public CLS1434(CLS69 ʾᵢ0, CLS1620 ˊˏ0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, CLS1570 ᵢי0) {
        this.FLD4236 = ʾᵢ0;
        this.FLD4239 = ˊˏ0;
        this.FLD4238 = ˑٴ0;
        this.FLD4240 = ˑٴ1;
        this.FLD4237 = ᵢי0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        String s = (String)this.FLD4239.FLD5219.FLD5195.get(this.FLD4239.FLD5219.FLD5194);
        String s1 = (String)this.FLD4236.MTH1565(s);
        String s2 = this.FLD4238.MTH7285();
        String s3 = this.FLD4240.MTH7285();
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("name", s1);
            jSONObject0.put("label", s2);
            jSONObject0.put("cls", s3);
            this.FLD4237.MTH786(jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

