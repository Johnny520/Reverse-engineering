// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import java.io.File;
import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS147;

public final class CLS295 implements CLS147 {
    public boolean FLD825;
    public File FLD826;
    public String FLD827;
    public String FLD828;
    public String FLD829;
    public int FLD830;
    public String FLD831;
    public String FLD832;
    public boolean FLD833;

    // 此方法包含解密的字符串
    public CLS295() {
        this.FLD827 = "";
        this.FLD830 = 0;
        this.FLD829 = "";
        this.FLD831 = "";
        this.FLD828 = "";
        this.FLD833 = false;
        this.FLD832 = "";
        this.FLD825 = true;
    }

    // 此方法包含解密的字符串
    public CLS295(JSONObject jSONObject0) {
        this.FLD827 = "";
        this.FLD830 = 0;
        this.FLD829 = "";
        this.FLD831 = "";
        this.FLD828 = "";
        this.FLD833 = false;
        this.FLD832 = "";
        this.FLD825 = true;
        try {
            if(jSONObject0.has("text")) {
                this.FLD827 = jSONObject0.getString("text");
            }
            if(jSONObject0.has("order")) {
                this.FLD830 = jSONObject0.getInt("order");
            }
            if(jSONObject0.has("icon")) {
                this.FLD829 = jSONObject0.getString("icon");
            }
            if(jSONObject0.has("type")) {
                this.FLD831 = jSONObject0.getString("type");
            }
            if(jSONObject0.has("action")) {
                this.FLD828 = jSONObject0.getString("action");
            }
            if(jSONObject0.has("colorizeIcon")) {
                this.FLD833 = jSONObject0.getBoolean("colorizeIcon");
            }
            if(jSONObject0.has("iconColor")) {
                this.FLD832 = jSONObject0.getString("iconColor");
            }
            if(jSONObject0.has("enable")) {
                this.FLD825 = jSONObject0.getBoolean("enable");
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    @Override  // t.ⁱʾ.CLS147
    public final String getIcon() {
        return this.FLD829;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String getText() {
        return this.FLD827;
    }

    @Override  // t.ⁱʾ.CLS147
    public final boolean isEnabled() {
        return this.FLD825;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void setEnabled(boolean z) {
        this.FLD825 = z;
    }

    @Override
    public final String toString() {
        return this.MTH1885().toString();
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2182(String s) {
        this.FLD832 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2183(String s) {
        this.FLD831 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final boolean MTH2184() {
        return this.FLD833;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2185(String s) {
        this.FLD827 = s;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1885() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("text", this.FLD827);
            jSONObject0.put("order", this.FLD830);
            jSONObject0.put("icon", this.FLD829);
            jSONObject0.put("type", this.FLD831);
            jSONObject0.put("action", this.FLD828);
            jSONObject0.put("colorizeIcon", this.FLD833);
            jSONObject0.put("iconColor", this.FLD832);
            jSONObject0.put("enable", this.FLD825);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return jSONObject0;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2186() {
        return this.FLD828;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2187(String s) {
        this.FLD828 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2188() {
        return this.FLD832;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2189(File file0) {
        this.FLD826 = file0;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2190(boolean z) {
        this.FLD833 = z;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2191() {
        return this.FLD831;
    }
}

