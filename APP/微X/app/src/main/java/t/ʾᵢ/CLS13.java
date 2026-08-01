// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;
import t.ᵔʾ.CLS133;
import t.ﾞᐧ.CLS337;

public final class CLS13 implements TimePickerDialog.OnTimeSetListener {
    public final CLS216 FLD154;
    public final CLS337 FLD155;
    public final JSONObject FLD156;

    public CLS13(CLS216 ˎﾞ0, JSONObject jSONObject0, CLS337 ˎᵢ0) {
        this.FLD154 = ˎﾞ0;
        this.FLD156 = jSONObject0;
        this.FLD155 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        this.FLD154.getClass();
        try {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.set(11, v);
            calendar0.set(12, v1);
            Date date0 = calendar0.getTime();
            String s = this.FLD154.FLD240.format(date0);
            this.FLD156.put("t", s);
            this.FLD155.MTH2381(s);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

