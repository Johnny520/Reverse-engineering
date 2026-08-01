// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.text.TextUtils;

public final class CLS570 implements CLS39 {
    public final int FLD133;
    public final CLS24 FLD134;

    public CLS570(CLS24 ˉᐧ$ˆٴ0, int v) {
        this.FLD133 = v;
        this.FLD134 = ˉᐧ$ˆٴ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS24 ˉᐧ$ˆٴ0 = this.FLD134;
        if(this.FLD133 == 0) {
            for(Object object0: ˉᐧ$ˆٴ0.FLD85) {
                String s = ˉᐧ$ˆٴ0.MTH855(((String)object0));
                if(!TextUtils.isEmpty(s)) {
                    CLS25.MTH861(ˉᐧ$ˆٴ0.FLD87, s, ˉᐧ$ˆٴ0.FLD89);
                }
            }
            return;
        }
        ˉᐧ$ˆٴ0.MTH858();
    }
}

