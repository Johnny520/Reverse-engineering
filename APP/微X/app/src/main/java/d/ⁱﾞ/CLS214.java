// Decompiled by JEB v5.42.0.202606242140

package d.ⁱﾞ;

import android.app.Activity;
import android.text.TextUtils;
import d.ˑʽ.CLS13;
import d.ˑʽ.CLS38;
import d.ˑʽ.CLS53;
import d.יʻ.CLS65.CLS64;
import d.ᐧˈ.CLS101;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS214 implements CLS64 {
    public final Object FLD674;
    public final int FLD675;

    public CLS214(Object object0, int v) {
        this.FLD675 = v;
        this.FLD674 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // d.יʻ.CLS65$CLS64
    public final void MTH774(Object[] arr_object) {
        Object object0 = this.FLD674;
        boolean z = false;
        switch(this.FLD675) {
            case 0: {
                ((CLS215)object0).getClass();
                String s2 = (String)arr_object[0];
                if(!TextUtils.isEmpty(s2)) {
                    HashMap hashMap0 = ((CLS215)object0).FLD678;
                    if(hashMap0.containsKey(s2)) {
                        String s3 = (String)arr_object[1];
                        Activity activity0 = (Activity)arr_object[2];
                        String s4 = "";
                        boolean z1 = arr_object.length <= 3 ? false : ((Boolean)arr_object[3]).booleanValue();
                        if(arr_object.length > 4) {
                            z = ((Boolean)arr_object[4]).booleanValue();
                        }
                        if(arr_object.length > 5) {
                            s4 = (String)arr_object[5];
                        }
                        CLS101 ˆᐧ0 = (CLS101)hashMap0.get(s2);
                        if(ˆᐧ0 != null) {
                            ˆᐧ0.FLD588 = s3;
                            ˆᐧ0.FLD583 = new WeakReference(activity0);
                            ˆᐧ0.MTH1054(z1, z, s4);
                        }
                    }
                }
                return;
            }
            case 1: {
                ((CLS53)object0).getClass();
                ((CLS53)object0).FLD280 = (HashSet)arr_object[0];
                ((CLS53)object0).FLD279.MTH1157();
                ((CLS53)object0).FLD277.MTH1157();
                ((CLS53)object0).FLD281.MTH1157();
                ((CLS53)object0).MTH712();
                return;
            }
            default: {
                ((CLS38)object0).getClass();
                ArrayList arrayList0 = (ArrayList)arr_object[0];
                String s = (String)arr_object[1];
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    String s1 = CLS13.MTH425(((String)object1));
                    if(!TextUtils.isEmpty(s1)) {
                        arrayList1.add(s1);
                    }
                }
                ((CLS38)object0).MTH610(arrayList1, s);
            }
        }
    }
}

