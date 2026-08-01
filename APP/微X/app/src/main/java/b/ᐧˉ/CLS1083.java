// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˈˊ.CLS99;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS523;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1083 implements CLS3 {
    public final int FLD2334;
    public final Activity FLD2335;
    public final CLS1078 FLD2336;

    public CLS1083(CLS1078 ـˆ0, Activity activity0, int v) {
        this.FLD2334 = v;
        this.FLD2336 = ـˆ0;
        this.FLD2335 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD2335;
        CLS1078 ـˆ0 = this.FLD2336;
        switch(this.FLD2334) {
            case 0: {
                ـˆ0.getClass();
                CLS523.MTH7142(activity0, ((CLS11)new CLS1075(ـˆ0)));
                return;
            }
            case 1: {
                ـˆ0.getClass();
                CLS31.MTH991(activity0, ((CLS441)new CLS1031(ـˆ0, activity0)));
                return;
            }
            default: {
                ـˆ0.getClass();
                try {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: ـˆ0.FLD2314) {
                        jSONArray0.put(((CLS99)object0).MTH1933());
                    }
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("wx_tasks", jSONArray0);
                    CLS31.MTH999(activity0, jSONObject0.toString(), CLS27.MTH889("appname") + "_wx_tasks.json");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

