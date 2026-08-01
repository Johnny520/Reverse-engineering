// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import org.json.JSONObject;

public final class CLS78 {
    public Bitmap FLD270;
    public boolean FLD271;
    public final String FLD272;
    public String FLD273;
    public final String FLD274;
    public String FLD275;
    public String FLD276;
    public String FLD277;
    public int FLD278;

    // 此方法包含解密的字符串
    public CLS78() {
        this.FLD272 = "";
        this.FLD275 = "";
        this.FLD274 = "";
        this.FLD276 = "";
        this.FLD273 = "";
        this.FLD278 = -1;
        this.FLD277 = "";
        this.FLD271 = false;
    }

    // 此方法包含解密的字符串
    public CLS78(String s, String s1) {
        this.FLD274 = "";
        this.FLD276 = "";
        this.FLD273 = "";
        this.FLD278 = -1;
        this.FLD277 = "";
        this.FLD271 = false;
        this.FLD272 = s;
        this.FLD275 = s1;
    }

    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("u", this.FLD272);
            jSONObject0.put("n", this.FLD275);
            jSONObject0.put("h", 0);
            jSONObject0.put("t", 0);
            jSONObject0.put("a", this.FLD274);
            jSONObject0.put("al", this.FLD276);
            jSONObject0.put("v1", this.FLD273);
            if(this.FLD278 != -1) {
                jSONObject0.put("s", this.FLD278);
            }
            if(!TextUtils.isEmpty(this.FLD277)) {
                jSONObject0.put("l", this.FLD277);
                return jSONObject0.toString();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0.toString();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH1609() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final String MTH1610() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final String MTH1611() {
        return TextUtils.isEmpty(this.FLD275) ? "" : this.FLD275.trim();
    }

    public final boolean MTH1612() {
        return this.FLD270 != null;
    }
}

