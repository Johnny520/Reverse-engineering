// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import org.json.JSONArray;

public final class CLS729 implements CLS16 {
    public final int FLD895;
    public final JSONArray FLD896;
    public final CLS818 FLD897;

    public CLS729(CLS818 ᵎⁱ0, JSONArray jSONArray0, int v) {
        this.FLD895 = v;
        this.FLD897 = ᵎⁱ0;
        this.FLD896 = jSONArray0;
        super();
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        JSONArray jSONArray0 = this.FLD896;
        CLS818 ᵎⁱ0 = this.FLD897;
        if(this.FLD895 == 0) {
            ᵎⁱ0.getClass();
            if(TextUtils.isEmpty(s)) {
                s = CLS27.MTH889(CLS370.MTH5289(0x38EB2CF72B3CD335L));
            }
            Activity activity0 = ((CLS140)ᵎⁱ0).MTH3042();
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append(CLS370.MTH5289(4101420853298516789L));
            stringBuilder0.append(CLS27.MTH904());
            CLS31.MTH999(activity0, jSONArray0.toString(), CLS31.MTH979(stringBuilder0.toString(), CLS370.MTH5289(4101420861888451381L)));
            return;
        }
        ᵎⁱ0.getClass();
        if(TextUtils.isEmpty(s)) {
            s = CLS370.MTH5289(4101421248435508021L);
        }
        CLS31.MTH999(((CLS140)ᵎⁱ0).MTH3042(), jSONArray0.toString(), CLS31.MTH979(s, CLS370.MTH5289(4101421304270082869L)));
    }
}

