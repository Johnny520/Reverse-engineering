// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS518;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import java.io.Serializable;
import java.util.ArrayList;

public final class CLS1231 implements CLS17, CLS39 {
    public final Object FLD2996;
    public final String FLD2997;
    public final Object FLD2998;
    public final int FLD2999;
    public final String FLD3000;
    public final Object FLD3001;
    public final Serializable FLD3002;
    public final Object FLD3003;

    public CLS1231(int v, CLS280 ʻᵎ0, CLS12 ᵔʾ0, Object object0, String s, String s1, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD3001 = ʻᵎ0;
        this.FLD2998 = object0;
        this.FLD3003 = ᵔʾ0;
        this.FLD2997 = s;
        this.FLD3000 = s1;
        this.FLD2999 = v;
        this.FLD3002 = arrayList0;
        this.FLD2996 = arrayList1;
    }

    public CLS1231(CLS1622 ˑٴ0, String s, CLS1622 ˑٴ1, String s1, CLS1622 ˑٴ2, String s2, int v, Activity activity0) {
        this.FLD3001 = ˑٴ0;
        this.FLD2997 = s;
        this.FLD2998 = ˑٴ1;
        this.FLD3000 = s1;
        this.FLD3003 = ˑٴ2;
        this.FLD3002 = s2;
        this.FLD2999 = v;
        this.FLD2996 = activity0;
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v1;
        CLS12 ᵔʾ0 = (CLS12)this.FLD3003;
        String s = this.FLD2997;
        String s1 = this.FLD3000;
        int v = this.FLD2999;
        ArrayList arrayList0 = (ArrayList)this.FLD3002;
        ArrayList arrayList1 = (ArrayList)this.FLD2996;
        ((CLS280)this.FLD3001).getClass();
        String s2 = CLS66.MTH1451(this.FLD2998);
        if(TextUtils.isEmpty(s2)) {
            v1 = -1;
        }
        else {
            try {
                CLS69 ʾᵢ0 = new CLS69(s2);
                if(!CLS31.MTH1029(ʾᵢ0)) {
                    CLS518.MTH7050(ʾᵢ0.MTH1553(), s);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            v1 = CLS66.MTH1478(v, s1, s, s2, arrayList0, arrayList1);
        }
        CLS280.MTH4660(ᵔʾ0, v1);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        CLS1622 ˑٴ0 = (CLS1622)this.FLD3001;
        CLS1622 ˑٴ1 = (CLS1622)this.FLD2998;
        CLS1622 ˑٴ2 = (CLS1622)this.FLD3003;
        String s = (String)this.FLD3002;
        Activity activity0 = (Activity)this.FLD2996;
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        ˑٴ0.MTH800(CLS27.MTH889("account"));
        String s1 = this.FLD2997;
        if(!TextUtils.isEmpty(s1)) {
            ˑٴ0.MTH7277(s1);
        }
        ˑٴ1.MTH800(CLS27.MTH889("remark"));
        String s2 = this.FLD3000;
        if(!TextUtils.isEmpty(s2)) {
            ˑٴ1.MTH7277(s2);
        }
        ˑٴ2.MTH800(CLS27.MTH889("password"));
        if(!TextUtils.isEmpty(s)) {
            ˑٴ2.MTH7277(s);
        }
        if(this.FLD2999 != 1) {
            ˑٴ2.FLD5256 = CLS27.MTH889("hidden");
        }
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS182.MTH3498(יᐧ0, new Object[]{ˑٴ0, ˑٴ1, ˑٴ2}, 10, linearLayout0, יᐧ0);
    }
}

