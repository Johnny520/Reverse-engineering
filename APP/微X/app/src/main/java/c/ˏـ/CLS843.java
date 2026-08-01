// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Map;

public final class CLS843 extends CLS833 {
    public final CLS833 FLD423;

    public CLS843() {
        this.FLD423 = new CLS844();
    }

    @Override  // c.ˏـ.CLS833
    public CLS271 MTH1729(int v, CLS365 ⁱˋ0, int[] arr_v, Map map0) {
        return CLS843.MTH1654(this.FLD423.MTH1729(v, ⁱˋ0, arr_v, map0));
    }

    @Override  // c.ˏـ.CLS833
    public int MTH1731(CLS365 ⁱˋ0, int[] arr_v, StringBuilder stringBuilder0) {
        return this.FLD423.MTH1731(ⁱˋ0, arr_v, stringBuilder0);
    }

    public static CLS271 MTH1654(CLS271 ﾞʿ0) {
        String s = ﾞʿ0.MTH3488();
        if(s.charAt(0) != 0x30) {
            throw FormatException.getFormatInstance();
        }
        return new CLS271(s.substring(1), null, ﾞʿ0.MTH3486(), BarcodeFormat.UPC_A);
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        return CLS843.MTH1654(((CLS439)this.FLD423).MTH3463(ﾞⁱ0, map0));
    }

    @Override  // c.ˏـ.CLS833
    public BarcodeFormat MTH1736() {
        return BarcodeFormat.UPC_A;
    }

    @Override  // c.ˏـ.CLS833
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        return CLS843.MTH1654(this.FLD423.MTH1682(v, ⁱˋ0, map0));
    }
}

