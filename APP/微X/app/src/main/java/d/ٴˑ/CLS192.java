// Decompiled by JEB v5.42.0.202606242140

package d.ٴˑ;

import android.text.TextUtils;
import d.ⁱٴ.CLS122;

public final class CLS192 implements CLS122 {
    public final CLS87 FLD566;
    public final int FLD567;
    public final CLS184 FLD568;

    public CLS192(CLS87 ˏᐧ0, CLS184 י0, int v) {
        this.FLD567 = v;
        this.FLD566 = ˏᐧ0;
        this.FLD568 = י0;
        super();
    }

    @Override  // d.ⁱٴ.CLS122
    public final void MTH1173(String s) {
        CLS184 י0 = this.FLD568;
        CLS87 ˏᐧ0 = this.FLD566;
        switch(this.FLD567) {
            case 0: {
                ˏᐧ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v1 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ˏᐧ0.FLD436 = v1;
                    י0.MTH944(String.valueOf(v1));
                    ˏᐧ0.MTH935();
                }
                return;
            }
            case 1: {
                ˏᐧ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v2 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ˏᐧ0.FLD432 = v2;
                    י0.MTH944(String.valueOf(v2));
                    ˏᐧ0.MTH935();
                }
                return;
            }
            case 2: {
                ˏᐧ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v3 = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ˏᐧ0.FLD442 = v3;
                    י0.MTH944(String.valueOf(v3));
                    ˏᐧ0.MTH935();
                }
                return;
            }
            default: {
                ˏᐧ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    int v = Math.max(Math.min(Integer.parseInt(s), 0xFF), 0);
                    ˏᐧ0.FLD433 = v;
                    י0.MTH944(String.valueOf(v));
                    ˏᐧ0.MTH935();
                }
            }
        }
    }
}

