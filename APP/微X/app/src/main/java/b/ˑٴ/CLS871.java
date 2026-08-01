// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS12;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS871 implements CLS12 {
    public final int FLD1454;
    public final CLS818 FLD1455;

    public CLS871(CLS818 ᵎⁱ0, int v) {
        this.FLD1454 = v;
        this.FLD1455 = ᵎⁱ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS12
    public final void MTH791(Object object0) {
        CLS818 ᵎⁱ0 = this.FLD1455;
        if(this.FLD1454 == 0) {
            ᵎⁱ0.getClass();
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                try {
                    JSONArray jSONArray0 = new JSONArray(s);
                    ArrayList arrayList0 = ᵎⁱ0.FLD1243;
                    arrayList0.clear();
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("username", jSONObject0.getString("username"));
                        contentValues0.put("nickname", jSONObject0.getString("nickname"));
                        contentValues0.put("sex", jSONObject0.getInt("sex"));
                        if(jSONObject0.has("lbs_ticket")) {
                            contentValues0.put("lbs_ticket", jSONObject0.getString("lbs_ticket"));
                        }
                        if(jSONObject0.has("antispam")) {
                            contentValues0.put("antispam", jSONObject0.getString("antispam"));
                        }
                        if(jSONObject0.has("location")) {
                            contentValues0.put("place", jSONObject0.getString("location"));
                        }
                        arrayList0.add(contentValues0);
                    }
                    return;
                }
                catch(Throwable unused_ex) {
                }
            }
            return;
        }
        ᵎⁱ0.getClass();
        ᵎⁱ0.MTH2795(CLS182.MTH3474(0x38EB28192B3CD335L, ((ContentValues)object0)), ((int)((ContentValues)object0).getAsInteger("delay")));
    }
}

