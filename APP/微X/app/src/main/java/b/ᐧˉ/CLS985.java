// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʻˑ.CLS11;
import b.ʾᵢ.CLS27;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS985 implements CLS11 {
    public final String FLD1953;
    public final CLS1112 FLD1954;

    public CLS985(CLS1112 ᐧˏ0, String s) {
        this.FLD1954 = ᐧˏ0;
        this.FLD1953 = s;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        JSONArray jSONArray0 = new JSONArray();
        CLS1112 ᐧˏ0 = this.FLD1954;
        for(Object object0: ᐧˏ0.FLD2482) {
            JSONObject jSONObject0 = (JSONObject)object0;
            try {
                String s = jSONObject0.getString("n");
                if(this.FLD1953.equals(s)) {
                    ᐧˏ0.FLD2482.remove(jSONObject0);
                    continue;
                }
                jSONArray0.put(jSONObject0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        ᐧˏ0.FLD2151.MTH922(jSONArray0.toString(), "block_templates");
        ᐧˏ0.FLD2459.notifyDataSetChanged();
    }
}

