// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS3;
import b.ˑٴ.CLS702;
import b.ᐧˉ.CLS182;

public final class CLS407 implements View.OnClickListener {
    public final int FLD3937;
    public final ContentValues FLD3938;
    public final Activity FLD3939;
    public final CLS3 FLD3940;

    public CLS407(Activity activity0, ContentValues contentValues0, CLS702 ˊᵔ0, int v) {
        this.FLD3937 = v;
        this.FLD3939 = activity0;
        this.FLD3938 = contentValues0;
        this.FLD3940 = ˊᵔ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS3 ˆٴ0 = this.FLD3940;
        ContentValues contentValues0 = this.FLD3938;
        if(this.FLD3937 == 0) {
            CLS415 ˉᵎ0 = new CLS415(contentValues0, ˆٴ0, 1);
            int v = CLS182.MTH3474(4100845289026147125L, contentValues0);
            int v1 = CLS182.MTH3474(4100845319090918197L, contentValues0);
            new TimePickerDialog(this.FLD3939, ˉᵎ0, v, v1, true).show();
            return;
        }
        CLS415 ˉᵎ1 = new CLS415(contentValues0, ˆٴ0, 0);
        int v2 = CLS182.MTH3474(4100845752882615093L, contentValues0);
        int v3 = CLS182.MTH3474(4100845224601637685L, contentValues0);
        new TimePickerDialog(this.FLD3939, ˉᵎ1, v2, v3, true).show();
    }
}

