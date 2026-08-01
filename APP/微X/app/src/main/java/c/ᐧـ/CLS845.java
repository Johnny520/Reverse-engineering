// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS379;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Map;

public final class CLS845 extends CLS836 {
    public final CLS836 FLD1432;

    public CLS845() {
        this.FLD1432 = new CLS846();
    }

    @Override  // c.ᐧـ.CLS836
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        return CLS845.MTH4592(this.FLD1432.MTH4611(v, ˆٴ0, map0));
    }

    @Override  // c.ᐧـ.CLS836
    public CLS379 MTH4630(int v, CLS118 ˆٴ0, int[] arr_v, Map map0) {
        return CLS845.MTH4592(this.FLD1432.MTH4630(v, ˆٴ0, arr_v, map0));
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        return CLS845.MTH4592(((CLS807)this.FLD1432).MTH5132(ʻᵢ0, map0));
    }

    @Override  // c.ᐧـ.CLS836
    public int MTH4632(CLS118 ˆٴ0, int[] arr_v, StringBuilder stringBuilder0) {
        return this.FLD1432.MTH4632(ˆٴ0, arr_v, stringBuilder0);
    }

    @Override  // c.ᐧـ.CLS836
    public BarcodeFormat MTH4635() {
        return BarcodeFormat.UPC_A;
    }

    public static CLS379 MTH4592(CLS379 ٴˑ0) {
        String s = ٴˑ0.MTH5121();
        if(s.charAt(0) != 0x30) {
            throw FormatException.getFormatInstance();
        }
        return new CLS379(s.substring(1), null, ٴˑ0.MTH5116(), BarcodeFormat.UPC_A);
    }
}

