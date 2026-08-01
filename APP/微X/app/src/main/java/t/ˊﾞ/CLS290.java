// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import java.io.File;
import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS147;

public final class CLS290 implements CLS147 {
    public File FLD750;
    public String FLD751;
    public boolean FLD752;
    public String FLD753;
    public String FLD754;
    public int FLD755;
    public String FLD756;
    public String FLD757;
    public boolean FLD758;
    public String FLD759;

    // 此方法包含解密的字符串
    public CLS290() {
        this.FLD753 = "";
        this.FLD756 = "";
        this.FLD755 = 0;
        this.FLD757 = "";
        this.FLD754 = "";
        this.FLD759 = "";
        this.FLD758 = false;
        this.FLD751 = "";
        this.FLD752 = true;
    }

    // 此方法包含解密的字符串
    public CLS290(JSONObject jSONObject0) {
        this.FLD753 = "";
        this.FLD756 = "";
        this.FLD755 = 0;
        this.FLD757 = "";
        this.FLD754 = "";
        this.FLD759 = "";
        this.FLD758 = false;
        this.FLD751 = "";
        this.FLD752 = true;
        try {
            if(jSONObject0.has("text")) {
                this.FLD756 = jSONObject0.getString("text");
            }
            if(jSONObject0.has("order")) {
                this.FLD755 = jSONObject0.getInt("order");
            }
            if(jSONObject0.has("icon")) {
                this.FLD757 = jSONObject0.getString("icon");
            }
            if(jSONObject0.has("type")) {
                this.FLD754 = jSONObject0.getString("type");
            }
            if(jSONObject0.has("action")) {
                this.FLD759 = jSONObject0.getString("action");
            }
            if(jSONObject0.has("colorizeIcon")) {
                this.FLD758 = jSONObject0.getBoolean("colorizeIcon");
            }
            if(jSONObject0.has("iconColor")) {
                this.FLD751 = jSONObject0.getString("iconColor");
            }
            if(jSONObject0.has("enable")) {
                this.FLD752 = jSONObject0.getBoolean("enable");
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    @Override  // t.ⁱʾ.CLS147
    public final String getIcon() {
        return this.FLD757;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String getText() {
        return this.FLD756;
    }

    @Override  // t.ⁱʾ.CLS147
    public final boolean isEnabled() {
        return this.FLD752;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void setEnabled(boolean z) {
        this.FLD752 = z;
    }

    @Override
    public final String toString() {
        return this.MTH1782().toString();
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2182(String s) {
        this.FLD751 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2183(String s) {
        this.FLD754 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final boolean MTH2184() {
        return this.FLD758;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2185(String s) {
        this.FLD756 = s;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1782() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("text", this.FLD756);
            jSONObject0.put("order", this.FLD755);
            jSONObject0.put("icon", this.FLD757);
            jSONObject0.put("type", this.FLD754);
            jSONObject0.put("action", this.FLD759);
            jSONObject0.put("colorizeIcon", this.FLD758);
            jSONObject0.put("iconColor", this.FLD751);
            jSONObject0.put("enable", this.FLD752);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return jSONObject0;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2186() {
        return this.FLD759;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2187(String s) {
        this.FLD759 = s;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2188() {
        return this.FLD751;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2189(File file0) {
        this.FLD750 = file0;
    }

    @Override  // t.ⁱʾ.CLS147
    public final void MTH2190(boolean z) {
        this.FLD758 = z;
    }

    @Override  // t.ⁱʾ.CLS147
    public final String MTH2191() {
        return this.FLD754;
    }
}

