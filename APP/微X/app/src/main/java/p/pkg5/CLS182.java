// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import org.json.JSONObject;
import p.pkg11.CLS196;
import p.pkg11.CLS74;
import p.pkg12.CLS76;
import p.pkg8.CLS44;

public final class CLS182 implements CLS26 {
    public final int FLD300;
    public final String FLD301;
    public final CLS76 FLD302;

    public CLS182(CLS196 ᴵᐧ0, String s, int v) {
        this.FLD300 = v;
        this.FLD302 = ᴵᐧ0;
        this.FLD301 = s;
        super();
    }

    // 此方法包含解密的字符串
    public final void MTH831(CLS28 ˎᵔ$ﾞᵢ0) {
        CLS76 ﾞᵢ0 = this.FLD302;
        String s = this.FLD301;
        if(this.FLD300 == 0) {
            if(ˎᵔ$ﾞᵢ0.FLD292 == null) {
                ((CLS196)ﾞᵢ0).MTH1151(null);
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject((ˎᵔ$ﾞᵢ0.FLD292 == null ? "" : new String(ˎᵔ$ﾞᵢ0.FLD292)));
                CLS23.MTH809(("" + jSONObject0));
                if(!CLS24.MTH814(s) && jSONObject0.optInt("code") == 100) {
                    JSONObject jSONObject1 = jSONObject0.getJSONObject("data");
                    CLS74 ﾞˈ0 = new CLS74();
                    ﾞˈ0.FLD444 = jSONObject1.getString("voideurl");
                    ﾞˈ0.FLD445 = jSONObject1.getString("photo");
                    CLS24.FLD280.put(s, ﾞˈ0);
                    ((CLS196)ﾞᵢ0).MTH1151(ﾞˈ0);
                    return;
                }
                ((CLS196)ﾞᵢ0).MTH1151(null);
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
            return;
        }
        if(ˎᵔ$ﾞᵢ0.FLD292 == null) {
            ((CLS196)ﾞᵢ0).MTH1151(null);
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((ˎᵔ$ﾞᵢ0.FLD292 == null ? "" : new String(ˎᵔ$ﾞᵢ0.FLD292)));
            CLS23.MTH809(("" + jSONObject2));
            if(!CLS24.MTH814(s) && jSONObject2.optInt("code") == 200) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                CLS74 ﾞˈ1 = new CLS74();
                ﾞˈ1.FLD444 = jSONObject3.getString("url");
                ﾞˈ1.FLD445 = jSONObject3.getString("cover");
                CLS24.FLD280.put(s, ﾞˈ1);
                ((CLS196)ﾞᵢ0).MTH1151(ﾞˈ1);
                return;
            }
            ((CLS196)ﾞᵢ0).MTH1151(null);
        }
        catch(Throwable throwable1) {
            CLS44.MTH897(throwable1);
        }
    }
}

