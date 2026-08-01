// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import org.json.JSONObject;
import t.ᵔʾ.CLS133;

public final class CLS107 {
    public final String FLD799;
    public String FLD800;
    public final String FLD801;
    public final String FLD802;
    public String FLD803;

    // 此方法包含解密的字符串
    public CLS107() {
        this.FLD799 = "";
        this.FLD802 = "";
        this.FLD801 = "";
        this.FLD803 = "";
        this.FLD800 = "";
        new String("");
    }

    // 此方法包含解密的字符串
    public CLS107(String s, String s1) {
        this.FLD801 = "";
        this.FLD803 = "";
        this.FLD800 = "";
        new String("");
        this.FLD799 = s;
        this.FLD802 = s1;
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("u", this.FLD799);
            jSONObject0.put("n", this.FLD802);
            jSONObject0.put("h", 0);
            jSONObject0.put("t", 0);
            jSONObject0.put("a", this.FLD801);
            jSONObject0.put("d", 0);
            jSONObject0.put("al", this.FLD803);
            jSONObject0.put("v1", this.FLD800);
            return jSONObject0.toString();
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return jSONObject0.toString();
        }
    }

    public final String MTH1857() [...] // 潜在的解密器
}

