// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS523;

public final class CLS209 implements View.OnClickListener {
    public final int FLD1988;
    public final Activity FLD1989;
    public final CLS174 FLD1990;
    public final CLS303 FLD1991;

    public CLS209(CLS174 ʻˑ0, Activity activity0, CLS303 ᵔʾ$ˆٴ0, int v) {
        this.FLD1988 = v;
        this.FLD1990 = ʻˑ0;
        this.FLD1989 = activity0;
        this.FLD1991 = ᵔʾ$ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS303 ᵔʾ$ˆٴ0 = this.FLD1991;
        CLS174 ʻˑ0 = this.FLD1990;
        if(this.FLD1988 == 0) {
            CLS902 ʻˑ$ˆٴ0 = new CLS902(ᵔʾ$ˆٴ0);
            ᵔʾ$ˆٴ0.getClass();
            String s = TextUtils.join(",", ᵔʾ$ˆٴ0.FLD3162);
            CLS387.MTH5585(true, this.FLD1989, ʻˑ0.FLD1680, ((CLS2)ʻˑ$ˆٴ0), s, -1);
            return;
        }
        ʻˑ0.getClass();
        CLS958 ˆʿ0 = new CLS958(ʻˑ0, ᵔʾ$ˆٴ0);
        CLS523.MTH7142(this.FLD1989, ((CLS11)ˆʿ0));
    }
}

