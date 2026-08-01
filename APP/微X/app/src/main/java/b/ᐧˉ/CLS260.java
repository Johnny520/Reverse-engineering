// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS260 implements View.OnClickListener {
    public final int FLD2734;
    public final CLS1626 FLD2735;
    public final ArrayList FLD2736;
    public final CLS1078 FLD2737;
    public final Activity FLD2738;
    public final CLS1622 FLD2739;

    public CLS260(CLS1078 ـˆ0, ArrayList arrayList0, Activity activity0, CLS1626 ـﹳ0, CLS1622 ˑٴ0, int v) {
        this.FLD2734 = v;
        this.FLD2737 = ـˆ0;
        this.FLD2736 = arrayList0;
        this.FLD2738 = activity0;
        this.FLD2735 = ـﹳ0;
        this.FLD2739 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1078 ـˆ0 = this.FLD2737;
        ArrayList arrayList0 = this.FLD2736;
        if(this.FLD2734 == 0) {
            ـˆ0.getClass();
            try {
                Calendar calendar0 = Calendar.getInstance();
                String[] arr_s = ((String)arrayList0.get(2)).split("_");
                calendar0.setTime(ـˆ0.FLD2316.parse(arr_s[0]));
                CLS212 ˋـ0 = new CLS212(ـˆ0, arr_s, arrayList0, this.FLD2735, this.FLD2739, 1);
                int v = calendar0.get(11);
                int v1 = calendar0.get(12);
                new TimePickerDialog(this.FLD2738, ˋـ0, v, v1, true).show();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ـˆ0.getClass();
        try {
            Calendar calendar1 = Calendar.getInstance();
            String[] arr_s1 = ((String)arrayList0.get(2)).split("_");
            calendar1.setTime(ـˆ0.FLD2316.parse(arr_s1[1]));
            CLS212 ˋـ1 = new CLS212(ـˆ0, arr_s1, arrayList0, this.FLD2735, this.FLD2739, 0);
            int v2 = calendar1.get(11);
            int v3 = calendar1.get(12);
            new TimePickerDialog(this.FLD2738, ˋـ1, v2, v3, true).show();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

