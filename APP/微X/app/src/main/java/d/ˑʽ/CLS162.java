// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import d.ⁱٴ.CLS123;
import org.json.JSONObject;

public final class CLS162 implements CLS123 {
    public final String FLD237;
    public final int FLD238;
    public final JSONObject FLD239;

    public CLS162(String s, JSONObject jSONObject0, int v) {
        this.FLD238 = v;
        this.FLD237 = s;
        this.FLD239 = jSONObject0;
        super();
    }

    @Override  // d.ⁱٴ.CLS123
    public final void MTH1174() {
        JSONObject jSONObject0 = this.FLD239;
        String s = this.FLD237;
        if(this.FLD238 == 0) {
            CLS35.MTH581(s);
            CLS35.MTH578(jSONObject0);
            return;
        }
        CLS35.MTH581(s);
        CLS35.MTH589(jSONObject0);
    }
}

