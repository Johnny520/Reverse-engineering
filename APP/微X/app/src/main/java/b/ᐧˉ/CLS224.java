// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS435;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS224 implements View.OnClickListener {
    public final int FLD2184;
    public final CLS1626 FLD2185;
    public final ArrayList FLD2186;
    public final CLS1078 FLD2187;
    public final Activity FLD2188;

    public CLS224(CLS1078 ـˆ0, ArrayList arrayList0, Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD2184 = v;
        this.FLD2187 = ـˆ0;
        this.FLD2186 = arrayList0;
        this.FLD2188 = activity0;
        this.FLD2185 = ـﹳ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1078 ـˆ0 = this.FLD2187;
        CLS1626 ـﹳ0 = this.FLD2185;
        ArrayList arrayList0 = this.FLD2186;
        if(this.FLD2184 == 0) {
            ـˆ0.getClass();
            try {
                Calendar calendar0 = Calendar.getInstance();
                String s = (String)arrayList0.get(0);
                calendar0.setTime(ـˆ0.FLD2316.parse(s));
                CLS240 ᐧʽ0 = new CLS240(ـˆ0, arrayList0, ـﹳ0, 0);
                int v = calendar0.get(11);
                int v1 = calendar0.get(12);
                new TimePickerDialog(this.FLD2188, ᐧʽ0, v, v1, true).show();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ـˆ0.getClass();
        try {
            Calendar calendar1 = Calendar.getInstance();
            String s1 = (String)arrayList0.get(0);
            calendar1.setTime(ـˆ0.FLD2315.parse(s1));
            CLS435 ˎˋ0 = new CLS435(ـˆ0, arrayList0, ـﹳ0);
            int v2 = calendar1.get(1);
            int v3 = calendar1.get(2);
            int v4 = calendar1.get(5);
            new DatePickerDialog(this.FLD2188, ˎˋ0, v2, v3, v4).show();
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

