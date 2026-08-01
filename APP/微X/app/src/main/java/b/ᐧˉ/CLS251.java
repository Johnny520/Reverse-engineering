// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;

public final class CLS251 implements View.OnClickListener {
    public final int FLD2617;
    public final CLS1622 FLD2618;

    public CLS251(CLS1622 ˑٴ0, int v) {
        this.FLD2617 = v;
        this.FLD2618 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1622 ˑٴ0 = this.FLD2618;
        if(this.FLD2617 == 0) {
            String s = ˑٴ0.MTH7285();
            if(!TextUtils.isEmpty(s)) {
                try {
                    int v = Integer.parseInt(s);
                    CLS21.FLD76.MTH818("mass_del_random", new Object[]{v});
                    return;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            return;
        }
        String s1 = ˑٴ0.MTH7285();
        if(!TextUtils.isEmpty(s1)) {
            CLS21.FLD76.MTH818("speak", new Object[]{s1});
        }
    }
}

