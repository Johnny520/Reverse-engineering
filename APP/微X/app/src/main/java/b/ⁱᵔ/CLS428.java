// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS428 implements View.OnClickListener {
    public final int FLD4127;
    public final CLS1626 FLD4128;
    public final ArrayList FLD4129;
    public final SimpleDateFormat FLD4130;
    public final Activity FLD4131;

    public CLS428(SimpleDateFormat simpleDateFormat0, ArrayList arrayList0, Activity activity0, CLS1626 ـﹳ0, int v) {
        this.FLD4127 = v;
        this.FLD4130 = simpleDateFormat0;
        this.FLD4129 = arrayList0;
        this.FLD4131 = activity0;
        this.FLD4128 = ـﹳ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD4128;
        ArrayList arrayList0 = this.FLD4129;
        SimpleDateFormat simpleDateFormat0 = this.FLD4130;
        switch(this.FLD4127) {
            case 0: {
                try {
                    Calendar calendar1 = Calendar.getInstance();
                    calendar1.setTime(simpleDateFormat0.parse(((String)arrayList0.get(0))));
                    CLS435 ˎˋ1 = new CLS435(arrayList0, simpleDateFormat0, ـﹳ0, 0);
                    int v3 = calendar1.get(1);
                    int v4 = calendar1.get(2);
                    int v5 = calendar1.get(5);
                    new DatePickerDialog(this.FLD4131, ˎˋ1, v3, v4, v5).show();
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                try {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(simpleDateFormat0.parse(((String)arrayList0.get(1))));
                    CLS405 ˆᵢ0 = new CLS405(arrayList0, simpleDateFormat0, ـﹳ0, 0);
                    int v6 = calendar2.get(11);
                    int v7 = calendar2.get(12);
                    new TimePickerDialog(this.FLD4131, ˆᵢ0, v6, v7, true).show();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                try {
                    Calendar calendar0 = Calendar.getInstance();
                    calendar0.setTime(simpleDateFormat0.parse(((String)arrayList0.get(0))));
                    CLS435 ˎˋ0 = new CLS435(arrayList0, simpleDateFormat0, ـﹳ0, 1);
                    int v = calendar0.get(1);
                    int v1 = calendar0.get(2);
                    int v2 = calendar0.get(5);
                    new DatePickerDialog(this.FLD4131, ˎˋ0, v, v1, v2).show();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

