// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;

public final class CLS203 implements CLS141 {
    public final ArrayList FLD186;
    public final CLS216 FLD187;

    public CLS203(CLS216 ˎﾞ0, ArrayList arrayList0) {
        this.FLD187 = ˎﾞ0;
        this.FLD186 = arrayList0;
        super();
    }

    @Override  // t.ⁱʾ.CLS141
    public final void MTH2165() {
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS141
    public final void MTH2166() {
        ArrayList arrayList0 = this.FLD186;
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: arrayList0) {
                jSONArray0.put(((JSONObject)object0));
            }
            this.FLD187.FLD135.MTH2125(jSONArray0, "theme_change_time");
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

