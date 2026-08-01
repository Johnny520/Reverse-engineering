// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ـˏ.CLS168;
import b.ـˏ.CLS169;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS412;

public final class CLS95 {
    public final CLS169 FLD405;
    public final String FLD406;
    public final int FLD407;

    public CLS95(CLS169 ˆٴ0, int v, String s) {
        this.FLD405 = ˆٴ0;
        this.FLD407 = v;
        this.FLD406 = s;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    @Override
    public final String toString() {
        return "senditem: " + CLS168.MTH3227(this.MTH1760()) + " to: " + this.FLD406 + " delay: " + this.MTH1759();
    }

    // 此方法包含解密的字符串
    public final int MTH1759() {
        long v1;
        String s = "";
        int v = this.FLD407;
        if(v == 1) {
            s = "_record";
        }
        else {
            if(v == 2) {
                return CLS412.MTH6005(3000, "mass_send_delay2");
            }
            if(v == 3) {
                switch(CLS168.MTH3226(this.MTH1760())) {
                    case 0: 
                    case 2: 
                    case 12: {
                        return 1000;
                    }
                    default: {
                        return 500;
                    }
                }
            }
        }
        if(TextUtils.isEmpty(s)) {
            return this.FLD405.MTH3232();
        }
        switch(CLS168.MTH3226(this.MTH1760())) {
            case 1: {
                v1 = 4101576923820118837L;
                break;
            }
            case 2: {
                v1 = 4101576404129076021L;
                break;
            }
            case 12: {
                v1 = 0x38EBBA742B3CD335L;
                break;
            }
            default: {
                return Math.max(1000, CLS27.MTH895().MTH927(3000, "send_delay_text" + s));
            }
        }
        String s1 = CLS370.MTH5289(v1);
        return Math.max(1000, CLS27.MTH895().MTH927(3000, "send_delay" + s1 + s));
    }

    public final int MTH1760() {
        return this.FLD405.MTH3228();
    }
}

