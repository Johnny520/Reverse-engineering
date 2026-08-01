// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS405 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD3917;
    public final SimpleDateFormat FLD3918;
    public final ArrayList FLD3919;
    public final CLS1626 FLD3920;

    public CLS405(ArrayList arrayList0, SimpleDateFormat simpleDateFormat0, CLS1626 ـﹳ0, int v) {
        this.FLD3917 = v;
        this.FLD3919 = arrayList0;
        this.FLD3918 = simpleDateFormat0;
        this.FLD3920 = ـﹳ0;
        super();
    }

    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS1626 ـﹳ0 = this.FLD3920;
        ArrayList arrayList0 = this.FLD3919;
        SimpleDateFormat simpleDateFormat0 = this.FLD3918;
        if(this.FLD3917 == 0) {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.set(11, v);
            calendar0.set(12, v1);
            arrayList0.set(1, simpleDateFormat0.format(calendar0.getTime()));
            ـﹳ0.MTH7325(((String)arrayList0.get(1)));
            return;
        }
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(11, v);
        calendar1.set(12, v1);
        arrayList0.set(1, simpleDateFormat0.format(calendar1.getTime()));
        ـﹳ0.MTH7325(((String)arrayList0.get(1)));
    }
}

