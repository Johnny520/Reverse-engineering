// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS639 implements CLS3 {
    public final int FLD595;
    public final CLS3 FLD596;
    public final String FLD597;
    public final CLS794 FLD598;
    public final Activity FLD599;

    public CLS639(Activity activity0, CLS3 ˆٴ0, CLS794 ᴵʽ0, String s) {
        this.FLD595 = 2;
        super();
        this.FLD598 = ᴵʽ0;
        this.FLD599 = activity0;
        this.FLD597 = s;
        this.FLD596 = ˆٴ0;
    }

    public CLS639(CLS794 ᴵʽ0, String s, Activity activity0, CLS3 ˆٴ0, int v) {
        this.FLD595 = v;
        this.FLD598 = ᴵʽ0;
        this.FLD597 = s;
        this.FLD599 = activity0;
        this.FLD596 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS3 ˆٴ0 = this.FLD596;
        String s = this.FLD597;
        CLS794 ᴵʽ0 = this.FLD598;
        switch(this.FLD595) {
            case 0: {
                Activity activity1 = this.FLD599;
                ArrayList arrayList2 = ᴵʽ0.FLD1147.MTH1634(s);
                Iterator iterator1 = arrayList2.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    if(CLS372.MTH5396("")) {
                        iterator1.remove();
                    }
                }
                CLS387.MTH5585(false, activity1, arrayList2, ((CLS2)new CLS833(ˆٴ0)), null, -1);
                return;
            }
            case 1: {
                Activity activity2 = this.FLD599;
                ArrayList arrayList3 = ᴵʽ0.FLD1147.MTH1634(s);
                Iterator iterator2 = arrayList3.iterator();
                while(iterator2.hasNext()) {
                    iterator2.next();
                    if(!CLS372.MTH5396("")) {
                        iterator2.remove();
                    }
                }
                CLS387.MTH5585(false, activity2, arrayList3, ((CLS2)new CLS795(ˆٴ0)), null, -1);
                return;
            }
            case 2: {
                Activity activity3 = this.FLD599;
                ᴵʽ0.getClass();
                HashSet hashSet0 = new HashSet();
                CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
                String[] arr_s = CLS502.MTH6941(ˎᵢ0.MTH1624());
                for(int v = 0; v < arr_s.length; ++v) {
                    String s1 = arr_s[v];
                    if(s1.startsWith("wx__c_")) {
                        hashSet0.addAll(ˎᵢ0.MTH1655(s1));
                    }
                }
                String s2 = CLS27.MTH904();
                ArrayList arrayList4 = new ArrayList();
                for(Object object0: ᴵʽ0.FLD1444.MTH5377()) {
                    String s3 = (String)object0;
                    if(!hashSet0.contains(s3) && !s3.equals(s2)) {
                        arrayList4.add(new CLS78(s3, CLS371.FLD3470.MTH5311(s3)));
                    }
                }
                CLS387.MTH5585(false, activity3, arrayList4, ((CLS2)new CLS828(ᴵʽ0, s, ˆٴ0)), "", -1);
                return;
            }
            default: {
                Activity activity0 = this.FLD599;
                ArrayList arrayList0 = ᴵʽ0.FLD1147.MTH1634(s);
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
                CLS387.MTH5585(false, activity0, arrayList0, ((CLS2)new CLS835(ᴵʽ0, ˆٴ0, s, arrayList1)), "", -1);
            }
        }
    }
}

