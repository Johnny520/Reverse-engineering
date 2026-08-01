// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.os.CountDownTimer;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1627;

public final class CLS417 extends CountDownTimer {
    public final CLS411 FLD4026;
    public final CLS3 FLD4027;
    public final int[] FLD4028;

    public CLS417(long v, long v1, CLS411 ˉˏ$ᵔʾ0, int[] arr_v, CLS1627 ٴـ0) {
        this.FLD4026 = ˉˏ$ᵔʾ0;
        this.FLD4028 = arr_v;
        this.FLD4027 = ٴـ0;
        super(v, v1);
    }

    @Override  // android.os.CountDownTimer
    public final void onFinish() {
        try {
            CLS411 ˉˏ$ᵔʾ0 = this.FLD4026;
            if(ˉˏ$ᵔʾ0 != null) {
                ˉˏ$ᵔʾ0.MTH5992(this.FLD4028[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        CLS3 ˆٴ0 = this.FLD4027;
        if(ˆٴ0 != null) {
            try {
                ˆٴ0.MTH774();
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    @Override  // android.os.CountDownTimer
    public final void onTick(long v) {
        int[] arr_v = this.FLD4028;
        CLS411 ˉˏ$ᵔʾ0 = this.FLD4026;
        if(ˉˏ$ᵔʾ0 != null) {
            try {
                ˉˏ$ᵔʾ0.MTH5992(arr_v[0]);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        ++arr_v[0];
    }
}

