// Decompiled by JEB v5.42.0.202606242140

package c.ˑـ;

import c.ʽˑ.CLS46;
import c.ʽˑ.CLS47;
import c.ˎˊ.CLS124;
import c.ﾞʾ.CLS369;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import c.ﾞﹶ.CLS381;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

public final class CLS639 implements CLS381 {
    public static CLS379[] MTH2491(CLS374 ʻᵢ0, Map map0, boolean z) {
        ArrayList arrayList0 = new ArrayList();
        CLS46 ʻᵢ1 = CLS47.MTH996(ʻᵢ0, map0, z);
        for(Object object0: ʻᵢ1.MTH993()) {
            CLS124 ᵔﹶ0 = CLS369.MTH4998(ʻᵢ1.MTH994(), ((CLS380[])object0)[4], ((CLS380[])object0)[5], ((CLS380[])object0)[6], ((CLS380[])object0)[7], CLS639.MTH2492(((CLS380[])object0)), CLS639.MTH2494(((CLS380[])object0)));
            CLS379 ٴˑ0 = new CLS379(ᵔﹶ0.MTH2409(), ᵔﹶ0.MTH2401(), ((CLS380[])object0), BarcodeFormat.PDF_417);
            ٴˑ0.MTH5120(ResultMetadataType.ERROR_CORRECTION_LEVEL, ᵔﹶ0.MTH2399());
            CLS131 ـᵎ0 = (CLS131)ᵔﹶ0.MTH2411();
            if(ـᵎ0 != null) {
                ٴˑ0.MTH5120(ResultMetadataType.PDF417_EXTRA_METADATA, ـᵎ0);
            }
            arrayList0.add(ٴˑ0);
        }
        return (CLS379[])arrayList0.toArray(new CLS379[arrayList0.size()]);
    }

    public static int MTH2492(CLS380[] arr_ٴⁱ) {
        return Math.min(Math.min(CLS639.MTH2495(arr_ٴⁱ[0], arr_ٴⁱ[4]), CLS639.MTH2495(arr_ٴⁱ[6], arr_ٴⁱ[2]) * 17 / 18), Math.min(CLS639.MTH2495(arr_ٴⁱ[1], arr_ٴⁱ[5]), CLS639.MTH2495(arr_ٴⁱ[7], arr_ٴⁱ[3]) * 17 / 18));
    }

    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        CLS379[] arr_ٴˑ = CLS639.MTH2491(ʻᵢ0, map0, false);
        if(arr_ٴˑ != null && arr_ٴˑ.length != 0) {
            CLS379 ٴˑ0 = arr_ٴˑ[0];
            if(ٴˑ0 != null) {
                return ٴˑ0;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int MTH2494(CLS380[] arr_ٴⁱ) {
        return Math.max(Math.max(CLS639.MTH2496(arr_ٴⁱ[0], arr_ٴⁱ[4]), CLS639.MTH2496(arr_ٴⁱ[6], arr_ٴⁱ[2]) * 17 / 18), Math.max(CLS639.MTH2496(arr_ٴⁱ[1], arr_ٴⁱ[5]), CLS639.MTH2496(arr_ٴⁱ[7], arr_ٴⁱ[3]) * 17 / 18));
    }

    public static int MTH2495(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        return ٴⁱ0 == null || ٴⁱ1 == null ? 0x7FFFFFFF : ((int)Math.abs(ٴⁱ0.MTH5130() - ٴⁱ1.MTH5130()));
    }

    public static int MTH2496(CLS380 ٴⁱ0, CLS380 ٴⁱ1) {
        return ٴⁱ0 == null || ٴⁱ1 == null ? 0 : ((int)Math.abs(ٴⁱ0.MTH5130() - ٴⁱ1.MTH5130()));
    }
}

