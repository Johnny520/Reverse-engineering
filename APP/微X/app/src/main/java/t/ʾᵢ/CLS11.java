// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆٴ.CLS73;
import t.ⁱʾ.CLS141;

public final class CLS11 implements AdapterView.OnItemLongClickListener {
    public final int FLD142;
    public final ArrayList FLD143;
    public final Activity FLD144;
    public final CLS216 FLD145;
    public final ArrayList FLD146;
    public final CLS73 FLD147;

    public CLS11(int v, Activity activity0, CLS73 ﾞᐧ0, CLS216 ˎﾞ0, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD142 = v;
        this.FLD145 = ˎﾞ0;
        this.FLD144 = activity0;
        this.FLD146 = arrayList0;
        this.FLD143 = arrayList1;
        this.FLD147 = ﾞᐧ0;
        super();
    }

    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        CLS73 ﾞᐧ0 = this.FLD147;
        ArrayList arrayList0 = this.FLD143;
        ArrayList arrayList1 = this.FLD146;
        Activity activity0 = this.FLD144;
        CLS216 ˎﾞ0 = this.FLD145;
        switch(this.FLD142) {
            case 0: {
                ˎﾞ0.getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS193(arrayList1, v, arrayList0, ﾞᐧ0)));
                return true;
            }
            case 1: {
                ˎﾞ0.getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS214(arrayList1, v, arrayList0, ﾞᐧ0)));
                return true;
            }
            default: {
                ˎﾞ0.getClass();
                CLS43.MTH1416(activity0, ((CLS141)new CLS213(ˎﾞ0, this.FLD146, v, this.FLD143, this.FLD147)));
                return true;
            }
        }
    }
}

