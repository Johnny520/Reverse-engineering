// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.ContentValues;
import android.text.TextUtils;
import d.יʻ.CLS69;
import d.ᐧי.CLS113;
import d.ⁱٴ.CLS121;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS156 implements CLS121 {
    public final HashSet FLD204;
    public final ArrayList FLD205;
    public final CLS113 FLD206;

    public CLS156(ArrayList arrayList0, HashSet hashSet0, CLS113 ᵎʻ0) {
        this.FLD205 = arrayList0;
        this.FLD204 = hashSet0;
        this.FLD206 = ᵎʻ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ⁱٴ.CLS121
    public final void MTH1171(Object object0) {
        JSONArray jSONArray0 = (JSONArray)object0;
        if(jSONArray0 != null) {
            ArrayList arrayList0 = this.FLD205;
            arrayList0.clear();
            this.FLD204.clear();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    String s = jSONObject0.getString("wxid");
                    String s1 = CLS7.FLD41.MTH414(s);
                    if(TextUtils.isEmpty(s1) || s1.equals(s)) {
                        s1 = jSONObject0.getString("nickname");
                    }
                    if(!s1.equals(s)) {
                        s = s + "<br>" + s1;
                    }
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("key", jSONObject0.getString("key"));
                    contentValues0.put("desc", s);
                    arrayList0.add(contentValues0);
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
            this.FLD206.MTH1129(arrayList0);
        }
    }
}

