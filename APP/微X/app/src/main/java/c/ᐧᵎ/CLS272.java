// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

import c.ﾞʾ.CLS365;
import c.ﾞʾ.CLS366;
import com.google.zxing.NotFoundException;

public final class CLS272 {
    public final CLS270 FLD1070;
    public CLS366 FLD1071;

    public CLS272(CLS270 ⁱˋ0) {
        if(ⁱˋ0 == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.FLD1070 = ⁱˋ0;
    }

    @Override
    public String toString() {
        try {
            return this.MTH3499().toString();
        }
        catch(NotFoundException unused_ex) {
            return "";
        }
    }

    public int MTH3495() {
        return this.FLD1070.MTH3477();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public boolean MTH3496() {
        return false;
    }

    public int MTH3497() {
        return this.FLD1070.MTH3478();
    }

    public CLS272 MTH3498() {
        CLS265 ʾʻ0 = this.FLD1070.MTH3476().MTH3451();
        return new CLS272(this.FLD1070.MTH3479(ʾʻ0));
    }

    public CLS366 MTH3499() {
        if(this.FLD1071 == null) {
            this.FLD1071 = this.FLD1070.MTH3480();
        }
        return this.FLD1071;
    }

    public CLS365 MTH3500(int v, CLS365 ⁱˋ0) {
        return this.FLD1070.MTH3475(v, ⁱˋ0);
    }
}

