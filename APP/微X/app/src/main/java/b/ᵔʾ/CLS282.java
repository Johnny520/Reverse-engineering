// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS2;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import java.util.ArrayList;

public final class CLS282 implements View.OnClickListener {
    public final int FLD2928;
    public final Activity FLD2929;
    public final ArrayList FLD2930;
    public final CLS298 FLD2931;
    public final String FLD2932;
    public final ArrayList FLD2933;

    public CLS282(CLS298 יʼ0, ArrayList arrayList0, String s, Activity activity0, ArrayList arrayList1, int v) {
        this.FLD2928 = v;
        this.FLD2931 = יʼ0;
        this.FLD2930 = arrayList0;
        this.FLD2932 = s;
        this.FLD2929 = activity0;
        this.FLD2933 = arrayList1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2932;
        ArrayList arrayList0 = this.FLD2933;
        ArrayList arrayList1 = this.FLD2930;
        CLS298 יʼ0 = this.FLD2931;
        if(this.FLD2928 == 0) {
            Activity activity0 = this.FLD2929;
            יʼ0.getClass();
            if(arrayList1.isEmpty()) {
                CLS371.FLD3470.MTH5381(s, arrayList1);
            }
            CLS387.MTH5585(false, activity0, arrayList1, ((CLS2)new CLS1240(arrayList0)), TextUtils.join(",", arrayList0), -1);
            return;
        }
        Activity activity1 = this.FLD2929;
        יʼ0.getClass();
        if(arrayList1.isEmpty()) {
            CLS371.FLD3470.MTH5381(s, arrayList1);
        }
        CLS387.MTH5585(false, activity1, arrayList1, ((CLS2)new CLS1242(arrayList0)), TextUtils.join(",", arrayList0), -1);
    }
}

