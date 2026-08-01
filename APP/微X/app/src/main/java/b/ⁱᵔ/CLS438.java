// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1626;
import java.util.Calendar;

public final class CLS438 implements View.OnClickListener {
    public final int FLD4200;
    public final Calendar FLD4201;
    public final Activity FLD4202;
    public final CLS1626 FLD4203;

    public CLS438(Activity activity0, Calendar calendar0, CLS1626 ـﹳ0, int v) {
        this.FLD4200 = v;
        this.FLD4202 = activity0;
        this.FLD4201 = calendar0;
        this.FLD4203 = ـﹳ0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS1626 ـﹳ0 = this.FLD4203;
        Calendar calendar0 = this.FLD4201;
        switch(this.FLD4200) {
            case 0: {
                try {
                    CLS490 ᵎⁱ0 = new CLS490(calendar0, ـﹳ0, 1);
                    int v2 = calendar0.get(1);
                    int v3 = calendar0.get(2);
                    int v4 = calendar0.get(5);
                    new DatePickerDialog(this.FLD4202, ᵎⁱ0, v2, v3, v4).show();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                CLS393 ʾⁱ1 = new CLS393(calendar0, ـﹳ0, 1);
                int v5 = calendar0.get(11);
                int v6 = calendar0.get(12);
                new TimePickerDialog(this.FLD4202, ʾⁱ1, v5, v6, true).show();
                return;
            }
            case 2: {
                try {
                    CLS490 ᵎⁱ1 = new CLS490(calendar0, ـﹳ0, 0);
                    int v7 = calendar0.get(1);
                    int v8 = calendar0.get(2);
                    int v9 = calendar0.get(5);
                    new DatePickerDialog(this.FLD4202, ᵎⁱ1, v7, v8, v9).show();
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            default: {
                CLS393 ʾⁱ0 = new CLS393(calendar0, ـﹳ0, 0);
                int v = calendar0.get(11);
                int v1 = calendar0.get(12);
                new TimePickerDialog(this.FLD4202, ʾⁱ0, v, v1, true).show();
            }
        }
    }
}

