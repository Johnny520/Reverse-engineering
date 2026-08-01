// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.ContentValues;
import android.widget.TimePicker;
import b.ᐧˉ.CLS182;

public final class CLS549 implements TimePickerDialog.OnTimeSetListener {
    public final int FLD5365;
    public final CLS536 FLD5366;

    public CLS549(CLS536 ˉˏ0, int v) {
        this.FLD5365 = v;
        this.FLD5366 = ˉˏ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.app.TimePickerDialog$OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker0, int v, int v1) {
        CLS536 ˉˏ0 = this.FLD5366;
        if(this.FLD5365 == 0) {
            ˉˏ0.FLD5206 = v;
            ˉˏ0.FLD5199 = v1;
            ˉˏ0.MTH7235();
            ContentValues contentValues0 = new ContentValues();
            String s = CLS182.MTH3479(ˉˏ0.FLD5201, contentValues0, "startH", 4101560989491450677L);
            String s1 = CLS182.MTH3479(ˉˏ0.FLD5205, contentValues0, s, 4101560469800407861L);
            contentValues0.put(CLS182.MTH3479(ˉˏ0.FLD5206, contentValues0, s1, 4101560491275244341L), ˉˏ0.FLD5199);
            ˉˏ0.FLD5203.MTH791(contentValues0);
            return;
        }
        ˉˏ0.FLD5201 = v;
        ˉˏ0.FLD5205 = v1;
        ˉˏ0.MTH7235();
        ContentValues contentValues1 = new ContentValues();
        String s2 = CLS182.MTH3479(ˉˏ0.FLD5201, contentValues1, "startH", 4101560542814851893L);
        String s3 = CLS182.MTH3479(ˉˏ0.FLD5205, contentValues1, s2, 4101560572879622965L);
        contentValues1.put(CLS182.MTH3479(ˉˏ0.FLD5206, contentValues1, s3, 4101560594354459445L), ˉˏ0.FLD5199);
        ˉˏ0.FLD5200.MTH791(contentValues1);
    }
}

