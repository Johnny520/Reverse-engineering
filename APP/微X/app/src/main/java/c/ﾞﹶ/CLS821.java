// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

import c.ˉﹶ.CLS615;
import c.ˑـ.CLS639;
import c.ٴʻ.CLS787;
import c.ᐧـ.CLS835;
import c.ᵢᴵ.CLS816;
import c.ﾞי.CLS819;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS821 implements CLS381 {
    public CLS381[] FLD1664;
    public Map FLD1665;

    public CLS379 MTH5134(CLS374 ʻᵢ0) {
        this.MTH5137(null);
        return this.MTH5136(ʻᵢ0);
    }

    @Override  // c.ﾞﹶ.CLS381
    public CLS379 MTH5132(CLS374 ʻᵢ0, Map map0) {
        this.MTH5137(map0);
        return this.MTH5136(ʻᵢ0);
    }

    public final CLS379 MTH5136(CLS374 ʻᵢ0) {
        CLS381[] arr_ᴵⁱ = this.FLD1664;
        if(arr_ᴵⁱ != null) {
            int v = 0;
            while(v < arr_ᴵⁱ.length) {
                CLS381 ᴵⁱ0 = arr_ᴵⁱ[v];
                try {
                    return ᴵⁱ0.MTH5132(ʻᵢ0, this.FLD1665);
                }
                catch(ReaderException unused_ex) {
                    ++v;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public void MTH5137(Map map0) {
        this.FLD1665 = map0;
        boolean z = true;
        boolean z1 = map0 != null && map0.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection0 = map0 == null ? null : ((Collection)map0.get(DecodeHintType.POSSIBLE_FORMATS));
        ArrayList arrayList0 = new ArrayList();
        if(collection0 != null) {
            if(!collection0.contains(BarcodeFormat.UPC_A) && !collection0.contains(BarcodeFormat.UPC_E) && !collection0.contains(BarcodeFormat.EAN_13) && !collection0.contains(BarcodeFormat.EAN_8) && !collection0.contains(BarcodeFormat.CODABAR) && !collection0.contains(BarcodeFormat.CODE_39) && !collection0.contains(BarcodeFormat.CODE_93) && !collection0.contains(BarcodeFormat.CODE_128) && !collection0.contains(BarcodeFormat.ITF) && !collection0.contains(BarcodeFormat.RSS_14) && !collection0.contains(BarcodeFormat.RSS_EXPANDED)) {
                z = false;
            }
            if(z && !z1) {
                arrayList0.add(new CLS835(map0));
            }
            if(collection0.contains(BarcodeFormat.QR_CODE)) {
                arrayList0.add(new CLS819());
            }
            if(collection0.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList0.add(new CLS816());
            }
            if(collection0.contains(BarcodeFormat.AZTEC)) {
                arrayList0.add(new CLS787());
            }
            if(collection0.contains(BarcodeFormat.PDF_417)) {
                arrayList0.add(new CLS639());
            }
            if(collection0.contains(BarcodeFormat.MAXICODE)) {
                arrayList0.add(new CLS615());
            }
            if(z && z1) {
                arrayList0.add(new CLS835(map0));
            }
        }
        if(arrayList0.isEmpty()) {
            if(!z1) {
                arrayList0.add(new CLS835(map0));
            }
            arrayList0.add(new CLS819());
            arrayList0.add(new CLS816());
            arrayList0.add(new CLS787());
            arrayList0.add(new CLS639());
            arrayList0.add(new CLS615());
            if(z1) {
                arrayList0.add(new CLS835(map0));
            }
        }
        this.FLD1664 = (CLS381[])arrayList0.toArray(new CLS381[arrayList0.size()]);
    }
}

