// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import b.ᐧˉ.CLS1078;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class CLS435 implements DatePickerDialog.OnDateSetListener {
    public final int FLD4178;
    public final Object FLD4179;
    public final ArrayList FLD4180;
    public final CLS1626 FLD4181;

    public CLS435(CLS1078 ـˆ0, ArrayList arrayList0, CLS1626 ـﹳ0) {
        this.FLD4178 = 2;
        super();
        this.FLD4179 = ـˆ0;
        this.FLD4180 = arrayList0;
        this.FLD4181 = ـﹳ0;
    }

    public CLS435(ArrayList arrayList0, SimpleDateFormat simpleDateFormat0, CLS1626 ـﹳ0, int v) {
        this.FLD4178 = v;
        this.FLD4180 = arrayList0;
        this.FLD4179 = simpleDateFormat0;
        this.FLD4181 = ـﹳ0;
        super();
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        CLS1626 ـﹳ0 = this.FLD4181;
        ArrayList arrayList0 = this.FLD4180;
        Object object0 = this.FLD4179;
        switch(this.FLD4178) {
            case 0: {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(1, v);
                calendar1.set(2, v1);
                calendar1.set(5, v2);
                arrayList0.set(0, ((SimpleDateFormat)object0).format(calendar1.getTime()));
                ـﹳ0.MTH7325(((String)arrayList0.get(0)));
                return;
            }
            case 1: {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(1, v);
                calendar2.set(2, v1);
                calendar2.set(5, v2);
                arrayList0.set(0, ((SimpleDateFormat)object0).format(calendar2.getTime()));
                ـﹳ0.MTH7325(((String)arrayList0.get(0)));
                return;
            }
            default: {
                ((CLS1078)object0).getClass();
                Calendar calendar0 = Calendar.getInstance();
                calendar0.set(1, v);
                calendar0.set(2, v1);
                calendar0.set(5, v2);
                Date date0 = calendar0.getTime();
                arrayList0.set(0, ((CLS1078)object0).FLD2315.format(date0));
                ـﹳ0.MTH7325(((String)arrayList0.get(0)));
            }
        }
    }
}

