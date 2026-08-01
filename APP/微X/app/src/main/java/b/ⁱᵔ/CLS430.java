// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class CLS430 implements DatePickerDialog.OnDateSetListener {
    public final String[] FLD4149;
    public final CLS359 FLD4150;
    public final String[] FLD4151;
    public final CLS1626 FLD4152;
    public final SimpleDateFormat FLD4153;
    public final int FLD4154;
    public final CLS1626 FLD4155;
    public final CLS396 FLD4156;
    public final ArrayList FLD4157;

    public CLS430(String[] arr_s, int v, SimpleDateFormat simpleDateFormat0, CLS1626 ـﹳ0, CLS1626 ـﹳ1, ArrayList arrayList0, CLS396 ʿʽ0, String[] arr_s1, CLS359 ⁱˉ0) {
        this.FLD4151 = arr_s;
        this.FLD4154 = v;
        this.FLD4153 = simpleDateFormat0;
        this.FLD4155 = ـﹳ0;
        this.FLD4152 = ـﹳ1;
        this.FLD4157 = arrayList0;
        this.FLD4156 = ʿʽ0;
        this.FLD4149 = arr_s1;
        this.FLD4150 = ⁱˉ0;
    }

    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        try {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.set(1, v);
            calendar0.set(2, v1);
            calendar0.set(5, v2);
            Date date0 = calendar0.getTime();
            this.FLD4151[this.FLD4154] = this.FLD4153.format(date0);
            this.FLD4155.MTH7325(this.FLD4151[0]);
            this.FLD4152.MTH7325(this.FLD4151[1]);
            Date date1 = this.FLD4153.parse(this.FLD4151[0]);
            Date date2 = this.FLD4153.parse(this.FLD4151[1]);
            this.FLD4157.clear();
            long v3 = CLS481.MTH6689(date1).getTime();
            long v4 = CLS481.MTH6695(date2).getTime();
            ArrayList arrayList0 = this.FLD4156.MTH5760(v3 / 1000L, v4 / 1000L, this.FLD4149[0]);
            this.FLD4157.addAll(arrayList0);
            this.FLD4150.MTH5235(this.FLD4157);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

