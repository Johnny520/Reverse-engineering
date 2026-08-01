// Decompiled by JEB v5.42.0.202606242140

package b.ﾞˎ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;

public final class CLS527 implements View.OnClickListener {
    public final int FLD5162;
    public final Activity FLD5163;
    public final CLS536 FLD5164;

    public CLS527(CLS536 ˉˏ0, Activity activity0, int v) {
        this.FLD5162 = v;
        this.FLD5164 = ˉˏ0;
        this.FLD5163 = activity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS536 ˉˏ0 = this.FLD5164;
        if(this.FLD5162 == 0) {
            ˉˏ0.getClass();
            CLS549 ⁱי0 = new CLS549(ˉˏ0, 1);
            new TimePickerDialog(this.FLD5163, ⁱי0, ˉˏ0.FLD5201, ˉˏ0.FLD5205, true).show();
            return;
        }
        ˉˏ0.getClass();
        CLS549 ⁱי1 = new CLS549(ˉˏ0, 0);
        new TimePickerDialog(this.FLD5163, ⁱי1, ˉˏ0.FLD5206, ˉˏ0.FLD5199, true).show();
    }
}

