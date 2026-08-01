// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS576;
import b.ⁱˉ.CLS370;

public final class CLS385 implements View.OnClickListener {
    public final Activity FLD3589;
    public final CLS12 FLD3590;
    public final boolean FLD3591;

    public CLS385(Activity activity0, boolean z, CLS566 ˈˊ0) {
        this.FLD3589 = activity0;
        this.FLD3591 = z;
        this.FLD3590 = ˈˊ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = CLS27.MTH889(CLS370.MTH5289((this.FLD3591 ? 0x38EAF38D2B3CD335L : 0x38EAF3972B3CD335L)));
        this.FLD3590.getClass();
        CLS523.MTH7165(this.FLD3589, s, "", "", 1, ((CLS16)new CLS576(this.FLD3590, 9)));
    }
}

