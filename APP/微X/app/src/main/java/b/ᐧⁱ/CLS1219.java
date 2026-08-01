// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import org.json.JSONObject;

public final class CLS1219 implements CLS14 {
    public final String FLD2891;

    public CLS1219(String s) {
        this.FLD2891 = s;
    }

    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        String s5;
        String s4 = this.FLD2891;
        if(TextUtils.isEmpty(s4)) {
            return;
        }
        CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("welm_api_url"));
        ˊⁱ0.FLD4078 = "POST";
        ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(15000, "welm_read_timeout");
        ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(15000, "welm_connection_timeout");
        ˊⁱ0.FLD4085 = true;
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("prompt", s);
            jSONObject0.put("model", "xl");
            s5 = jSONObject0.toString();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            s5 = "";
        }
        ˊⁱ0.FLD4083.put("Content-Type", "application/json");
        ˊⁱ0.FLD4083.put("Authorization", "Bearer " + s4);
        ˊⁱ0.FLD4073 = s5;
        ˊⁱ0.MTH6078(((CLS420)new CLS1229(12, ᐧˉ0)));
    }
}

