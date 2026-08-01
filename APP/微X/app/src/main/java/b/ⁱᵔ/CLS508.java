// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import java.util.ArrayList;

public final class CLS508 implements View.OnClickListener {
    public final int FLD5025;
    public final ArrayList FLD5026;
    public final String FLD5027;
    public final ArrayList FLD5028;
    public final Activity FLD5029;

    public CLS508(ArrayList arrayList0, String s, Activity activity0, ArrayList arrayList1, int v) {
        this.FLD5025 = v;
        this.FLD5028 = arrayList0;
        this.FLD5027 = s;
        this.FLD5029 = activity0;
        this.FLD5026 = arrayList1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD5027;
        ArrayList arrayList0 = this.FLD5026;
        ArrayList arrayList1 = this.FLD5028;
        switch(this.FLD5025) {
            case 0: {
                Activity activity1 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity1, arrayList1, ((CLS2)new CLS1449(arrayList0)), TextUtils.join(",", arrayList0), -1);
                return;
            }
            case 1: {
                Activity activity2 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity2, arrayList1, ((CLS2)new CLS1454(arrayList0)), TextUtils.join(",", arrayList0), -1);
                return;
            }
            case 2: {
                Activity activity3 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity3, arrayList1, ((CLS2)new CLS1455(arrayList0)), TextUtils.join(",", arrayList0), -1);
                return;
            }
            case 3: {
                Activity activity4 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity4, arrayList1, ((CLS2)new CLS1441(arrayList0)), TextUtils.join(",", arrayList0), -1);
                return;
            }
            case 4: {
                Activity activity5 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity5, arrayList1, ((CLS2)new CLS1453(arrayList0)), TextUtils.join(",", arrayList0), -1);
                return;
            }
            default: {
                Activity activity0 = this.FLD5029;
                if(arrayList1.isEmpty()) {
                    CLS371.FLD3470.MTH5381(s, arrayList1);
                }
                CLS387.MTH5585(false, activity0, arrayList1, ((CLS2)new CLS1447(arrayList0)), TextUtils.join(",", arrayList0), -1);
            }
        }
    }
}

