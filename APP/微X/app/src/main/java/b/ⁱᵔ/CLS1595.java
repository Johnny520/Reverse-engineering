// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.ProgressDialog;
import b.ʻˑ.CLS13;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;

public final class CLS1595 implements CLS39 {
    public final long FLD5031;
    public final String FLD5032;
    public final Object FLD5033;
    public final ProgressDialog FLD5034;
    public final boolean[] FLD5035;
    public final CLS13 FLD5036;
    public final boolean FLD5037;
    public final String FLD5038;

    public CLS1595(String s, boolean[] arr_z, ProgressDialog progressDialog0, CLS13 ⁱʽ0, Object object0, String s1, boolean z, long v) {
        this.FLD5032 = s;
        this.FLD5035 = arr_z;
        this.FLD5034 = progressDialog0;
        this.FLD5036 = ⁱʽ0;
        this.FLD5033 = object0;
        this.FLD5038 = s1;
        this.FLD5037 = z;
        this.FLD5031 = v;
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        ProgressDialog progressDialog0 = this.FLD5034;
        CLS13 ⁱʽ0 = this.FLD5036;
        Object object0 = this.FLD5033;
        String s = this.FLD5038;
        boolean z = this.FLD5037;
        long v = this.FLD5031;
        String s1 = this.FLD5032;
        if(!CLS31.MTH975(s1)) {
            CLS466.MTH6546(object0, s, ⁱʽ0, z, v, progressDialog0);
        }
        else if(!this.FLD5035[0]) {
            if(progressDialog0 != null) {
                progressDialog0.dismiss();
            }
            if(ⁱʽ0 != null) {
                CLS1606 ﹶﾞ0 = new CLS1606(ⁱʽ0, s1, 6);
                CLS40.FLD157.MTH1116(((CLS39)ﹶﾞ0));
            }
        }
    }
}

