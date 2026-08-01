// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.text.TextUtils;
import android.widget.TimePicker;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1626;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public final class CLS212 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD2041;
    public final CLS1626 FLD2042;
    public final String[] FLD2043;
    public final CLS1078 FLD2044;
    public final ArrayList FLD2045;
    public final CLS1622 FLD2046;

    public CLS212(CLS1078 ـˆ0, String[] arr_s, ArrayList arrayList0, CLS1626 ـﹳ0, CLS1622 ˑٴ0, int v) {
        this.FLD2041 = v;
        this.FLD2044 = ـˆ0;
        this.FLD2043 = arr_s;
        this.FLD2045 = arrayList0;
        this.FLD2042 = ـﹳ0;
        this.FLD2046 = ˑٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS1622 ˑٴ0 = this.FLD2046;
        CLS1626 ـﹳ0 = this.FLD2042;
        ArrayList arrayList0 = this.FLD2045;
        String[] arr_s = this.FLD2043;
        CLS1078 ـˆ0 = this.FLD2044;
        if(this.FLD2041 == 0) {
            ـˆ0.getClass();
            Calendar calendar0 = Calendar.getInstance();
            calendar0.set(11, v);
            calendar0.set(12, v1);
            Date date0 = calendar0.getTime();
            arr_s[1] = ـˆ0.FLD2316.format(date0);
            arrayList0.set(2, TextUtils.join("_", arr_s));
            ـﹳ0.MTH7325(arr_s[1]);
            ˑٴ0.MTH798((arr_s.length <= 3 || !"t".equals(arr_s[3]) ? "" : String.format(CLS27.MTH889("timestring_repeat_interval"), arr_s[0], arr_s[1], arr_s[2])));
            return;
        }
        ـˆ0.getClass();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(11, v);
        calendar1.set(12, v1);
        Date date1 = calendar1.getTime();
        arr_s[0] = ـˆ0.FLD2316.format(date1);
        arrayList0.set(2, TextUtils.join("_", arr_s));
        ـﹳ0.MTH7325(arr_s[0]);
        ˑٴ0.MTH798((arr_s.length <= 3 || !"t".equals(arr_s[3]) ? "" : String.format(CLS27.MTH889("timestring_repeat_interval"), arr_s[0], arr_s[1], arr_s[2])));
    }
}

