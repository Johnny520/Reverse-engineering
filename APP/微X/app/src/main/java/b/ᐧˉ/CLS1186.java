// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ﾞˎ.CLS1625;

public final class CLS1186 implements CLS39 {
    public final int FLD2776;
    public final CLS1625 FLD2777;

    public CLS1186(CLS1625 ـˏ0, int v) {
        this.FLD2776 = v;
        this.FLD2777 = ـˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1625 ـˏ0 = this.FLD2777;
        if(this.FLD2776 == 0) {
            ـˏ0.MTH798(CLS27.MTH882("openai_web_desc") + "<br>" + CLS27.MTH889("service_not_available"));
            return;
        }
        ـˏ0.MTH798("");
        ـˏ0.FLD5289.setEnabled(true);
    }
}

