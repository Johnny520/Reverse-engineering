// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ﾞˎ.CLS1626;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public final class CLS383 implements View.OnClickListener {
    public final CLS359 FLD3568;
    public final SimpleDateFormat FLD3569;
    public final ArrayList FLD3570;
    public final Activity FLD3571;
    public final String[] FLD3572;
    public final CLS1626 FLD3573;
    public final String[] FLD3574;
    public final CLS396 FLD3575;

    public CLS383(SimpleDateFormat simpleDateFormat0, String[] arr_s, Activity activity0, CLS1626 ـﹳ0, ArrayList arrayList0, CLS396 ʿʽ0, String[] arr_s1, CLS359 ⁱˉ0) {
        this.FLD3569 = simpleDateFormat0;
        this.FLD3572 = arr_s;
        this.FLD3571 = activity0;
        this.FLD3573 = ـﹳ0;
        this.FLD3570 = arrayList0;
        this.FLD3575 = ʿʽ0;
        this.FLD3574 = arr_s1;
        this.FLD3568 = ⁱˉ0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        try {
            Calendar calendar0 = Calendar.getInstance();
            calendar0.setTime(this.FLD3569.parse(this.FLD3572[0]));
            CLS469 ٴˈ0 = new CLS469(this.FLD3568, this.FLD3573, this.FLD3575, this.FLD3569, this.FLD3570, this.FLD3572, this.FLD3574);
            int v = calendar0.get(1);
            int v1 = calendar0.get(2);
            int v2 = calendar0.get(5);
            new DatePickerDialog(this.FLD3571, ٴˈ0, v, v1, v2).show();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

