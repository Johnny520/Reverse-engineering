// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS837 extends CLS807 {
    public final CLS836[] FLD1460;

    public CLS837(Map map0) {
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(collection0.contains(BarcodeFormat.EAN_13)) {
                arrayList0.add(new CLS846());
            }
            else if(collection0.contains(BarcodeFormat.UPC_A)) {
                arrayList0.add(new CLS845());
            }
            if(collection0.contains(BarcodeFormat.EAN_8)) {
                arrayList0.add(new CLS848());
            }
            if(collection0.contains(BarcodeFormat.UPC_E)) {
                arrayList0.add(new CLS847());
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(new CLS846());
            arrayList0.add(new CLS848());
            arrayList0.add(new CLS847());
        }
        this.FLD1460 = (CLS836[])arrayList0.toArray(new CLS836[arrayList0.size()]);
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        CLS379 ٴˑ0;
        int[] arr_v = CLS836.MTH4631(ˆٴ0);
        CLS836[] arr_ˋﹳ = this.FLD1460;
        boolean z = false;
        int v1 = 0;
        while(v1 < arr_ˋﹳ.length) {
            CLS836 ˋﹳ0 = arr_ˋﹳ[v1];
            try {
                ٴˑ0 = ˋﹳ0.MTH4630(v, ˆٴ0, arr_v, map0);
            }
            catch(ReaderException unused_ex) {
                ++v1;
                continue;
            }
            boolean z1 = ٴˑ0.MTH5115() == BarcodeFormat.EAN_13 && ٴˑ0.MTH5121().charAt(0) == 0x30;
            Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
            if(collection0 == null || collection0.contains(BarcodeFormat.UPC_A)) {
                z = true;
            }
            if(z1 && z) {
                CLS379 ٴˑ1 = new CLS379(ٴˑ0.MTH5121().substring(1), ٴˑ0.MTH5118(), ٴˑ0.MTH5116(), BarcodeFormat.UPC_A);
                ٴˑ1.MTH5119(ٴˑ0.MTH5122());
                return ٴˑ1;
            }
            return ٴˑ0;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

