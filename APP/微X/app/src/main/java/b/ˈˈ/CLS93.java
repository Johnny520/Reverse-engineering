// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS93 {
    public String FLD393;
    public String FLD394;
    public int FLD395;
    public String FLD396;
    public String FLD397;

    public CLS93(int v, String s, String s1) {
        this.FLD393 = s;
        this.FLD396 = s1;
        this.FLD395 = v;
    }

    public CLS93(int v, String s, String s1, String s2, String s3) {
        this.FLD393 = s;
        this.FLD396 = s1;
        this.FLD395 = v;
        this.FLD397 = s2;
        this.FLD394 = s3;
    }

    // 此方法包含解密的字符串
    public CLS93(JSONObject jSONObject0) {
        try {
            this.FLD393 = jSONObject0.getString("c");
            if(jSONObject0.has("tm")) {
                this.FLD397 = jSONObject0.getString("tm");
            }
            if(jSONObject0.has("extra")) {
                this.FLD394 = jSONObject0.getString("extra");
            }
            this.FLD396 = jSONObject0.getString("u");
            this.FLD395 = jSONObject0.getInt("t");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override
    public final String toString() {
        return this.MTH1751().toString();
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1751() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("c", this.FLD393);
            jSONObject0.put("tm", this.FLD397);
            jSONObject0.put("u", this.FLD396);
            jSONObject0.put("t", this.FLD395);
            jSONObject0.put("e", this.FLD394);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }
}

