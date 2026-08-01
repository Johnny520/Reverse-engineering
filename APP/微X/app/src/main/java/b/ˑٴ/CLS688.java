// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.util.Pair;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS219;
import b.ⁱᵔ.CLS500;
import java.util.ArrayList;

public final class CLS688 implements CLS37 {
    public final int FLD771;
    public final CLS824 FLD772;

    public CLS688(CLS824 ᵔˊ0, int v) {
        this.FLD771 = v;
        this.FLD772 = ᵔˊ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        CLS824 ᵔˊ0 = this.FLD772;
        switch(this.FLD771) {
            case 0: {
                return ᵔˊ0.FLD1447.FLD1438.MTH6895("custom_features_settings") ? Pair.create(CLS27.MTH889("config_custom"), "config_custom#20") : null;
            }
            case 1: {
                ᵔˊ0.getClass();
                String s = (String)arr_object[0];
                Activity activity0 = (Activity)arr_object[1];
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ᵔˊ0.FLD1257.values()) {
                    CLS219 ˏʻ0 = (CLS219)object0;
                    ˏʻ0.MTH3876(activity0);
                    ˏʻ0.FLD2157 = s;
                    ArrayList arrayList1 = new ArrayList();
                    try {
                        ˏʻ0.FLD2149.clear();
                        ˏʻ0.MTH3878(null, true, true, false);
                        for(Object object1: ˏʻ0.FLD2149) {
                            ContentValues contentValues0 = new ContentValues();
                            contentValues0.put("title", ˏʻ0.FLD2156);
                            contentValues0.put("keywords", ((CLS18)object1).getText());
                            contentValues0.put("tag", ˏʻ0.FLD2155);
                            arrayList1.add(contentValues0);
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    arrayList0.addAll(arrayList1);
                }
                return arrayList0;
            }
            default: {
                CLS500 ᵢﹶ0 = ᵔˊ0.FLD1447.FLD1438;
                return !ᵢﹶ0.MTH6895("scheduled_task") && !ᵢﹶ0.MTH6895("sched_tsk") ? null : Pair.create(CLS27.MTH889("scheduled_task"), "scheduled_task#5");
            }
        }
    }
}

