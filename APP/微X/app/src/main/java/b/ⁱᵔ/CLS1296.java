// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1296 implements CLS2 {
    public final JSONObject FLD3594;
    public final CLS3 FLD3595;
    public final String FLD3596;

    public CLS1296(JSONObject jSONObject0, String s, CLS3 ˆٴ0) {
        this.FLD3594 = jSONObject0;
        this.FLD3596 = s;
        this.FLD3595 = ˆٴ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        JSONObject jSONObject0 = this.FLD3594;
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            try {
                jSONObject0.put(this.FLD3596, s);
                CLS27.MTH895().MTH922(jSONObject0, "invite_key_tags");
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            this.FLD3595.MTH774();
        }
    }
}

