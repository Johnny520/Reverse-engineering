// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS86;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS192 implements View.OnClickListener {
    public final int FLD1838;
    public final CLS1112 FLD1839;

    public CLS192(CLS1112 ᐧˏ0, int v) {
        this.FLD1838 = v;
        this.FLD1839 = ᐧˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1112 ᐧˏ0 = this.FLD1839;
        switch(this.FLD1838) {
            case 0: {
                String s = ᐧˏ0.FLD2463;
                Activity activity1 = ((CLS219)ᐧˏ0).MTH3883();
                CLS1211 ﾞʿ0 = new CLS1211(ᐧˏ0, s);
                CLS387.MTH5600(true, activity1, ᐧˏ0.FLD2448, ((CLS2)ﾞʿ0));
                return;
            }
            case 1: {
                ᐧˏ0.getClass();
                try {
                    Activity activity2 = ((CLS219)ᐧˏ0).MTH3883();
                    if(TextUtils.isEmpty(ᐧˏ0.FLD2463)) {
                        CLS412.MTH6013(activity2, CLS27.MTH889("please_select_source"));
                        return;
                    }
                    if(CLS426.MTH6126(ᐧˏ0.FLD2463)) {
                        ArrayList arrayList2 = new ArrayList();
                        ᐧˏ0.FLD2472.MTH5349(ᐧˏ0.FLD2463, arrayList2);
                        CLS387.MTH5585(true, activity2, arrayList2, ((CLS2)new CLS1193(ᐧˏ0)), ᐧˏ0.FLD2464, -1);
                    }
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            default: {
                ᐧˏ0.getClass();
                try {
                    Activity activity0 = ((CLS219)ᐧˏ0).MTH3883();
                    ArrayList arrayList0 = new ArrayList();
                    ᐧˏ0.FLD2472.MTH5314(ᐧˏ0.FLD2157, arrayList0);
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: ᐧˏ0.FLD2454) {
                        hashSet0.add(((CLS86)object0).FLD346);
                    }
                    ArrayList arrayList1 = new ArrayList();
                    HashSet hashSet1 = new HashSet();
                    for(Object object1: arrayList0) {
                        CLS78 ˊﾞ0 = (CLS78)object1;
                        if(!hashSet0.contains("") && !hashSet1.contains("")) {
                            hashSet1.add("");
                            arrayList1.add(ˊﾞ0);
                        }
                    }
                    CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS1164(ᐧˏ0)), ᐧˏ0.FLD2478, -1);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }
}

