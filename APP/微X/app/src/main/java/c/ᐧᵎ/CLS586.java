// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

import c.ʼˊ.CLS408;
import c.ʾﹳ.CLS409;
import c.ˏـ.CLS828;
import c.ٴˉ.CLS583;
import c.ᴵʽ.CLS592;
import c.ᵎי.CLS800;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS586 implements CLS267 {
    public Map FLD1058;
    public CLS267[] FLD1059;

    public final CLS271 MTH3459(CLS272 ﾞⁱ0) {
        CLS267[] arr_ˋʼ = this.FLD1059;
        if(arr_ˋʼ != null) {
            int v = 0;
            while(v < arr_ˋʼ.length) {
                CLS267 ˋʼ0 = arr_ˋʼ[v];
                try {
                    return ˋʼ0.MTH3463(ﾞⁱ0, this.FLD1058);
                }
                catch(ReaderException unused_ex) {
                    ++v;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void MTH3460(Map map0) {
        this.FLD1058 = map0;
        boolean z = true;
        boolean z1 = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(!collection0.contains(BarcodeFormat.UPC_A) && !collection0.contains(BarcodeFormat.UPC_E) && !collection0.contains(BarcodeFormat.EAN_13) && !collection0.contains(BarcodeFormat.EAN_8) && !collection0.contains(BarcodeFormat.CODABAR) && !collection0.contains(BarcodeFormat.CODE_39) && !collection0.contains(BarcodeFormat.CODE_93) && !collection0.contains(BarcodeFormat.CODE_128) && !collection0.contains(BarcodeFormat.ITF) && !collection0.contains(BarcodeFormat.RSS_14) && !collection0.contains(BarcodeFormat.RSS_EXPANDED)) {
                z = false;
            }
            if(z && !z1) {
                arrayList0.add(new CLS828(map0));
            }
            if(collection0.contains(BarcodeFormat.QR_CODE)) {
                arrayList0.add(new CLS592());
            }
            if(collection0.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList0.add(new CLS409());
            }
            if(collection0.contains(BarcodeFormat.AZTEC)) {
                arrayList0.add(new CLS408());
            }
            if(collection0.contains(BarcodeFormat.PDF_417)) {
                arrayList0.add(new CLS800());
            }
            if(collection0.contains(BarcodeFormat.MAXICODE)) {
                arrayList0.add(new CLS583());
            }
            if(z && z1) {
                arrayList0.add(new CLS828(map0));
            }
        }
        if(arrayList0.isEmpty()) {
            if(!z1) {
                arrayList0.add(new CLS828(map0));
            }
            arrayList0.add(new CLS592());
            arrayList0.add(new CLS409());
            arrayList0.add(new CLS408());
            arrayList0.add(new CLS800());
            arrayList0.add(new CLS583());
            if(z1) {
                arrayList0.add(new CLS828(map0));
            }
        }
        this.FLD1059 = (CLS267[])arrayList0.toArray(new CLS267[arrayList0.size()]);
    }

    @Override  // c.ᐧᵎ.CLS267
    public CLS271 MTH3463(CLS272 ﾞⁱ0, Map map0) {
        this.MTH3460(map0);
        return this.MTH3459(ﾞⁱ0);
    }

    public CLS271 MTH3462(CLS272 ﾞⁱ0) {
        this.MTH3460(null);
        return this.MTH3459(ﾞⁱ0);
    }
}

