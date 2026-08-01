// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;
import b.ﾞᐧ.CLS557;

public final class CLS436 implements View.OnClickListener {
    public final int FLD4186;
    public final Object FLD4187;
    public final CLS557[] FLD4188;
    public final Object FLD4189;

    public CLS436(Activity activity0, CLS557[] arr_ˆٴ, String[] arr_s) {
        this.FLD4186 = 0;
        super();
        this.FLD4187 = activity0;
        this.FLD4188 = arr_ˆٴ;
        this.FLD4189 = arr_s;
    }

    public CLS436(CLS1626 ـﹳ0, CLS1626 ـﹳ1, CLS557[] arr_ˆٴ) {
        this.FLD4186 = 1;
        super();
        this.FLD4187 = ـﹳ0;
        this.FLD4189 = ـﹳ1;
        this.FLD4188 = arr_ˆٴ;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS557[] arr_ˆٴ = this.FLD4188;
        Object object0 = this.FLD4189;
        Object object1 = this.FLD4187;
        if(this.FLD4186 == 0) {
            CLS523.MTH7165(((Activity)object1), CLS27.MTH889("export_as_wav"), CLS27.MTH889("filename"), "", 1, ((CLS16)new CLS1279(((Activity)object1), arr_ˆٴ, ((String[])object0), 3)));
            return;
        }
        ((CLS1626)object1).MTH7325("");
        ((CLS1626)object0).MTH7325("");
        CLS462.FLD4511 = 0;
        CLS462.FLD4513 = 0;
        arr_ˆٴ[0] = null;
    }
}

