// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.text.TextUtils;
import d.יʻ.CLS69;
import d.ᐧי.CLS110;
import d.ⁱٴ.CLS121;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS130 implements CLS121 {
    public final ArrayList FLD79;
    public final HashMap FLD80;
    public final CLS110 FLD81;
    public final ArrayList FLD82;

    public CLS130(HashMap hashMap0, ArrayList arrayList0, ArrayList arrayList1, CLS110 ٴˑ0) {
        this.FLD80 = hashMap0;
        this.FLD79 = arrayList0;
        this.FLD82 = arrayList1;
        this.FLD81 = ٴˑ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS121
    public final void MTH1171(Object object0) {
        ArrayList arrayList0 = this.FLD79;
        ArrayList arrayList1 = this.FLD82;
        CLS110 ٴˑ0 = this.FLD81;
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            String s = jSONObject0.getString("key");
            this.FLD80.put(s, jSONObject0);
            if(!jSONObject0.optBoolean("valid", false) || jSONObject0.optBoolean("used")) {
                arrayList0.remove(s);
            }
            String s1 = CLS28.MTH534(jSONObject0);
            if(!TextUtils.isEmpty(s1)) {
                int v = arrayList1.indexOf(s);
                arrayList1.remove(s);
                arrayList1.add(v, s1);
                ٴˑ0.notifyDataSetChanged();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
    }
}

