// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

import c.ˎˊ.CLS117;
import c.ˎˊ.CLS118;
import com.google.zxing.NotFoundException;

public final class CLS374 {
    public CLS117 FLD1645;
    public final CLS375 FLD1646;

    public CLS374(CLS375 ˆٴ0) {
        if(ˆٴ0 == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.FLD1646 = ˆٴ0;
    }

    @Override
    public String toString() {
        try {
            return this.MTH5087().toString();
        }
        catch(NotFoundException unused_ex) {
            return "";
        }
    }

    public CLS118 MTH5085(int v, CLS118 ˆٴ0) {
        return this.FLD1646.MTH5098(v, ˆٴ0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public boolean MTH5086() {
        return false;
    }

    public CLS117 MTH5087() {
        if(this.FLD1645 == null) {
            this.FLD1645 = this.FLD1646.MTH5095();
        }
        return this.FLD1645;
    }

    public int MTH5088() {
        return this.FLD1646.MTH5100();
    }

    public CLS374 MTH5089() {
        CLS378 ـᵎ0 = this.FLD1646.MTH5096().MTH5109();
        return new CLS374(this.FLD1646.MTH5097(ـᵎ0));
    }

    public int MTH5090() {
        return this.FLD1646.MTH5099();
    }
}

