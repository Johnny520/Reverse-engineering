// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS1392;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS443.CLS1450;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;

public final class CLS263 implements View.OnClickListener {
    public final int FLD2754;
    public final Activity FLD2755;
    public final CLS1622 FLD2756;

    public CLS263(Activity activity0, CLS1622 ˑٴ0, int v) {
        this.FLD2754 = v;
        this.FLD2755 = activity0;
        this.FLD2756 = ˑٴ0;
        super();
    }

    public CLS263(CLS1622 ˑٴ0, Activity activity0, int v) {
        this.FLD2754 = v;
        this.FLD2756 = ˑٴ0;
        this.FLD2755 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2755;
        CLS1622 ˑٴ0 = this.FLD2756;
        switch(this.FLD2754) {
            case 0: {
                CLS523.MTH7164(activity0, ((CLS16)new CLS1039(ˑٴ0, 0)));
                return;
            }
            case 1: {
                String s = ˑٴ0.MTH7285();
                if(!TextUtils.isEmpty(s)) {
                    CLS387.MTH5601(false, activity0, ((CLS2)new CLS1450(s)), -1);
                }
                return;
            }
            case 2: {
                String s1 = ˑٴ0.MTH7285();
                if(!TextUtils.isEmpty(s1)) {
                    CLS1392 ˈˊ0 = new CLS1392(activity0, s1);
                    CLS40.FLD157.MTH1124(((CLS39)ˈˊ0));
                }
                return;
            }
            default: {
                CLS523.MTH7165(activity0, CLS27.MTH889("input_url"), "", "", 1, ((CLS16)new CLS1039(ˑٴ0, 2)));
            }
        }
    }
}

