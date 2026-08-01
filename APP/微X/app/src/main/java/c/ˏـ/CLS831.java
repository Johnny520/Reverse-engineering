// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS831 extends CLS439 {
    public final CLS833[] FLD449;

    public CLS831(Map map0) {
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(collection0.contains(BarcodeFormat.EAN_13)) {
                arrayList0.add(new CLS844());
            }
            else if(collection0.contains(BarcodeFormat.UPC_A)) {
                arrayList0.add(new CLS843());
            }
            if(collection0.contains(BarcodeFormat.EAN_8)) {
                arrayList0.add(new CLS845());
            }
            if(collection0.contains(BarcodeFormat.UPC_E)) {
                arrayList0.add(new CLS846());
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(new CLS844());
            arrayList0.add(new CLS845());
            arrayList0.add(new CLS846());
        }
        this.FLD449 = (CLS833[])arrayList0.toArray(new CLS833[arrayList0.size()]);
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        CLS271 ﾞʿ0;
        int[] arr_v = CLS833.MTH1733(ⁱˋ0);
        CLS833[] arr_ﹶˆ = this.FLD449;
        boolean z = false;
        int v1 = 0;
        while(v1 < arr_ﹶˆ.length) {
            CLS833 ﹶˆ0 = arr_ﹶˆ[v1];
            try {
                ﾞʿ0 = ﹶˆ0.MTH1729(v, ⁱˋ0, arr_v, map0);
            }
            catch(ReaderException unused_ex) {
                ++v1;
                continue;
            }
            boolean z1 = ﾞʿ0.MTH3492() == BarcodeFormat.EAN_13 && ﾞʿ0.MTH3488().charAt(0) == 0x30;
            Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
            if(collection0 == null || collection0.contains(BarcodeFormat.UPC_A)) {
                z = true;
            }
            if(z1 && z) {
                CLS271 ﾞʿ1 = new CLS271(ﾞʿ0.MTH3488().substring(1), ﾞʿ0.MTH3485(), ﾞʿ0.MTH3486(), BarcodeFormat.UPC_A);
                ﾞʿ1.MTH3491(ﾞʿ0.MTH3487());
                return ﾞʿ1;
            }
            return ﾞʿ0;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

