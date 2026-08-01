// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import android.os.Handler;
import b.ʾᵢ.CLS27;
import b.ᵔʾ.CLS1247;
import b.ᵔʾ.CLS1252;

public final class CLS155 implements Runnable {
    public final int FLD1548;
    public final CLS152 FLD1549;
    public final CLS152 FLD1550;
    public final CLS152 FLD1551;
    public final CLS153 FLD1552;
    public final CLS154 FLD1553;
    public final int FLD1554;

    public CLS155(CLS154 ٴـ0, CLS1247 ـˏ0, CLS154 ٴـ1, CLS1252 ᐧⁱ0, CLS1252 ᐧⁱ1, CLS1252 ᐧⁱ2) {
        this.FLD1553 = ٴـ0;
        this.FLD1548 = 30;
        this.FLD1551 = ـˏ0;
        this.FLD1550 = ᐧⁱ0;
        this.FLD1552 = ᐧⁱ1;
        this.FLD1549 = ᐧⁱ2;
        this.FLD1554 = 3000;
        super();
    }

    @Override
    public final void run() {
        try {
            CLS154 ٴـ0 = this.FLD1553;
            if(this.FLD1548 != -1 && (ٴـ0.FLD1546 > this.FLD1548 && (this.FLD1551 != null && !this.FLD1551.MTH3139()))) {
                ٴـ0.FLD1545.removeCallbacks(ٴـ0.FLD1547);
                return;
            }
            CLS155 ᵔʾ0 = ٴـ0.FLD1547;
            Handler handler0 = ٴـ0.FLD1545;
            if(ٴـ0.FLD1546 == 0 && !this.FLD1550.MTH3139()) {
                handler0.removeCallbacks(ᵔʾ0);
                return;
            }
            boolean z = ((CLS1252)this.FLD1552).MTH4895();
            int v = this.FLD1554;
            if(z) {
                if(this.FLD1549.MTH3139()) {
                    ٴـ0.FLD1546 = 0;
                    handler0.postDelayed(this, ((long)v));
                    return;
                }
                handler0.removeCallbacks(ᵔʾ0);
                return;
            }
            else {
                ++ٴـ0.FLD1546;
            }
            handler0.postDelayed(this, ((long)v));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

