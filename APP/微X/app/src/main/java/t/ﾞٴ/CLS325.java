// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.ContentValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t.ʾᵢ.CLS10;
import t.ᵔʾ.CLS127.CLS126;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS145;

public final class CLS325 implements CLS126 {
    public final int FLD1066;
    public final CLS155 FLD1067;

    public CLS325(CLS155 ﾞٴ0, int v) {
        this.FLD1066 = v;
        this.FLD1067 = ﾞٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS127$CLS126
    public final Object MTH2043(Object[] arr_object) {
        CLS155 ﾞٴ0 = this.FLD1067;
        if(this.FLD1066 == 0) {
            ((CLS330)ﾞٴ0).getClass();
            String s = (String)arr_object[0];
            Activity activity0 = (Activity)arr_object[1];
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((CLS330)ﾞٴ0).FLD1083.values()) {
                CLS10 ˆٴ0 = (CLS10)object0;
                ˆٴ0.getClass();
                ˆٴ0.FLD137 = new WeakReference(activity0);
                ArrayList arrayList1 = new ArrayList();
                try {
                    ˆٴ0.FLD136.clear();
                    ˆٴ0.MTH1046(null, true, false);
                    for(Object object1: ˆٴ0.FLD136) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("title", ˆٴ0.FLD139);
                        contentValues0.put("keywords", ((CLS145)object1).getText());
                        contentValues0.put("tag", ˆٴ0.FLD138);
                        arrayList1.add(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                arrayList0.addAll(arrayList1);
            }
            return arrayList0;
        }
        return ((CLS309)ﾞٴ0).MTH2237();
    }
}

