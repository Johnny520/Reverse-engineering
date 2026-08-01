// Decompiled by JEB v5.42.0.202606242140

package d.ᐧˈ;

import android.text.TextUtils;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS36;
import d.יʻ.CLS61;
import d.יʻ.CLS62;
import d.יʻ.CLS68;
import d.ٴˑ.CLS179.CLS78;
import d.ٴˑ.CLS190.CLS97;
import d.ٴˑ.CLS83.CLS81;
import d.ٴˑ.CLS87.CLS86;

public final class CLS197 implements CLS78, CLS81, CLS86, CLS97 {
    public final CLS204 FLD591;
    public final int FLD592;

    public CLS197(CLS204 ᵎᐧ0, int v) {
        this.FLD592 = v;
        this.FLD591 = ᵎᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.ٴˑ.CLS83$CLS81
    public final void MTH921(String s) {
        this.FLD591.getClass();
        CLS61 ˉᵢ0 = this.FLD591.FLD585;
        if(ˉᵢ0.MTH748("manual_language_selection", false)) {
            ˉᵢ0.MTH741(s, "current_language");
            CLS62 ˎˏ0 = CLS62.FLD317;
            Object[] arr_object = {s, null};
            String s1 = ((CLS36)CLS68.FLD326.MTH786(CLS36.class)).MTH595();
            if(s1.equals("xv") && !CLS13.MTH430()) {
                s1 = "";
            }
            arr_object[1] = s1;
            ˎˏ0.MTH758("setLanguage", arr_object);
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ٴˑ.CLS87$CLS86
    public final void MTH932(String s, int v) {
        CLS204 ᵎᐧ0 = this.FLD591;
        if(this.FLD592 == 4) {
            ᵎᐧ0.getClass();
            ᵎᐧ0.FLD585.MTH741(s, "toolbar_color");
            return;
        }
        ᵎᐧ0.getClass();
        ᵎᐧ0.FLD585.MTH741(s, "toolbar_text_color");
    }

    // 此方法包含解密的字符串
    @Override  // d.ٴˑ.CLS190$CLS97
    public final void MTH1016(String s) {
        CLS204 ᵎᐧ0 = this.FLD591;
        switch(this.FLD592) {
            case 0: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(s, "wx_settings_name");
                return;
            }
            case 2: {
                ᵎᐧ0.getClass();
                ᵎᐧ0.FLD585.MTH741(s, "wx_settings_keyword");
                return;
            }
            default: {
                ᵎᐧ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v = Integer.parseInt(s);
                    if(v != 0) {
                        v = Math.max(200, v);
                    }
                    ᵎᐧ0.FLD585.MTH741(v, "wx_custom_dialog_width");
                }
            }
        }
    }
}

