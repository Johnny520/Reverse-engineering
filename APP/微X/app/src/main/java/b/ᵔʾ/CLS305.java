// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;

public final class CLS305 {
    public int FLD3176;
    public static final CLS305 FLD3177;
    public boolean FLD3178;

    static {
        CLS305.FLD3177 = new CLS305();
    }

    public CLS305() {
        this.FLD3176 = 0;
        this.FLD3178 = false;
    }

    // 此方法包含解密的字符串
    public final void MTH4915() {
        Object object0;
        if(!this.FLD3178) {
            return;
        }
        String[] arr_s = CLS27.MTH895().MTH925("auto_shake_gps", "").split(" ");
        if(arr_s.length < 2) {
            return;
        }
        float f = Float.parseFloat(arr_s[0]);
        float f1 = Float.parseFloat(arr_s[1]);
        if(CLS27.MTH890("shakeReportClass")) {
            object0 = CLS166.MTH3188(CLS27.MTH894("shakeReportClass"), new Object[]{0, f, f1, 15, 1, "", ""});
        }
        else {
            object0 = CLS27.MTH890("shakeReportClass_b") ? CLS166.MTH3188(CLS27.MTH894("shakeReportClass_b"), new Object[]{f, f1, 15, 1}) : null;
        }
        if(object0 != null) {
            CLS166.MTH3199(object0, "wx", Boolean.TRUE);
            CLS66.MTH1521(object0);
        }
    }
}

