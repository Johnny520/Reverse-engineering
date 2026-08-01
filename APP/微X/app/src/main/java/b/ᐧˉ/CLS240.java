// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class CLS240 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD2398;
    public final ArrayList FLD2399;
    public final CLS1078 FLD2400;
    public final CLS1626 FLD2401;

    public CLS240(CLS1078 ـˆ0, ArrayList arrayList0, CLS1626 ـﹳ0, int v) {
        this.FLD2398 = v;
        this.FLD2400 = ـˆ0;
        this.FLD2399 = arrayList0;
        this.FLD2401 = ـﹳ0;
        super();
    }

    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS1626 ـﹳ0 = this.FLD2401;
        ArrayList arrayList0 = this.FLD2399;
        CLS1078 ـˆ0 = this.FLD2400;
        switch(this.FLD2398) {
            case 0: {
                ـˆ0.getClass();
                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(11, v);
                calendar1.set(12, v1);
                Date date1 = calendar1.getTime();
                arrayList0.set(0, ـˆ0.FLD2316.format(date1));
                ـﹳ0.MTH7325(((String)arrayList0.get(0)));
                return;
            }
            case 1: {
                ـˆ0.getClass();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, v);
                calendar2.set(12, v1);
                Date date2 = calendar2.getTime();
                arrayList0.set(1, ـˆ0.FLD2316.format(date2));
                ـﹳ0.MTH7325(((String)arrayList0.get(1)));
                return;
            }
            default: {
                ـˆ0.getClass();
                Calendar calendar0 = Calendar.getInstance();
                calendar0.set(11, v);
                calendar0.set(12, v1);
                Date date0 = calendar0.getTime();
                arrayList0.set(1, ـˆ0.FLD2316.format(date0));
                ـﹳ0.MTH7325(((String)arrayList0.get(1)));
            }
        }
    }
}

