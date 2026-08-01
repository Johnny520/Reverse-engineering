// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS254 implements View.OnClickListener {
    public final int FLD2632;
    public final Activity FLD2633;
    public final ArrayList FLD2634;
    public final CLS1078 FLD2635;
    public final Calendar FLD2636;
    public final CLS1626 FLD2637;

    public CLS254(CLS1078 ـˆ0, ArrayList arrayList0, Calendar calendar0, Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD2632 = v;
        this.FLD2635 = ـˆ0;
        this.FLD2634 = arrayList0;
        this.FLD2636 = calendar0;
        this.FLD2633 = activity0;
        this.FLD2637 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1078 ـˆ0 = this.FLD2635;
        CLS1626 ـﹳ0 = this.FLD2637;
        Calendar calendar0 = this.FLD2636;
        ArrayList arrayList0 = this.FLD2634;
        if(this.FLD2632 == 0) {
            Activity activity0 = this.FLD2633;
            ـˆ0.getClass();
            try {
                Calendar calendar1 = Calendar.getInstance();
                boolean z = ((String)arrayList0.get(1)).equals("--");
                SimpleDateFormat simpleDateFormat0 = ـˆ0.FLD2316;
                if(z) {
                    arrayList0.set(1, simpleDateFormat0.format(calendar0.getTime()));
                }
                calendar1.setTime(simpleDateFormat0.parse(((String)arrayList0.get(1))));
                new TimePickerDialog(activity0, new CLS240(ـˆ0, arrayList0, ـﹳ0, 1), calendar1.get(11), calendar1.get(12), true).show();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        Activity activity1 = this.FLD2633;
        ـˆ0.getClass();
        try {
            Calendar calendar2 = Calendar.getInstance();
            boolean z1 = ((String)arrayList0.get(1)).equals("--");
            SimpleDateFormat simpleDateFormat1 = ـˆ0.FLD2316;
            if(z1) {
                arrayList0.set(1, simpleDateFormat1.format(calendar0.getTime()));
            }
            calendar2.setTime(simpleDateFormat1.parse(((String)arrayList0.get(1))));
            new TimePickerDialog(activity1, new CLS240(ـˆ0, arrayList0, ـﹳ0, 2), calendar2.get(11), calendar2.get(12), true).show();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

