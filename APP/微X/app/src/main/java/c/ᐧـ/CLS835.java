// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ʻᵔ.CLS842;
import c.ˎˊ.CLS118;
import c.ﹳʼ.CLS849;
import c.ﾞﹶ.CLS379;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS835 extends CLS807 {
    public final CLS807[] FLD1447;

    public CLS835(Map map0) {
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        boolean z = map0 != null && map0.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) != null;
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(collection0.contains(BarcodeFormat.EAN_13) || collection0.contains(BarcodeFormat.UPC_A) || collection0.contains(BarcodeFormat.EAN_8) || collection0.contains(BarcodeFormat.UPC_E)) {
                arrayList0.add(new CLS837(map0));
            }
            if(collection0.contains(BarcodeFormat.CODE_39)) {
                arrayList0.add(new CLS838(z));
            }
            if(collection0.contains(BarcodeFormat.CODE_93)) {
                arrayList0.add(new CLS840());
            }
            if(collection0.contains(BarcodeFormat.CODE_128)) {
                arrayList0.add(new CLS833());
            }
            if(collection0.contains(BarcodeFormat.ITF)) {
                arrayList0.add(new CLS839());
            }
            if(collection0.contains(BarcodeFormat.CODABAR)) {
                arrayList0.add(new CLS834());
            }
            if(collection0.contains(BarcodeFormat.RSS_14)) {
                arrayList0.add(new CLS842());
            }
            if(collection0.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList0.add(new CLS849());
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(new CLS837(map0));
            arrayList0.add(new CLS838());
            arrayList0.add(new CLS834());
            arrayList0.add(new CLS840());
            arrayList0.add(new CLS833());
            arrayList0.add(new CLS839());
            arrayList0.add(new CLS842());
            arrayList0.add(new CLS849());
        }
        this.FLD1447 = (CLS807[])arrayList0.toArray(new CLS807[arrayList0.size()]);
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        CLS807[] arr_ˈⁱ = this.FLD1447;
        int v1 = 0;
        while(v1 < arr_ˈⁱ.length) {
            CLS807 ˈⁱ0 = arr_ˈⁱ[v1];
            try {
                return ˈⁱ0.MTH4611(v, ˆٴ0, map0);
            }
            catch(ReaderException unused_ex) {
                ++v1;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

