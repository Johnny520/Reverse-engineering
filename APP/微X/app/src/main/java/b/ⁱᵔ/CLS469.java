// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.ContentValues;
import android.widget.DatePicker;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class CLS469 implements DatePickerDialog.OnDateSetListener {
    public final String[] FLD4581;
    public final CLS396 FLD4582;
    public final CLS1626 FLD4583;
    public final SimpleDateFormat FLD4584;
    public final ArrayList FLD4585;
    public final CLS359 FLD4586;
    public final String[] FLD4587;

    public CLS469(CLS359 ⁱˉ0, CLS1626 ـﹳ0, CLS396 ʿʽ0, SimpleDateFormat simpleDateFormat0, ArrayList arrayList0, String[] arr_s, String[] arr_s1) {
        this.FLD4581 = arr_s;
        this.FLD4584 = simpleDateFormat0;
        this.FLD4583 = ـﹳ0;
        this.FLD4585 = arrayList0;
        this.FLD4582 = ʿʽ0;
        this.FLD4587 = arr_s1;
        this.FLD4586 = ⁱˉ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.set(1, v);
        calendar0.set(2, v1);
        calendar0.set(5, v2);
        Date date0 = calendar0.getTime();
        String s = this.FLD4584.format(date0);
        this.FLD4581[0] = s;
        this.FLD4583.MTH7325(s);
        ArrayList arrayList0 = this.FLD4585;
        arrayList0.clear();
        long v3 = CLS481.MTH6689(calendar0.getTime()).getTime();
        long v4 = CLS481.MTH6695(calendar0.getTime()).getTime();
        for(Object object0: this.FLD4582.MTH5760(v3 / 1000L, v4 / 1000L, this.FLD4587[0])) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!CLS66.MTH1479(((long)contentValues0.getAsLong("id")))) {
                arrayList0.add(contentValues0);
            }
        }
        this.FLD4586.MTH5235(arrayList0);
    }
}

