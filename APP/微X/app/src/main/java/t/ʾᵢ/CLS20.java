// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import java.util.ArrayList;
import t.ˆʿ.CLS43;
import t.ˆٴ.CLS70;
import t.ⁱʾ.CLS141;

public final class CLS20 implements AdapterView.OnItemLongClickListener {
    public final CLS216 FLD286;
    public final ArrayList FLD287;
    public final Activity FLD288;
    public final CLS70 FLD289;

    public CLS20(CLS216 ˎﾞ0, Activity activity0, ArrayList arrayList0, CLS70 ﾞٴ0) {
        this.FLD286 = ˎﾞ0;
        this.FLD288 = activity0;
        this.FLD287 = arrayList0;
        this.FLD289 = ﾞٴ0;
    }

    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.FLD286.getClass();
        CLS197 ˉᵎ0 = new CLS197(this.FLD287, v, this.FLD289);
        CLS43.MTH1416(this.FLD288, ((CLS141)ˉᵎ0));
        return false;
    }
}

