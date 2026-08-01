// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.os.CountDownTimer;
import d.יʻ.CLS68.CLS67;
import d.יʻ.CLS68;
import d.יʻ.CLS69;
import d.ٴˑ.CLS191;
import d.ⁱٴ.CLS123;

public final class CLS22 extends CountDownTimer {
    public final int[] FLD86;
    public final CLS12 FLD87;
    public final CLS123 FLD88;

    public CLS22(long v, CLS169 ﹳᵎ0, int[] arr_v, CLS191 ⁱٴ0) {
        this.FLD87 = ﹳᵎ0;
        this.FLD86 = arr_v;
        this.FLD88 = ⁱٴ0;
        super(v, 1000L);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        try {
            CLS12 ʼᵔ$ᐧי0 = this.FLD87;
            if(ʼᵔ$ᐧי0 != null) {
                CLS147 ˊˎ0 = new CLS147(((CLS169)ʼᵔ$ᐧי0).FLD262, this.FLD86[0]);
                CLS68.FLD326.MTH791(((CLS67)ˊˎ0));
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        CLS123 ᐧי0 = this.FLD88;
        if(ᐧי0 != null) {
            try {
                ᐧי0.MTH1174();
            }
            catch(Throwable throwable1) {
                CLS69.MTH797(throwable1);
            }
        }
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
        int[] arr_v = this.FLD86;
        CLS12 ʼᵔ$ᐧי0 = this.FLD87;
        if(ʼᵔ$ᐧי0 != null) {
            try {
                CLS147 ˊˎ0 = new CLS147(((CLS169)ʼᵔ$ᐧי0).FLD262, arr_v[0]);
                CLS68.FLD326.MTH791(((CLS67)ˊˎ0));
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        ++arr_v[0];
    }
}

