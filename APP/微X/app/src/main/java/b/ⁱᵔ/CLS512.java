// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS12;

public final class CLS512 implements View.OnClickListener {
    public final int FLD5053;
    public final CLS12 FLD5054;

    public CLS512(CLS1408 ˊʽ0, int v) {
        this.FLD5053 = v;
        this.FLD5054 = ˊʽ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS12 ᵔʾ0 = this.FLD5054;
        if(this.FLD5053 == 0) {
            ᵔʾ0.MTH791(0);
            return;
        }
        ᵔʾ0.MTH791(1);
    }
}

