// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class CLS393 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD3689;
    public final CLS1626 FLD3690;
    public final Calendar FLD3691;

    public CLS393(Calendar calendar0, CLS1626 ـﹳ0, int v) {
        this.FLD3689 = v;
        this.FLD3691 = calendar0;
        this.FLD3690 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS1626 ـﹳ0 = this.FLD3690;
        Calendar calendar0 = this.FLD3691;
        if(this.FLD3689 == 0) {
            calendar0.set(11, v);
            calendar0.set(12, v1);
            ـﹳ0.MTH800(new SimpleDateFormat("HH:mm").format(calendar0.getTime()));
            return;
        }
        calendar0.set(11, v);
        calendar0.set(12, v1);
        ـﹳ0.MTH800(new SimpleDateFormat("HH:mm").format(calendar0.getTime()));
    }
}

