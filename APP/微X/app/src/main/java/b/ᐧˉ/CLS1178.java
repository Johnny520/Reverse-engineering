// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1178 implements CLS39, CLS378, CLS539 {
    public final int FLD2744;
    public final CLS1030 FLD2745;

    public CLS1178(CLS1030 ˎᵢ0, int v) {
        this.FLD2744 = v;
        this.FLD2745 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS1030 ˎᵢ0 = this.FLD2745;
        ˎᵢ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        CLS371.FLD3470.MTH5314(ˎᵢ0.FLD2157, arrayList0);
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                ˎᵢ0.FLD2136.add(ˊﾞ0);
                hashSet0.add("");
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2745.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS1030 ˎᵢ0 = this.FLD2745;
        switch(this.FLD2744) {
            case 1: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "remote_autoreply_master_on");
                return;
            }
            case 2: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "remote_autoreply_master_off");
                return;
            }
            case 4: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "chatgpt_for_bot_url");
                return;
            }
            case 5: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "openai_alt_api");
                return;
            }
            case 6: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "openai_proxy_http");
                return;
            }
            default: {
                ˎᵢ0.getClass();
                ˎᵢ0.FLD2151.MTH922(s, "openai_proxy_socks");
            }
        }
    }
}

