// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import b.ʾᵢ.CLS27;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS502;
import org.json.JSONObject;

public final class CLS91 {
    public String FLD382;
    public String FLD383;
    public String FLD384;
    public String FLD385;
    public int FLD386;
    public String FLD387;
    public JSONObject FLD388;

    // 此方法包含解密的字符串
    public CLS91(int v, String s, String s1, String s2) {
        new String("");
        this.FLD382 = s;
        this.FLD387 = s;
        this.FLD385 = s1;
        this.FLD383 = s1;
        this.FLD384 = s2;
        this.FLD386 = v;
    }

    public CLS91(JSONObject jSONObject0) {
        this.FLD382 = CLS370.MTH5289(4101504235793601333L);
        this.FLD385 = CLS370.MTH5289(4101504240088568629L);
        try {
            this.FLD382 = jSONObject0.getString(CLS370.MTH5289(4101503930850923317L));
            this.FLD385 = jSONObject0.getString(CLS370.MTH5289(4101503939440857909L));
            if(jSONObject0.has(CLS370.MTH5289(4101503948030792501L))) {
                this.FLD384 = jSONObject0.getString(CLS370.MTH5289(4101503956620727093L));
            }
            this.FLD386 = jSONObject0.getInt(CLS370.MTH5289(4101503965210661685L));
            this.FLD383 = jSONObject0.getString(CLS370.MTH5289(4101503973800596277L));
            this.FLD387 = jSONObject0.getString(CLS370.MTH5289(4101503982390530869L));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        return this.FLD382 + " | " + this.FLD383 + " | " + this.FLD385 + " | " + this.FLD384 + " | " + this.FLD386;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1733() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("k", this.FLD382);
            jSONObject0.put("r", this.MTH1737());
            jSONObject0.put("u", this.FLD384);
            jSONObject0.put("e", this.FLD386);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return jSONObject0;
    }

    public final int MTH1734() {
        return this.FLD386;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final String MTH1735() {
        return !CLS502.MTH6934(this.FLD385, new String[]{"-="}) || !CLS502.MTH6934(this.FLD385, new String[]{"=-"}) ? this.FLD385.trim() : this.FLD385.substring(0, this.FLD385.indexOf("-=")).trim();
    }

    public final String MTH1736() {
        return this.FLD382.trim();
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final String MTH1737() {
        String s = this.FLD388 == null ? "" : "-=" + this.FLD388 + "=-";
        return this.MTH1735() + s;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1738() {
        if(this.FLD388 == null) {
            try {
                if(CLS502.MTH6934(this.FLD385, new String[]{"-="}) && CLS502.MTH6934(this.FLD385, new String[]{"=-"})) {
                    this.FLD388 = new JSONObject(this.FLD385.substring(this.FLD385.indexOf("-=") + 2, this.FLD385.indexOf("=-")));
                    return this.FLD388;
                }
                if(this.FLD385.startsWith("{")) {
                    JSONObject jSONObject0 = new JSONObject(this.FLD385);
                    if(jSONObject0.has("meta")) {
                        return jSONObject0.getJSONObject("meta");
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return this.FLD388;
    }

    public final void MTH1739(String s) {
        this.FLD384 = s;
    }

    // 此方法包含解密的字符串
    public final void MTH1740(JSONObject jSONObject0) {
        if(this.FLD385.startsWith("{")) {
            try {
                JSONObject jSONObject1 = new JSONObject(this.FLD385);
                jSONObject1.put("meta", jSONObject0);
                this.FLD385 = jSONObject1.toString();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        this.FLD388 = jSONObject0;
    }
}

