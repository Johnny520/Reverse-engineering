// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS575;
import b.ˆʿ.CLS47;
import b.ˈˈ.CLS81;
import b.ˊﾞ.CLS100;
import b.ˊﾞ.CLS101;
import b.ﾞᐧ.CLS557;

public final class CLS1384 implements CLS39 {
    public final int FLD3908;
    public final CLS81 FLD3909;
    public final int FLD3910;
    public final String FLD3911;
    public final int FLD3912;
    public final CLS3 FLD3913;

    public CLS1384(String s, int v, int v1, CLS81 יᐧ0, CLS3 ˆٴ0, int v2) {
        this.FLD3908 = v2;
        this.FLD3911 = s;
        this.FLD3910 = v;
        this.FLD3912 = v1;
        this.FLD3909 = יᐧ0;
        this.FLD3913 = ˆٴ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS575 ⁱᵔ0;
        CLS557 ˆٴ1;
        CLS3 ˆٴ0 = this.FLD3913;
        CLS81 יᐧ0 = this.FLD3909;
        int v = this.FLD3912;
        int v1 = this.FLD3910;
        String s = this.FLD3911;
        if(this.FLD3908 == 0) {
            if(s.endsWith(".mp4") || s.endsWith(".mkv")) {
                ˆٴ1 = CLS500.FLD4928.MTH6895("extract_vid_audio") ? CLS101.MTH1947(v1, v, s) : null;
            }
            else {
                ˆٴ1 = new CLS100().MTH1941(((long)v1), ((long)v), s);
            }
            if(ˆٴ1 == null) {
                יᐧ0.FLD312 = 2;
                CLS47.FLD167.MTH1194(יᐧ0);
                if(ˆٴ0 != null) {
                    ⁱᵔ0 = new CLS575(ˆٴ0, 3);
                    CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                    return;
                }
            }
            else {
                יᐧ0.FLD311 = ˆٴ1.MTH7474();
                יᐧ0.FLD312 = CLS101.MTH1948(ˆٴ1, יᐧ0) ? 1 : 2;
                CLS47.FLD167.MTH1194(יᐧ0);
                if(ˆٴ0 != null) {
                    ⁱᵔ0 = new CLS575(ˆٴ0, 4);
                    CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                }
            }
            return;
        }
        CLS557 ˆٴ2 = new CLS557(s);
        ˆٴ2.MTH7473(((double)v1) / 1000.0, ((double)v) / 1000.0);
        יᐧ0.FLD311 = ˆٴ2.MTH7474();
        יᐧ0.FLD312 = CLS101.MTH1948(ˆٴ2, יᐧ0) ? 1 : 2;
        CLS47.FLD167.MTH1194(יᐧ0);
        if(ˆٴ0 != null) {
            CLS575 ⁱᵔ1 = new CLS575(ˆٴ0, 2);
            CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ1));
        }
    }
}

