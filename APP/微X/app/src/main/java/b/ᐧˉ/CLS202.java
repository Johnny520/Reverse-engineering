// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS202 implements View.OnClickListener {
    public final int FLD1928;
    public final Activity FLD1929;
    public final CLS911 FLD1930;

    public CLS202(CLS911 ʼ0, Activity activity0, int v) {
        this.FLD1928 = v;
        this.FLD1930 = ʼ0;
        this.FLD1929 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS911 ʼ0 = this.FLD1930;
        switch(this.FLD1928) {
            case 0: {
                Activity activity1 = this.FLD1929;
                CLS371 ʻ1 = ʼ0.FLD1702;
                ArrayList arrayList2 = ʻ1.MTH5341(ʼ0.FLD2157);
                ArrayList arrayList3 = new ArrayList();
                for(Object object1: arrayList2) {
                    arrayList3.add(new CLS78(((String)object1), ʻ1.MTH5311(((String)object1))));
                }
                CLS387.MTH5585(true, activity1, arrayList3, ((CLS2)new CLS1002(ʼ0)), ʼ0.FLD2151.MTH925("$random_del_excl", ""), -1);
                return;
            }
            case 1: {
                Activity activity2 = this.FLD1929;
                ʼ0.getClass();
                ArrayList arrayList4 = new ArrayList();
                ʼ0.FLD1702.MTH5313(ʼ0.FLD2157, arrayList4);
                HashSet hashSet0 = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for(Object object2: arrayList4) {
                    CLS78 ˊﾞ0 = (CLS78)object2;
                    if(!hashSet0.contains("") && CLS502.MTH6941("").length < 50) {
                        hashSet0.add("");
                        arrayList5.add(ˊﾞ0);
                    }
                }
                CLS372.MTH5405(arrayList5);
                CLS387.MTH5585(true, activity2, arrayList5, ((CLS2)new CLS1180(ʼ0)), ʼ0.FLD2151.MTH925("$mass_invite_chatrooms", ""), -1);
                return;
            }
            case 2: {
                Activity activity3 = this.FLD1929;
                ʼ0.getClass();
                ArrayList arrayList6 = new ArrayList();
                ʼ0.FLD1702.MTH5313(ʼ0.FLD2157, arrayList6);
                HashSet hashSet1 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                for(Object object3: arrayList6) {
                    CLS78 ˊﾞ1 = (CLS78)object3;
                    if(!hashSet1.contains("") && CLS502.MTH6941("").length != 500) {
                        hashSet1.add("");
                        arrayList7.add(ˊﾞ1);
                    }
                }
                CLS372.MTH5405(arrayList7);
                CLS387.MTH5585(true, activity3, arrayList7, ((CLS2)new CLS1021(ʼ0)), ʼ0.FLD2151.MTH925("$aam2_chatrooms", ""), -1);
                return;
            }
            default: {
                Activity activity0 = this.FLD1929;
                CLS371 ʻ0 = ʼ0.FLD1702;
                ArrayList arrayList0 = ʻ0.MTH5341(ʼ0.FLD2157);
                ArrayList arrayList1 = new ArrayList();
                for(Object object0: arrayList0) {
                    arrayList1.add(new CLS78(((String)object0), ʻ0.MTH5311(((String)object0))));
                }
                CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS1094(ʼ0)), ʼ0.FLD2151.MTH925("$aam_excl", ""), -1);
            }
        }
    }
}

