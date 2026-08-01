// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˑٴ.CLS640;
import b.ⁱᵔ.CLS1327;
import b.ⁱᵔ.CLS1414;
import b.ⁱᵔ.CLS371;

public final class CLS159 implements Runnable {
    public final int FLD1564;
    public final int FLD1565;
    public final CLS144 FLD1566;
    public final CLS3 FLD1567;
    public final CLS3 FLD1568;
    public final CLS145 FLD1569;

    public CLS159(CLS145 ʾᵢ0, int v, CLS1327 ʾᐧ0, CLS640 ʼˏ0, CLS1414 ˊـ0) {
        this.FLD1569 = ʾᵢ0;
        this.FLD1564 = v;
        this.FLD1567 = ʾᐧ0;
        this.FLD1566 = ʼˏ0;
        this.FLD1568 = ˊـ0;
        this.FLD1565 = 1000;
        super();
    }

    @Override
    public final void run() {
        try {
            int v = this.FLD1564;
            CLS145 ʾᵢ0 = this.FLD1569;
            if(v != -1) {
                int v1 = ʾᵢ0.FLD1532;
                ʾᵢ0.FLD1532 = v1 + 1;
                if(v1 > v) {
                    ʾᵢ0.FLD1531.removeCallbacks(ʾᵢ0.FLD1533);
                    CLS3 ˆٴ0 = this.FLD1567;
                    if(ˆٴ0 != null) {
                        try {
                            ˆٴ0.MTH774();
                            return;
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                    return;
                }
            }
            try {
                ((CLS640)this.FLD1566).getClass();
                if(!CLS31.MTH1021(CLS371.FLD3470.MTH5319(((CLS640)this.FLD1566).FLD600))) {
                    ʾᵢ0.FLD1531.postDelayed(this, ((long)this.FLD1565));
                    return;
                }
                ʾᵢ0.FLD1531.removeCallbacks(ʾᵢ0.FLD1533);
                try {
                    this.FLD1568.MTH774();
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
            }
            catch(Throwable throwable2) {
                CLS27.MTH893(throwable2);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

