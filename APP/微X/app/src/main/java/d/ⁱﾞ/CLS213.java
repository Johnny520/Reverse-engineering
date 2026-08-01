// Decompiled by JEB v5.42.0.202606242140

package d.ⁱﾞ;

import android.app.Activity;
import android.content.ContentValues;
import d.יʻ.CLS62;
import d.יʻ.CLS69;
import d.יʻ.CLS73.CLS72;
import d.ᐧˈ.CLS101;
import d.ⁱٴ.CLS125;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public final class CLS213 implements CLS72 {
    public final CLS62 FLD672;
    public final CLS215 FLD673;

    public CLS213(CLS215 ⁱﾞ0, CLS62 ˎˏ0) {
        this.FLD673 = ⁱﾞ0;
        this.FLD672 = ˎˏ0;
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS73$CLS72
    public final ArrayList MTH834(Object[] arr_object) {
        this.FLD673.getClass();
        String s = (String)arr_object[0];
        Activity activity0 = (Activity)arr_object[1];
        ArrayList arrayList0 = new ArrayList();
        boolean z = this.FLD672.MTH760("isEmulator", new Object[0]);
        HashMap hashMap0 = this.FLD673.FLD678;
        for(Object object0: hashMap0.keySet()) {
            String s1 = (String)object0;
            if(!z) {
                if(!"config_donate_key_emulator".equals(s1)) {
                    goto label_14;
                }
                continue;
            }
            else if("config_donate_key".equals(s1)) {
                continue;
            }
        label_14:
            CLS101 ˆᐧ0 = (CLS101)hashMap0.get(s1);
            if(ˆᐧ0 != null) {
                ˆᐧ0.FLD583 = new WeakReference(activity0);
                ˆᐧ0.FLD588 = s;
                ArrayList arrayList1 = new ArrayList();
                try {
                    ˆᐧ0.FLD581.clear();
                    ˆᐧ0.MTH1056(null, true, true, false);
                    for(Object object1: ˆᐧ0.FLD581) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("title", ˆᐧ0.FLD584);
                        contentValues0.put("keywords", ((CLS125)object1).getText());
                        contentValues0.put("tag", ˆᐧ0.FLD586);
                        arrayList1.add(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
                arrayList0.addAll(arrayList1);
            }
        }
        return arrayList0;
    }
}

