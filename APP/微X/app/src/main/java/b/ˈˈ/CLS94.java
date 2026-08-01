// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import org.json.JSONObject;

public final class CLS94 {
    public String FLD398;
    public int FLD399;
    public int FLD400;
    public String FLD401;
    public int FLD402;
    public int FLD403;
    public int FLD404;

    // 此方法包含解密的字符串
    public CLS94() {
        this(CLS31.MTH1012("watermark_"));
    }

    // 此方法包含解密的字符串
    public CLS94(String s) {
        if(TextUtils.isEmpty(s)) {
            s = CLS31.MTH1012("watermark_");
        }
        this.FLD398 = s;
        this.FLD401 = "";
        this.FLD400 = 0xFFFF0064;
        this.FLD402 = 100;
        this.FLD399 = 3;
        this.FLD404 = 0;
        this.FLD403 = 50;
    }

    // 此方法包含解密的字符串
    public CLS94(JSONObject jSONObject0) {
        try {
            this.FLD398 = jSONObject0.getString("filename");
            this.FLD401 = jSONObject0.getString("text");
            this.FLD400 = jSONObject0.getInt("textColor");
            this.FLD402 = jSONObject0.getInt("imgAlpha");
            this.FLD404 = jSONObject0.getInt("textPlace");
            this.FLD399 = jSONObject0.getInt("imgPlace");
            this.FLD403 = jSONObject0.getInt("textSize");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override
    public final String toString() {
        return this.MTH1756().toString();
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1756() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("filename", this.FLD398);
            jSONObject0.put("text", this.FLD401);
            jSONObject0.put("textColor", this.FLD400);
            jSONObject0.put("textPlace", this.FLD404);
            jSONObject0.put("textSize", this.FLD403);
            jSONObject0.put("imgAlpha", this.FLD402);
            jSONObject0.put("imgPlace", this.FLD399);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }
}

