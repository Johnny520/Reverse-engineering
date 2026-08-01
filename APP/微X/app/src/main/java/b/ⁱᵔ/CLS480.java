// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS569;
import b.ʾᵢ.CLS573;

public final class CLS480 implements View.OnClickListener {
    public final int FLD4719;
    public final CLS12 FLD4720;
    public final Activity FLD4721;

    public CLS480(Activity activity0, CLS568 יᐧ0) {
        this.FLD4719 = 0;
        super();
        this.FLD4720 = יᐧ0;
        this.FLD4721 = activity0;
    }

    public CLS480(Activity activity0, CLS568 יᐧ0, int v) {
        this.FLD4719 = v;
        this.FLD4721 = activity0;
        this.FLD4720 = יᐧ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD4721;
        CLS12 ᵔʾ0 = this.FLD4720;
        switch(this.FLD4719) {
            case 0: {
                ᵔʾ0.MTH791(new CLS573(7, activity0));
                return;
            }
            case 1: {
                CLS387.MTH5601(false, activity0, ((CLS2)new CLS1286(ᵔʾ0)), -1);
                return;
            }
            case 2: {
                CLS523.MTH7165(activity0, CLS27.MTH889("filename"), CLS27.MTH889("input_filename"), "", 1, ((CLS16)new CLS569(ᵔʾ0, activity0, 1)));
                return;
            }
            case 3: {
                CLS523.MTH7165(activity0, CLS27.MTH889("filename"), CLS27.MTH889("input_filename"), "", 1, ((CLS16)new CLS569(ᵔʾ0, activity0, 2)));
                return;
            }
            default: {
                CLS462.MTH6490(activity0, ᵔʾ0);
            }
        }
    }
}

