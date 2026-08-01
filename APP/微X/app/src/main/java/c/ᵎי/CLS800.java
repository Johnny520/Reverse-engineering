// Decompiled by JEB v5.42.0.202606242140

package c.ᵎי;

import c.ʿᵢ.CLS44;
import c.ʿᵢ.CLS45;
import c.ᐧᵎ.CLS267;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᐧᵎ.CLS272;
import c.ﹶˋ.CLS355;
import c.ﾞʾ.CLS360;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

public final class CLS800 implements CLS267 {
    public static int MTH4525(CLS268[] arr_ᵔʼ) {
        return Math.max(Math.max(CLS800.MTH4527(arr_ᵔʼ[0], arr_ᵔʼ[4]), CLS800.MTH4527(arr_ᵔʼ[6], arr_ᵔʼ[2]) * 17 / 18), Math.max(CLS800.MTH4527(arr_ᵔʼ[1], arr_ᵔʼ[5]), CLS800.MTH4527(arr_ᵔʼ[7], arr_ᵔʼ[3]) * 17 / 18));
    }

    public static int MTH4526(CLS268[] arr_ᵔʼ) {
        return Math.min(Math.min(CLS800.MTH4528(arr_ᵔʼ[0], arr_ᵔʼ[4]), CLS800.MTH4528(arr_ᵔʼ[6], arr_ᵔʼ[2]) * 17 / 18), Math.min(CLS800.MTH4528(arr_ᵔʼ[1], arr_ᵔʼ[5]), CLS800.MTH4528(arr_ᵔʼ[7], arr_ᵔʼ[3]) * 17 / 18));
    }

    public static int MTH4527(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        return ᵔʼ0 == null || ᵔʼ1 == null ? 0 : ((int)Math.abs(ᵔʼ0.MTH3468() - ᵔʼ1.MTH3468()));
    }

    public static int MTH4528(CLS268 ᵔʼ0, CLS268 ᵔʼ1) {
        return ᵔʼ0 == null || ᵔʼ1 == null ? 0x7FFFFFFF : ((int)Math.abs(ᵔʼ0.MTH3468() - ᵔʼ1.MTH3468()));
    }

    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        CLS271[] arr_ﾞʿ = CLS800.MTH4530(ﾞⁱ0, map0, false);
        if(arr_ﾞʿ != null && arr_ﾞʿ.length != 0) {
            CLS271 ﾞʿ0 = arr_ﾞʿ[0];
            if(ﾞʿ0 != null) {
                return ﾞʿ0;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static CLS271[] MTH4530(CLS272 ﾞⁱ0, Map map0, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        CLS45 ﾞⁱ1 = CLS44.MTH873(ﾞⁱ0, map0, z);
        for(Object object0: ﾞⁱ1.MTH876()) {
            CLS360 ˉˎ0 = CLS355.MTH4908(ﾞⁱ1.MTH875(), ((CLS268[])object0)[4], ((CLS268[])object0)[5], ((CLS268[])object0)[6], ((CLS268[])object0)[7], CLS800.MTH4526(((CLS268[])object0)), CLS800.MTH4525(((CLS268[])object0)));
            CLS271 ﾞʿ0 = new CLS271(ˉˎ0.MTH4971(), ˉˎ0.MTH4966(), ((CLS268[])object0), BarcodeFormat.PDF_417);
            ﾞʿ0.MTH3489(ResultMetadataType.ERROR_CORRECTION_LEVEL, ˉˎ0.MTH4975());
            CLS305 ʾʻ0 = (CLS305)ˉˎ0.MTH4968();
            if(ʾʻ0 != null) {
                ﾞʿ0.MTH3489(ResultMetadataType.PDF417_EXTRA_METADATA, ʾʻ0);
            }
            arrayList0.add(ﾞʿ0);
        }
        return (CLS271[])arrayList0.toArray(new CLS271[arrayList0.size()]);
    }
}

