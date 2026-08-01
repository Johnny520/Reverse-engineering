// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS25;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1436 implements CLS11 {
    public final ArrayList FLD4246;

    public CLS1436(ArrayList arrayList0) {
        this.FLD4246 = arrayList0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        try {
            ArrayList arrayList0 = this.FLD4246;
            JSONArray jSONArray0 = new JSONArray();
            if(!arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("wxid", ((ContentValues)object0).getAsString("wxid"));
                    jSONObject0.put("nickname", ((ContentValues)object0).getAsString("nickname"));
                    jSONArray0.put(jSONObject0);
                }
            }
            CLS31.MTH1010(CLS25.MTH865(1, "DisableWxid.json", "application/json"), jSONArray0.toString());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

