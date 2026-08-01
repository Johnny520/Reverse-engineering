// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class CLS490 implements DatePickerDialog.OnDateSetListener {
    public final int FLD4824;
    public final CLS1626 FLD4825;
    public final Calendar FLD4826;

    public CLS490(Calendar calendar0, CLS1626 ـﹳ0, int v) {
        this.FLD4824 = v;
        this.FLD4826 = calendar0;
        this.FLD4825 = ـﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.app.DatePickerDialog$OnDateSetListener
    public final void onDateSet(DatePicker datePicker0, int v, int v1, int v2) {
        CLS1626 ـﹳ0 = this.FLD4825;
        Calendar calendar0 = this.FLD4826;
        if(this.FLD4824 == 0) {
            try {
                calendar0.set(1, v);
                calendar0.set(2, v1);
                calendar0.set(5, v2);
                ـﹳ0.MTH800(new SimpleDateFormat("yyyy-MM-dd").format(calendar0.getTime()));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        try {
            calendar0.set(1, v);
            calendar0.set(2, v1);
            calendar0.set(5, v2);
            ـﹳ0.MTH800(new SimpleDateFormat("yyyy-MM-dd").format(calendar0.getTime()));
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

