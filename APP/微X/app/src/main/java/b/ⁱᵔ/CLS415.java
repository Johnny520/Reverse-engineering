// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.ContentValues;
import android.widget.TimePicker;
import b.ʻˑ.CLS3;
import b.ᐧˉ.CLS182;

public final class CLS415 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD4020;
    public final CLS3 FLD4021;
    public final ContentValues FLD4022;

    public CLS415(ContentValues contentValues0, CLS3 ˆٴ0, int v) {
        this.FLD4020 = v;
        this.FLD4022 = contentValues0;
        this.FLD4021 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS3 ˆٴ0 = this.FLD4021;
        ContentValues contentValues0 = this.FLD4022;
        if(this.FLD4020 == 0) {
            contentValues0.put(CLS182.MTH3479(v, contentValues0, "endH", 4100845267551310645L), v1);
            ˆٴ0.MTH774();
            return;
        }
        contentValues0.put(CLS182.MTH3479(v, contentValues0, "startH", 4100845379220460341L), v1);
        ˆٴ0.MTH774();
    }
}

