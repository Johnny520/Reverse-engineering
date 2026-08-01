// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧˎ.CLS847;
import c.ᐧᵎ.CLS271;
import c.ⁱי.CLS850;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS828 extends CLS439 {
    public final CLS439[] FLD422;

    public CLS828(Map map0) {
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        boolean z = map0 != null && map0.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) != null;
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(collection0.contains(BarcodeFormat.EAN_13) || collection0.contains(BarcodeFormat.UPC_A) || collection0.contains(BarcodeFormat.EAN_8) || collection0.contains(BarcodeFormat.UPC_E)) {
                arrayList0.add(new CLS831(map0));
            }
            if(collection0.contains(BarcodeFormat.CODE_39)) {
                arrayList0.add(new CLS827(z));
            }
            if(collection0.contains(BarcodeFormat.CODE_93)) {
                arrayList0.add(new CLS829());
            }
            if(collection0.contains(BarcodeFormat.CODE_128)) {
                arrayList0.add(new CLS834());
            }
            if(collection0.contains(BarcodeFormat.ITF)) {
                arrayList0.add(new CLS830());
            }
            if(collection0.contains(BarcodeFormat.CODABAR)) {
                arrayList0.add(new CLS832());
            }
            if(collection0.contains(BarcodeFormat.RSS_14)) {
                arrayList0.add(new CLS850());
            }
            if(collection0.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList0.add(new CLS847());
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(new CLS831(map0));
            arrayList0.add(new CLS827());
            arrayList0.add(new CLS832());
            arrayList0.add(new CLS829());
            arrayList0.add(new CLS834());
            arrayList0.add(new CLS830());
            arrayList0.add(new CLS850());
            arrayList0.add(new CLS847());
        }
        this.FLD422 = (CLS439[])arrayList0.toArray(new CLS439[arrayList0.size()]);
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        CLS439[] arr_ˊﹶ = this.FLD422;
        int v1 = 0;
        while(v1 < arr_ˊﹶ.length) {
            CLS439 ˊﹶ0 = arr_ˊﹶ[v1];
            try {
                return ˊﹶ0.MTH1682(v, ⁱˋ0, map0);
            }
            catch(ReaderException unused_ex) {
                ++v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

